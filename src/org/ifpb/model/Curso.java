package org.ifpb.model;

public class Curso {
	private int id;
	private String nome;

	public Curso(String nome) {
		this.nome = nome;
	}
	
	public Curso(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.getNome();
	}
}
