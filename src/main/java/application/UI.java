package application;

import entities.Frases;
import entities.Usuario;

public class UI {
		
	public static Frases fr = new Frases();
	
	public static String resposta(String comando, Usuario usuario) {
		String mensagemResp;
		
		if(usuario.isCadastro()) {
			
			if(usuario.getDiaCadastro() == null) {
				mensagemResp = respostaCadastroDia(comando, usuario);
			}else {
				mensagemResp = respostaCadastraRefeicao(comando, usuario);
			}
			
		} else if (usuario.isAlterPref()) {
			
			if(usuario.isOpVegan()) {
				mensagemResp = respostaVegano(comando,usuario);
			}else {
				mensagemResp = respostaAltPrefOp(comando,usuario);
			}
			
		} else if (usuario.isDesligar()) {
			mensagemResp = respostaDesligar(comando,usuario);
			
		} else {
			mensagemResp = respostaComando(comando,usuario);
		}
		
		return mensagemResp;
	}
	
	private static String respostaComando(String comando, Usuario usuario) {
		String mensagemResp;

		if (comando.equals("/start")) {
			mensagemResp = fr.getStartCadastro();

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
		
	private static String respostaCadastroDia(String comando, Usuario usuario) {
		String mensagemResp = fr.getCadastraDia();
		
		if (comando.equals("1")) {
			//Segunda
			usuario.setDiaCadastro(2);
			
		} else if(comando.equals("2")) {
			//Terça
			usuario.setDiaCadastro(3);
			
		} else if(comando.equals("3")) {
			//Quarta
			usuario.setDiaCadastro(4);
			
		} else if(comando.equals("4")) {
			//Quinta
			usuario.setDiaCadastro(5);
			
		} else if(comando.equals("5")) {
			//Sexta
			usuario.setDiaCadastro(6);
			
		} else if(comando.equals("6")) {
			//Sabado
			usuario.setDiaCadastro(0);
			
		} else if(comando.equals("7")) {
			//Domingo
			usuario.setDiaCadastro(1);
			
		} else if(comando.equals("8")) {
			//voltando
			usuario.setAlterPref(true);
			usuario.setOpVegan(true);
			usuario.setCadastro(false);
			mensagemResp = fr.getCadastraVegano();
			
		} else if(comando.equals("/start") || comando.equals("/cardapio") || comando.equals("/alterarpref") || comando.equals("/desligar")){
			mensagemResp = fr.getErroAcessoCadastro();
			
		} else {
			mensagemResp = fr.getErroOp();
		}
		
		return mensagemResp;	
	}
	
	private static String respostaCadastraRefeicao(String comando, Usuario usuario) {
		String mensagemResp = fr.getDiaCadastrado();
		
		if (comando.equals("1")) {
			//cadastra Cafe no DiaCadastro
			usuario.marcaSemana(0, usuario.getDiaCadastro(),true);
			usuario.setDiaCadastro(null);
			
		} else if(comando.equals("2")) {
			//cadastra Almoco no DiaCadastro
			usuario.marcaSemana(1, usuario.getDiaCadastro(),true);
			usuario.setDiaCadastro(null);
			
		} else if(comando.equals("3")) {
			//cadastra Jantar no DiaCadastro
			usuario.marcaSemana(2, usuario.getDiaCadastro(),true);
			usuario.setDiaCadastro(null);
			
		} else if(comando.equals("4")) {
			//cadastra TODAS no DiaCadastro
			usuario.marcaSemana(0, usuario.getDiaCadastro(),true);
			usuario.marcaSemana(1, usuario.getDiaCadastro(),true);
			usuario.marcaSemana(2, usuario.getDiaCadastro(),true);
			usuario.setDiaCadastro(null);
			
		} else if(comando.equals("5")) {
			//NAO CADASTRA
			usuario.marcaSemana(0, usuario.getDiaCadastro(),false);
			usuario.marcaSemana(1, usuario.getDiaCadastro(),false);
			usuario.marcaSemana(2, usuario.getDiaCadastro(),false);
			usuario.setDiaCadastro(null);
		
		} else if(comando.equals("/start") || comando.equals("/cardapio") || comando.equals("/alterarpref") || comando.equals("/desligar")){
			mensagemResp = fr.getErroAcessoCadastro();
			
		} else {
			mensagemResp = fr.getErroOp();
		}
		
		
		return mensagemResp;
	}
	
	private static String respostaAltPrefOp(String comando, Usuario usuario) {
		String mensagemResp;
		
		if (comando.equals("1")) {
			usuario.setAlterPref(false);
			mensagemResp = fr.getNaoImplementado();
			
		} else if(comando.equals("2")) {
			usuario.setAlterPref(false);
			mensagemResp = fr.getNaoImplementado();
			
		} else if(comando.equals("3")) {
			usuario.setOpVegan(true);
			mensagemResp = opVegano(usuario);
			
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
	
	private static String respostaDesligar(String comando, Usuario usuario) {
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
	
	private static String opVegano(Usuario usuario) {
		String mensagem = "Opção vegana está ";
		
		if(usuario.isVegano()) {
			mensagem = mensagem.concat("ligada!\nDeseja desativar?\n");
		}else {
			mensagem = mensagem.concat("desligada!\nDeseja ativar?\n");
		}
		
		mensagem = mensagem.concat("1.Sim\n2.Não");
		
		return mensagem;
	}
	
	private static String respostaVegano(String comando, Usuario usuario) {
		String mensagemResp;
	
		if (comando.equals("1")) {
			usuario.setOpVegan(false);
			usuario.setAlterPref(false);
			
			if(usuario.isVegano()) {
				usuario.setVegano(false);
				mensagemResp = fr.getVeganoOff();
				
			}else {
				usuario.setVegano(true);
				mensagemResp = fr.getVeganoOn();
			}
	
		} else if (comando.equals("2")) {
			usuario.setOpVegan(false);
			usuario.setAlterPref(false);
			
			mensagemResp = fr.getOpCancelada();
			
		} else if(comando.equals("/start") || comando.equals("/cardapio") || comando.equals("/alterarpref") || comando.equals("/desligar")){
			mensagemResp = fr.getErroAcesso();
			
		} else {
			mensagemResp = fr.getErroOp();
		}
		
		return mensagemResp;
	}
	
}
