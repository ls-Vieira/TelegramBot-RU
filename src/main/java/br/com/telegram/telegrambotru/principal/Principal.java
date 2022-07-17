package br.com.telegram.telegrambotru.principal;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import br.com.telegram.telegrambotru.controller.UfvRuBot;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(new UfvRuBot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

	}

}
