package application;

import entities.Frases;

public class UI {
	
	public static Frases fr = new Frases();
	private static boolean isAlterPref = false;
	private static boolean isDesligar = false;
	
	public static String resposta(String comando) {
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
	
	public static String respostaComando(String comando) {
		String mensagemResp;

		if (comando.equals("/start")) {
			mensagemResp = fr.getStart();

		} else if (comando.equals("/cardapio")) {
			mensagemResp = fr.getErroCardapio();
	
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
		
	public static String respostaAltPrefOp(String comando) {
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
	
	public static String respostaDesligar(String comando) {
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
