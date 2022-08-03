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
								  + "8.Limpar Semana\n"
								  + "9.Prosseguir \uD83D\uDD1C";
	
	private String cadastraDia = "Refeição:\n"
							   + "1.Café da manhã\n"
							   + "2.Almoço\n"
							   + "3.Jantar\n"
							   + "4.Marcar Todos\n"
							   + "5.Não Marcar\n";
	
	private String diaCadastrado = "\u2705 Refeição e Dia Cadastrado \u2705 \n\n"
								 + "Escolha outra opção:\n"
								 + "1.Segunda\n"
								 + "2.Terca\n"
								 + "3.Quarta\n"
								 + "4.Quinta\n"
								 + "5.Sexta\n"
								 + "6.Sábado\n"
								 + "7.Domingo\n\n"
								 + "8.Limpar Semana\n"
								 + "9.Prosseguir \uD83D\uDD1C";
	
	private String atualizaSemana = "Atualize 'Sua Semana'\n\n"
								  + "Escolha o o Dia e em seguida a refeição sobre a qual deseja receber notificação! \n"
								  + "1.Segunda\n"
								  + "2.Terça\n"
								  + "3.Quarta\n"
								  + "4.Quinta\n"
								  + "5.Sexta\n"
								  + "6.Sábado\n"
								  + "7.Domingo\n\n"
								  + "8.Limpar Semana\n"
								  + "9.Prosseguir \uD83D\uDD1C";
	
	private String semanaLimpada = "'Sua Semana' agora está vazia, preencha novamente ou escolha prosseguir!\n"
								 + "1.Segunda\n"
								 + "2.Terça\n"
								 + "3.Quarta\n"
								 + "4.Quinta\n"
								 + "5.Sexta\n"
								 + "6.Sábado\n"
								 + "7.Domingo\n\n"
								 + "8.Limpar Semana\n"
								 + "9.Prosseguir \uD83D\uDD1C";
	
	private String semanaAtualizada = "\u2705 Semana atualizada com sucesso! \u2705";
	
	private String cadastraVegano = "\u2705 Semana cadastrada com sucesso!! \u2705 \n\n"
								  + "Ultima coisa, temo uma Opção veganismo \uD83E\uDD66 \n"
								  + "Gostaria de receber notificações apenas de comidas veganas e/ou vegetarianas?\n"
								  + "1.Sim\n"
								  + "2.Não";
	
	private String cadastroFinalizado = "Seu cadastro foi finalizado com sucesso e suas preferências foram salvas!\n"
									  + "Procure na aba 'Menu' ao lado do chat as opções que temos disponíveis para você!\n\n"
									  + "Aproveite!! \uD83D\uDE00";
	
	
	private String alterarPref = "Alterar suas preferências:\n\n" + "Escolha uma das opções abaixo para continuarmos\n"
							   + "1.Alterar Sua Semana \uD83D\uDCC5 \n" + "2.Alterar Comida Preferida \uD83C\uDF7D\uFE0F \n"
							   + "3.Ativar Veganismo \uD83E\uDD66 \n" + "4.Voltar \uD83D\uDD19";

	private String desligar = "Voce tem certeza que deseja desativar sua conta com o UfvRuBot?\n\n"
							+ "\u26A0\uFE0F ATENÇÃO \u26A0\uFE0F \n"
							+ "Após a confirmação, você não receberá mais notificações dos carápios "
							+ "e todas suas preferências serão apagadas!!\n\n" + "1.Sim, tenho certeza\n"
							+ "2.Não, cancele essa operação";

	private String desligarOp1 = "\u2705 Bot desativado com sucesso! \u2705 \n\n" + "Esperamos que volte em breve!!";

	private String veganoOn = "\u2705 Opção vegana ligada! \u2705 \n";
	
	private String veganoOff = "\u2705 Opção vegana desligada! \u2705 \n";
	
	private String opCancelada = "\u2705 Operação cancelada! \u2705";

	private String erroComando = "\u26D4 Ação inválida! Por favor digite um comando presente na aba 'Menu' ao lado de seu chat \u26D4";

	private String erroOp = "\u26D4 Ação inválida! Por favor informe o número da Opção que deseja! \u26D4";

	private String erroAcesso = "\u26D4 Ação inválida! Por favor termine a operação antes de tentar acessar outra! \u26D4";

	private String erroAcessoCadastro = "\u26D4 Ação inválida! Por favor termine o cadastro antes de tentar acessar outra função! \u26D4";
	
	private String erroCardapio = "O Cardápio do dia ainda não está disponível!";
	
	private String naoImplementado = "Ação ainda não implementada!";
	
	private String menu = "Escolha uma opção na aba 'Menu' ao lado do chat!";

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
	
	public String getCadastroFinalizado() {
		return cadastroFinalizado;
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
	
	public String getSemanaAtuzalizada() {
		return semanaAtualizada;
	}
	
	public String getAtualizaSemana() {
		return atualizaSemana;
	}
	
	public String getSemanaLimpada() {
		return semanaLimpada;
	}
	
	public String getMenu() {
		return menu;
	}
}
