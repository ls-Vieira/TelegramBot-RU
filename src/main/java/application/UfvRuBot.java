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
import entities.Usuario;

public class UfvRuBot extends TelegramLongPollingBot {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	// -------------------------------ATENCAO----------------------------------------------------
	// a variavel inPath espera o caminho do arquivo do cardapio.csv
	// MUDE O CAMINHO CASO NECESSARIO
	private static String inPath = "C:\\ws-eclipse-BOT\\telegram-bot-ru\\src\\main\\resources\\cardapio.csv";

	private Date dataAtual = new Date();
	private List<Cardapio> cardapios = new ArrayList<>();
	private List<Usuario> usuarios = new ArrayList<>();

	public UfvRuBot() throws ParseException {
		super();
		geraCardapio(inPath);
	}

	@Override
	public void onUpdateReceived(Update update) {

		Long idChat = update.getMessage().getChatId();
		String nomeUs = update.getMessage().getFrom().getFirstName();
		
		Usuario novoUsuario = new Usuario(idChat,nomeUs);

		// ADICIONANDO E PROCURANDO O USUARIO
		boolean adicionou = addUsuario(novoUsuario);
		int posUsuario = procuraUsuario(idChat, nomeUs);
		//

		// LENDO COMANDO E RESPONDENDO
		String comando = update.getMessage().getText();
		String mensagemResp = UI.resposta(comando, usuarios.get(posUsuario));
		//
		
		if(testaCasosEspeciais(comando,usuarios.get(posUsuario),adicionou,mensagemResp) != null) {
			mensagemResp = testaCasosEspeciais(comando,usuarios.get(posUsuario),adicionou,mensagemResp);
		}
		
		if(adicionou) {
			enviaMensagem(mensagemResp, idChat);
			mensagemResp = comecaCadastro(usuarios.get(posUsuario));
		}
		
		enviaMensagem(mensagemResp, idChat);
		
		//Removendo usuario caso Opcao
		if(mensagemResp.equals(UI.fr.getDesligarOp1())) {
			removeUsuario(usuarios.get(posUsuario));
		}
	}

	// -------------------------------ATENCAO----------------------------------------------------
	@Override // Coloque o UserName do bot (dadosBot.txt no arquivo .zip)
	public String getBotUsername() {
		return null;
	}

	// -------------------------------ATENCAO----------------------------------------------------
	@Override // Coloque o Token do Bot (dadosBot.txt no arquivo .zip)
	public String getBotToken() {
		return null;
	}

	private void enviaMensagem(String mensagem, Long idChat) {
		SendMessage resposta = new SendMessage();

		resposta.setChatId(idChat);// ID Chat
		resposta.setText(mensagem);

		try {
			execute(resposta);
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
	}

	private String testaCasosEspeciais(String comando, Usuario usuario, boolean adicionou, String mensagemResp) {
		String novaMensagem = null;
		
		// CASO ESPECIAL USUARIO CADASTRADO MAS LIMPOU O CHAT
		if (!adicionou && mensagemResp.equals(UI.fr.getStartCadastro())) {
			novaMensagem = UI.fr.getStart();
		}
		
		// CASO ESPECIAL USARIO "PULOU" O CADASTRO
		if (adicionou && !mensagemResp.equals(UI.fr.getStartCadastro())) {
			novaMensagem = UI.fr.getStartCadastro();
		}
		
		// CASO ESPECIAL RESPONDENDO CARDAPIO
		if (comando.equals("/cardapio") && mensagemResp.equals(UI.fr.getErroCardapio())) {
			int posCardapioAtual = procuraCardapio(dataAtual);

			if (posCardapioAtual != -1) {
				novaMensagem = cardapios.get(posCardapioAtual).toString();
			}
		}
		
		// CASO ESPECIAL MOSTRANDO SEMANA
		if(mensagemResp.equals(UI.fr.getDiaCadastrado()) || mensagemResp.equals(UI.fr.getSemanaLimpada())) {
			enviaMensagem(usuario.printSemana(),usuario.getId());
		}
		
		return novaMensagem;
	}
	
	private String comecaCadastro(Usuario usuario) {
		usuario.setCadastro(true);
		
		return UI.fr.getCadastraSemana();
	}
	
	private void geraCardapio(String inPath) throws ParseException {
		try (BufferedReader br = new BufferedReader(new FileReader(inPath))) {

			String line = br.readLine();

			while (line != null) {

				String[] vect = line.split(",");

				Date data = sdf.parse(vect[0]);
				Cardapio cardapio = new Cardapio(data);

				boolean isCafe = false, isAlmoco = false, isJantar = false;

				for (String s : vect) {

					if (s.equals("CAFE")) {
						isCafe = true;
					} else if (s.equals("ALMOCO")) {
						isCafe = false;
						isAlmoco = true;
					} else if (s.equals("JANTAR")) {
						isCafe = false;
						isAlmoco = false;
						isJantar = true;
					}

					if (isCafe) {
						cardapio.addCafe(s);
					} else if (isAlmoco) {
						cardapio.addAlmoco(s);
					} else if (isJantar) {
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

		for (Cardapio c : cardapios) {
			if (sdf.format(c.getData()).equals(sdf.format(data))) {
				return cardapios.indexOf(c);
			}
		}

		return -1;
	}

	private boolean addUsuario(Usuario usuario) {
		if (!usuarios.contains(usuario)) {
			usuarios.add(usuario);
			return true;
		}

		return false;
	}

	private boolean removeUsuario(Usuario usuario) {
		return usuarios.remove(usuario);
	}
	
	private int procuraUsuario(Long id, String nome) {
		Usuario usuario = new Usuario(id, nome);
		if (usuarios.contains(usuario)) {
			return usuarios.indexOf(usuario);
		}

		return -1;
	}

}
