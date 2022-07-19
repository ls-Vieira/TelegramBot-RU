package entities;

public class Frases {

		private String start = "Oi, me chamo UfvRuBot e sou um bot dos refeit�rios universit�rios da UFV! \uD83E\uDD16 \n\n"
							 + "Estou aqui para te dar suporte com alguns dos nossos principais servi�os \n\n"
							 + "Por favor, digite um comando presente na aba 'Menu' para que eu possa te ajudar.\n";
		
		private String cardapio = "Aqui est� o card�pio do Dia \uD83C\uDF74";
		
		private String alterarPref = "Alterar suas prefer�ncias:\n\n"
								   + "Escolha uma das op��es abaixo para continuarmos\n"
								   + "1.Alterar Sua Semana \uD83D\uDCC5 \n"
								   + "2.Alterar Comida Preferida \uD83C\uDF7D\uFE0F \n"
								   + "3.Ativar Veganismo \uD83E\uDD66 \n"
								   + "4.Voltar \uD83D\uDD19";
		
		private String desligar = "Voce tem certeza que deseja desativar sua conta com o UfvRuBot?\n\n"
								+ "\u26A0\uFE0F ATEN��O \u26A0\uFE0F \n"
								+ "Ap�s a confirma��o, voc� n�o receber� mais notifica��es dos card�pios "
								+ "e todas suas prefer�ncias ser�o apagadas!!\n\n"
								+ "1.Sim, tenho certeza\n"
								+ "2.N�o, cancele essa opera��o";
		
		private String desligarOp1 = "\u2705 Bot desativado com sucesso!\n"
								   + "Esperamos que volte em breve!!";
		
		private String opCancelada = "\u2705 Opera��o cancelada!";
		
		private String erroComando = "\u26D4 A��o inv�lida! Por favor digite um comando presente na aba 'Menu' ao lado de seu chat";
		
		private String erroOp = "\u26D4 A��o inv�lida! Por favor informe o n�mero da Op��o que deseja!";
		
		private String erroAcesso = "\u26D4 A��o inv�lida! Por favor termine a opera��o antes de tentar acessar outra!";
		
		private String naoImplementado = "A��o ainda n�o implementada!";
		
		
		public Frases() {
			super();
		}

		public String getStart() {
			return start;
		}

		public String getCardapio() {
			return cardapio;
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
		
		public String getNaoImplementado() {
			return naoImplementado;
		}
}
