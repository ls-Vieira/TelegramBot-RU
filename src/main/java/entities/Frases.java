package entities;

public class Frases {

	private String start = "Oi, estou feliz voltou!! \uD83D\uDE00 \n\n"
						 + "Pelos meus registro voc� j� possuiu um cadastro, caso queira atualiza-lo digite '/alterarpref' "
						 + "ou procure o comando na aba 'Menu' ao lado do chat.\n\n"
						 + "Voc� tamb�m pode continuar usando nossos servi�os normalmente, Aproveite!!\n";
	
	private String startCadastro = "Oi, me chamo UfvRuBot e sou um bot dos refeit�rios universit�rios da UFV! \uD83E\uDD16 \n\n"
			 					 + "Estou aqui para te dar suporte com alguns dos nossos principais servi�os \n\n"
			 					 + "Antes preciso que cadastre algumas prefer�ncias de usu�rio. Vamos come�ar?!";

	private String cadastraSemana = "Primeiro vamos cadastrar a 'Sua Semana' \uD83D\uDCC5 \n"
								  + "Nela voc� ir� escolher o Dia e em seguida a refei��o sobre a qual deseja receber notifica��o!\n\n"
								  + "Escolha quantas quiser, e quando terminar informe a op��o 'Prosseguir'!!\n\n"
								  + "1.Segunda\n"
								  + "2.Ter�a\n"
								  + "3.Quarta\n"
								  + "4.Quinta\n"
								  + "5.Sexta\n"
								  + "6.S�bado\n"
								  + "7.Domingo\n\n"
								  + "8.Prosseguir \uD83D\uDD1C";
	
	private String cadastraDia = "Refeicao:\n"
							   + "1.Caf� da manh�\n"
							   + "2.Almo�o\n"
							   + "3.Jantar\n"
							   + "4.Marcar Todos\n"
							   + "5.N�o Marcar\n";
	
	private String diaCadastrado = "\u2705 Refeicao e Dia Cadastrado\n\n"
								 + "Escolha outra op��o:\n"
								 + "1.Segunda\n"
								 + "2.Terca\n"
								 + "3.Quarta\n"
								 + "4.Quinta\n"
								 + "5.Sexta\n"
								 + "6.S�bado\n"
								 + "7.Domingo\n\n"
								 + "8.Prosseguir \uD83D\uDD1C";
	
	private String cadastraVegano = "\u2705 Semana cadastrada com sucesso!! \u2705 \n\n"
								  + "Ultima coisa, voc� gostaria de receber notifica��es apenas de comidas veganas e/ou vegetarianas?\n"
								  + "1.Sim\n"
								  + "2.N�o";
	
	private String alterarPref = "Alterar suas prefer�ncias:\n\n" + "Escolha uma das op��es abaixo para continuarmos\n"
							   + "1.Alterar Sua Semana \uD83D\uDCC5 \n" + "2.Alterar Comida Preferida \uD83C\uDF7D\uFE0F \n"
							   + "3.Ativar Veganismo \uD83E\uDD66 \n" + "4.Voltar \uD83D\uDD19";

	private String desligar = "Voce tem certeza que deseja desativar sua conta com o UfvRuBot?\n\n"
							+ "\u26A0\uFE0F ATEN��O \u26A0\uFE0F \n"
							+ "Ap�s a confirma��o, voc� n�o receber� mais notifica��es dos card�pios "
							+ "e todas suas prefer�ncias ser�o apagadas!!\n\n" + "1.Sim, tenho certeza\n"
							+ "2.N�o, cancele essa opera��o";

	private String desligarOp1 = "\u2705 Bot desativado com sucesso!\n" + "Esperamos que volte em breve!!";

	private String veganoOn = "\u2705 Op��o vegana ligada!\n";
	
	private String veganoOff = "\u2705 Op��o vegana desligada!\n";
	
	private String opCancelada = "\u2705 Opera��o cancelada!";

	private String erroComando = "\u26D4 A��o inv�lida! Por favor digite um comando presente na aba 'Menu' ao lado de seu chat";

	private String erroOp = "\u26D4 A��o inv�lida! Por favor informe o n�mero da Op��o que deseja!";

	private String erroAcesso = "\u26D4 A��o inv�lida! Por favor termine a opera��o antes de tentar acessar outra!";

	private String erroAcessoCadastro = "\u26D4 A��o inv�lida! Por favor termine o cadastro antes de tentar acessar outra fun��o!";
	
	private String erroCardapio = "O Card�pio do dia ainda n�o est� dispon�vel!";
	
	private String naoImplementado = "A��o ainda n�o implementada!";

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
