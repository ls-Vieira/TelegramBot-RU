package application;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import entities.Frases;

public class UfvRuBot extends TelegramLongPollingBot {
	
	private Frases fr = new Frases();
	private boolean isAlterPref;
	private boolean isDesligar;
	
	public UfvRuBot() {
		super();
		isAlterPref = false;
		isDesligar = false;
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
		
		String mensagemResp = resposta(comando);

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
	
	
	private String resposta(String comando) {
		String mensagemResp;
		
		if (isAlterPref) {
			mensagemResp = respostaAltPrefOp(comando);
			
		} else if (isDesligar) {
			mensagemResp = respostaDesligar(comando);
			
		} else {
			mensagemResp = respostaComando(comando);
		}
		
		return mensagemResp;
	}
	
	private String respostaComando(String comando) {
		String mensagemResp;

		if (comando.equals("/start")) {
			mensagemResp = fr.getStart();

		} else if (comando.equals("/cardapio")) {
			mensagemResp = fr.getCardapio();

		} else if (comando.equals("/alterarpref")) {
			isAlterPref = true;
			mensagemResp = fr.getAlterarPref();

		} else if (comando.equals("/desligar")) {
			isDesligar = true;
			mensagemResp = fr.getDesligar();

		} else {
			mensagemResp = fr.getErroComando();
		}

		return mensagemResp;
	}
	
	private String respostaAltPrefOp(String comando) {
		String mensagemResp;
		
		if (comando.equals("1")) {
			isAlterPref = false;
			mensagemResp = fr.getNaoImplementado();
			
		} else if(comando.equals("2")) {
			isAlterPref = false;
			mensagemResp = fr.getNaoImplementado();
			
		} else if(comando.equals("3")) {
			isAlterPref = false;
			mensagemResp = fr.getNaoImplementado();
			
		} else if(comando.equals("4")) {
			isAlterPref = false;
			mensagemResp = fr.getStart();
			
		} else if(comando.equals("/start") || comando.equals("/cardapio") || comando.equals("/alterarpref") || comando.equals("/desligar")){
			mensagemResp = fr.getErroAcesso();
			
		} else {
			mensagemResp = fr.getErroOp();
		}
		
		return mensagemResp;	
	}
	
	private String respostaDesligar(String comando) {
		String mensagemResp;
		
		if (comando.equals("1")) {
			isDesligar = false;
			mensagemResp = fr.getDesligarOp1();
			
		} else if (comando.equals("2")) {
			isDesligar = false;
			mensagemResp = fr.getOpCancelada();
			
		} else if(comando.equals("/start") || comando.equals("/cardapio") || comando.equals("/alterarpref") || comando.equals("/desligar")){
			mensagemResp = fr.getErroAcesso();
			
		} else {
			mensagemResp = fr.getErroOp();
		}
		
		return mensagemResp;
	}
	
}
