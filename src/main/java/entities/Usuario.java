package entities;

import java.util.Objects;

public class Usuario {
	
	private Long id;
	private String nome;
	
	private boolean[][] semana;
	private boolean isVegano;
	
	//variaveis de chat
	private boolean isCadastro = false;
	private boolean isAlterPref = false;
	private boolean isDesligar = false;
	private boolean isOpVegan = false;
	private boolean isOpSemana = false;
	private Integer diaCadastro = null;
	
	public Usuario() {}
	
	public Usuario(Long id, String nome) {
		this.id = id;
		this.nome = nome;
		this.semana = new boolean[3][7];
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isVegano() {
		return isVegano;
	}
	
	public void setVegano(boolean isVegano) {
		this.isVegano = isVegano;
	}
	
	public boolean isCadastro() {
		return isCadastro;
	}
	
	public void setCadastro(boolean isCadastro) {
		this.isCadastro = isCadastro;
	}
	
	public boolean isAlterPref() {
		return isAlterPref;
	}
	
	public void setAlterPref(boolean isAlterPref) {
		this.isAlterPref = isAlterPref;
	}

	public boolean isDesligar() {
		return isDesligar;
	}

	public void setDesligar(boolean isDesligar) {
		this.isDesligar = isDesligar;
	}

	public boolean isOpVegan() {
		return isOpVegan;
	}
	
	public void setOpVegan(boolean isOpVegan) {
		this.isOpVegan = isOpVegan;
	}
	
	public boolean isOpSemana() {
		return isOpSemana;
	}
	
	public void setOpSemana(boolean isOpSemana) {
		this.isOpSemana = isOpSemana;
	}
	
	public Integer getDiaCadastro() {
		return diaCadastro;
	}

	public void setDiaCadastro(Integer dia) {
		this.diaCadastro = dia;
	}
		
	public Long getId() {
		return id;
	}

	public void marcaSemana(int li, int col, boolean mark) {
		if(li > 3 || col > 7) {
			System.out.println("ERRO: position");
		}else {
			this.semana[li][col] = mark;
		}
	}
	
	public void zeraSemana() {
		for(int i=0; i<3; i++) {
			for(int j=0; j<7; j++) {
				semana[i][j] = false;
			}
		}
	}
	
	public String printSemana() {
		String Semana =
		  "Sua semana até o momento: \n\n"
		+ "Segunda: "+confereDia(2)
		+ "Terca: "+confereDia(3)
		+ "Quarta: "+confereDia(4)
		+ "Quinta: "+confereDia(5)
		+ "Sexta: "+confereDia(6)
		+ "Sábado: "+confereDia(0)
		+ "Domingo: "+confereDia(1);
		
		return Semana;
	}
	
	private String confereDia(int dia) {
		if(semana[0][dia] && semana[1][dia] && semana[2][dia]) {
			return "Café da manhã, Almoço, Jantar\n";
			
		} else if(semana[0][dia] && semana[1][dia]) {
			return "Café da manhã, Almoço\n";
			
		} else if(semana[0][dia] && semana[2][dia]) {
			return "Café da manhã,Jantar\n";
			
		} else if(semana[1][dia] && semana[2][dia]) {
			return "Almoço, Jantar\n";
			
		} else if(semana[0][dia]) {
			return "Café da manhã\n";
			
		} else if(semana[1][dia]) {
			return "Almoço\n";
			
		} else if(semana[2][dia]) {
			return "Jantar\n";
			
		}else {
			return "Sem refeição\n";
		}
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(id, other.id);
	}

}
