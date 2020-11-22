package org.ifpb.model;

public class Aluno {
	private int id;
	private String nome;
	private String rg;
	private String cpf;
	private int turmaId;
	
	public Aluno(int id, String nome, String rg, String cpf, int turmaId) {
		this.id = id;
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.turmaId = turmaId;
	}
	
	public Aluno(String nome, String rg, String cpf, int turmaId) {
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.turmaId = turmaId;
	}

	public String getRg() {
		return rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getTurmaId() {
		return turmaId;
	}
	
	public void setTurmaId(int turmaId) {
		this.turmaId = turmaId;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.getNome() + " RG: " + this.getRg() + " CPF: " + this.getCpf();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
