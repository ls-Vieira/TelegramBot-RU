package application;

import entities.Frases;
import entities.Usuario;

public class UI {
		
	public static Frases fr = new Frases();
	
	public static String resposta(String comando, Usuario usuario) {
		String mensagemResp;
		
		if (usuario.isAlterPref()) {
			mensagemResp = respostaAltPrefOp(comando,usuario);
			
		} else if (usuario.isDesligar()) {
			mensagemResp = respostaDesligar(comando,usuario);
			
		} else {
			mensagemResp = respostaComando(comando,usuario);
		}
		
		return mensagemResp;
	}
	
	public static String respostaComando(String comando, Usuario usuario) {
		String mensagemResp;

		if (comando.equals("/start")) {
			mensagemResp = fr.getStart();

		} else if (comando.equals("/cardapio")) {
			mensagemResp = fr.getErroCardapio();
	
		} else if (comando.equals("/alterarpref")) {
			usuario.setAlterPref(true);
			mensagemResp = fr.getAlterarPref();

		} else if (comando.equals("/desligar")) {
			usuario.setDesligar(true);
			mensagemResp = fr.getDesligar();

		} else {
			mensagemResp = fr.getErroComando();
		}

		return mensagemResp;
	}
		
	public static String respostaAltPrefOp(String comando, Usuario usuario) {
		String mensagemResp;
		
		if (comando.equals("1")) {
			usuario.setAlterPref(false);
			mensagemResp = fr.getNaoImplementado();
			
		} else if(comando.equals("2")) {
			usuario.setAlterPref(false);
			mensagemResp = fr.getNaoImplementado();
			
		} else if(comando.equals("3")) {
			usuario.setAlterPref(false);
			mensagemResp = fr.getNaoImplementado();
			
		} else if(comando.equals("4")) {
			usuario.setAlterPref(false);
			mensagemResp = fr.getStart();
			
		} else if(comando.equals("/start") || comando.equals("/cardapio") || comando.equals("/alterarpref") || comando.equals("/desligar")){
			mensagemResp = fr.getErroAcesso();
			
		} else {
			mensagemResp = fr.getErroOp();
		}
		
		return mensagemResp;	
	}
	
	public static String respostaDesligar(String comando, Usuario usuario) {
		String mensagemResp;
		
		if (comando.equals("1")) {
			usuario.setDesligar(false);
			mensagemResp = fr.getDesligarOp1();
			
		} else if (comando.equals("2")) {
			usuario.setDesligar(false);
			mensagemResp = fr.getOpCancelada();
			
		} else if(comando.equals("/start") || comando.equals("/cardapio") || comando.equals("/alterarpref") || comando.equals("/desligar")){
			mensagemResp = fr.getErroAcesso();
			
		} else {
			mensagemResp = fr.getErroOp();
		}
		
		return mensagemResp;
	}
}
