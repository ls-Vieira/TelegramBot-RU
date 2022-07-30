package entities;

public class Frases {

	private String start = "Oi, estou feliz voltou!! \uD83D\uDE00 \n\n"
						 + "Pelos meus registro você já possuiu um cadastro, caso queira atualiza-lo digite '/alterarpref' "
						 + "ou procure o comando na aba 'Menu' ao lado do chat.\n\n"
						 + "Você também pode continuar usando nossos serviços normalmente, Aproveite!!\n";
	
	private String startCadastro = "Oi, me chamo UfvRuBot e sou um bot dos refeitórios universitários da UFV! \uD83E\uDD16 \n\n"
			 					 + "Estou aqui para te dar suporte com alguns dos nossos principais serviços \n\n"
			 					 + "Antes preciso que cadastre algumas preferências de usuário. Vamos começar?!";

	private String cadastraSemana = "Primeiro vamos cadastrar a 'Sua Semana' \uD83D\uDCC5 \n"
								  + "Nela você irá escolher o Dia e em seguida a refeição sobre a qual deseja receber notificação!\n\n"
								  + "Escolha quantas quiser, e quando terminar informe a opção 'Prosseguir'!!\n\n"
								  + "1.Segunda\n"
								  + "2.Terça\n"
								  + "3.Quarta\n"
								  + "4.Quinta\n"
								  + "5.Sexta\n"
								  + "6.Sábado\n"
								  + "7.Domingo\n\n"
								  + "8.Prosseguir \uD83D\uDD1C";
	
	private String cadastraDia = "Refeicao:\n"
							   + "1.Café da manhã\n"
							   + "2.Almoço\n"
							   + "3.Jantar\n"
							   + "4.Marcar Todos\n"
							   + "5.Não Marcar\n";
	
	private String diaCadastrado = "\u2705 Refeicao e Dia Cadastrado\n\n"
								 + "Escolha outra opção:\n"
								 + "1.Segunda\n"
								 + "2.Terca\n"
								 + "3.Quarta\n"
								 + "4.Quinta\n"
								 + "5.Sexta\n"
								 + "6.Sábado\n"
								 + "7.Domingo\n\n"
								 + "8.Prosseguir \uD83D\uDD1C";
	
	private String cadastraVegano = "\u2705 Semana cadastrada com sucesso!! \u2705 \n\n"
								  + "Ultima coisa, você gostaria de receber notificações apenas de comidas veganas e/ou vegetarianas?\n"
								  + "1.Sim\n"
								  + "2.Não";
	
	private String alterarPref = "Alterar suas preferências:\n\n" + "Escolha uma das opções abaixo para continuarmos\n"
							   + "1.Alterar Sua Semana \uD83D\uDCC5 \n" + "2.Alterar Comida Preferida \uD83C\uDF7D\uFE0F \n"
							   + "3.Ativar Veganismo \uD83E\uDD66 \n" + "4.Voltar \uD83D\uDD19";

	private String desligar = "Voce tem certeza que deseja desativar sua conta com o UfvRuBot?\n\n"
							+ "\u26A0\uFE0F ATENÇÃO \u26A0\uFE0F \n"
							+ "Após a confirmação, você não receberá mais notificações dos cardápios "
							+ "e todas suas preferências serão apagadas!!\n\n" + "1.Sim, tenho certeza\n"
							+ "2.Não, cancele essa operação";

	private String desligarOp1 = "\u2705 Bot desativado com sucesso!\n" + "Esperamos que volte em breve!!";

	private String veganoOn = "\u2705 Opção vegana ligada!\n";
	
	private String veganoOff = "\u2705 Opção vegana desligada!\n";
	
	private String opCancelada = "\u2705 Operação cancelada!";

	private String erroComando = "\u26D4 Ação inválida! Por favor digite um comando presente na aba 'Menu' ao lado de seu chat";

	private String erroOp = "\u26D4 Ação inválida! Por favor informe o número da Opção que deseja!";

	private String erroAcesso = "\u26D4 Ação inválida! Por favor termine a operação antes de tentar acessar outra!";

	private String erroAcessoCadastro = "\u26D4 Ação inválida! Por favor termine o cadastro antes de tentar acessar outra função!";
	
	private String erroCardapio = "O Cardápio do dia ainda não está disponível!";
	
	private String naoImplementado = "Ação ainda não implementada!";

	public Frases() {
		super();
	}

	public String getStart() {
		return start;
	}

	public String getStartCadastro() {
		return startCadastro;
	}
	
	public String getCadastraSemana() {
		return cadastraSemana;
	}
	
	public String getDiaCadastrado() {
		return diaCadastrado;
	}
	
	public String getCadastraDia() {
		return cadastraDia;
	}
	
	public String getAlterarPref() {
		return alterarPref;
	}

	public String getDesligar() {
		return desligar;
	}

	public String getDesligarOp1() {
		return desligarOp1;
	}

	public String getVeganoOn() {
		return veganoOn;
	}
	
	public String getVeganoOff() {
		return veganoOff;
	}
	
	public String getOpCancelada() {
		return opCancelada;
	}

	public String getErroComando() {
		return erroComando;
	}

	public String getErroOp() {
		return erroOp;
	}

	public String getErroAcesso() {
		return erroAcesso;
	}
	
	public String getErroAcessoCadastro() {
		return erroAcessoCadastro;
	}
	
	public String getErroCardapio() {
		return erroCardapio;
	}

	public String getNaoImplementado() {
		return naoImplementado;
	}
	
	public String getCadastraVegano() {
		return cadastraVegano;
	}
}
