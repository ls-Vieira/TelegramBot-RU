package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import entities.Cardapio;

public class UfvRuBot extends TelegramLongPollingBot {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dataAtual = new Date();
	private List<Cardapio> cardapios = new ArrayList<>();
	
	public UfvRuBot() throws ParseException {
		super();
		geraCardapio("C:\\ws-eclipse-BOT\\telegram-bot-ru\\src\\main\\resources\\cardapio.csv");
	}

	@Override
	public void onUpdateReceived(Update update) {
		
		/*//Dados do bot (import/java.util.Date e /java.text.SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date msgDate = new Date(update.getMessage().getDate().longValue()*1000); //to milliseconds
		System.out.println("------------DADOS-------------");
		System.out.println("Texto:" + update.getMessage().getText());
		System.out.println("idChat:" + update.getMessage().getChatId());
		System.out.println("Nome:" + update.getMessage().getFrom().getFirstName());
		System.out.println("Data:" + sdf.format(msgDate));
		System.out.println("------------------------------");
		*/
		
		String comando = update.getMessage().getText();
		
		String mensagemResp = UI.resposta(comando);
		
		if(comando.equals("/cardapio")) {
			int posCardapioAtual = procuraCardapio(dataAtual);
			
			if(posCardapioAtual != -1) {
				mensagemResp = cardapios.get(posCardapioAtual).toString();
			}
		}

		SendMessage resposta = new SendMessage();
		
		resposta.setChatId(update.getMessage().getChatId());//ID Chat
		resposta.setText(mensagemResp);
		
		try {
			execute(resposta);
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getBotUsername() {
		return null;
	}

	@Override
	public String getBotToken() {
		return null;
	}
	
	private void geraCardapio(String inPath) throws ParseException {
		try (BufferedReader br = new BufferedReader(new FileReader(inPath))) {

			String line = br.readLine();

			while (line != null) {

				String[] vect = line.split(",");

				Date data = sdf.parse(vect[0]);
				Cardapio cardapio = new Cardapio(data);
				
				boolean isCafe = false, isAlmoco = false, isJantar = false;
			
				for(String s : vect) {

					if(s.equals("CAFE")) {
						isCafe = true;
					}else if(s.equals("ALMOCO")) {
						isCafe = false;
						isAlmoco = true;
					}else if(s.equals("JANTAR")) {
						isCafe = false;
						isAlmoco = false;
						isJantar = true;
					}
					
					if(isCafe) {
						cardapio.addCafe(s);
					}else if(isAlmoco) {
						cardapio.addAlmoco(s);
					}else if(isJantar) {
						cardapio.addJantar(s);
					}
				}
			
				cardapios.add(cardapio);
				
				line = br.readLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	private int procuraCardapio(Date data) {
		
		for(Cardapio c : cardapios) {
			if(sdf.format(c.getData()).equals(sdf.format(data))) {
				return cardapios.indexOf(c);
			}
		}
		
		return -1;
	}
}
