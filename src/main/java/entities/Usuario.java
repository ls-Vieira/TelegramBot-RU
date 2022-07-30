package entities;

import java.util.Objects;

public class Usuario {
	
	private Long id;
	private String nome;
	
	private boolean[][] semana = new boolean[3][7];
	private boolean isVegano;
	
	//variaveis de chat
	private boolean isCadastro =  false;
	private boolean isAlterPref = false;
	private boolean isDesligar = false;
	private boolean isOpVegan = false;
	private Integer diaCadastro = null;
	
	public Usuario() {}
	
	public Usuario(Long id, String nome) {
		this.id = id;
		this.nome = nome;
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
	
	public Integer getDiaCadastro() {
		return diaCadastro;
	}

	public void setDiaCadastro(Integer dia) {
		this.diaCadastro = dia;
	}
	
	public void setOpVegan(boolean isOpVegan) {
		this.isOpVegan = isOpVegan;
	}
		
	public Long getId() {
		return id;
	}

	public void marcaSemana(int li, int col, boolean mark) {
		if(li > 3 || col > 7) {
			System.out.println("ERRO: position");
		}else {
			semana[li][col] = mark;
		}
	}
	
	public boolean verificaDiaRefeicao(int dia, int refeicao) {
		if(dia > 7 ) {
			System.out.println("ERRO: position");
		}else {
			return semana[refeicao][dia];
		}
		return false;
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
