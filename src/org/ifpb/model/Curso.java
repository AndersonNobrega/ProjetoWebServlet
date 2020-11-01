package org.ifpb.model;

public class Curso {
	private String nome;

	public Curso(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.getNome();
	}
}
