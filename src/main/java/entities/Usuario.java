package entities;

import java.util.Objects;

public class Usuario {
	
	private Long id;
	private String nome;
	
	//variaveis de chat
	private boolean isAlterPref = false;
	private boolean isDesligar = false;
	
	
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

	public Long getId() {
		return id;
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
