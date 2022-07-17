package br.com.telegram.telegrambotru.controller;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class UfvRuBot extends TelegramLongPollingBot {

	@Override
	public void onUpdateReceived(Update update) {
		
		/* Dados do bot (import/java.util.Date e /java.text.SimpleDateFormat
		 	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			Date msgDate = new Date(update.getMessage().getDate().longValue()*1000); //to milliseconds
			System.out.println("------------DADOS-------------");
			System.out.println("Texto:" + update.getMessage().getText());
			System.out.println("idChat:" + update.getMessage().getChatId());
			System.out.println("Nome:" + update.getMessage().getFrom().getFirstName());
			System.out.println("Data:" + sdf.format(msgDate));
			System.out.println("------------------------------");
		 */
		
		String command = update.getMessage().getText();

		sendMessage(update.getMessage().getChatId().toString(),command);
		
	}

	@Override
	public String getBotUsername() {
		return null;
	}

	@Override
	public String getBotToken() {
		return null;
	}
	
	
	private String generateMessage(String command) {
		String message;

		if (command.equals("/start")) {
			message = "Oi, me chamo UfvRuBot e sou um Bot dos Refeitórios Universitários da UFV! \uD83E\uDD16 \n\n"
					+ "Estou aqui para te dar suporte com alguns dos nossos principais serviços \n\n"
					+ "Por favor, digite um comando presente na aba 'Menu' para que eu possa te ajudar.\n";

		} else if (command.equals("/cardapio")) {
			message = "Esta operação ainda não está disponível";

		} else if (command.equals("/alterarpref")) {
			message = "Esta operação ainda não está disponível";

		} else if (command.equals("/desligar")) {
			message = "Esta operação ainda não está disponível";

		} else {
			message = "Ação inválida! Por favor digite um comando presente na aba 'Menu' ao lado de seu chat";
		}

		return message;
	}
	
	private void sendMessage(String idChat, String command) {
		String message = generateMessage(command);

		SendMessage response = new SendMessage();
		response.setChatId(idChat);
		response.setText(message);

		try {
			execute(response);
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
	}
	
}
