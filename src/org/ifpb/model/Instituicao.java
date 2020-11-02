package org.ifpb.model;

public class Instituicao {
	private int id;
	private String nome;
	private String reitor;
	private String cnpj;
	
	public Instituicao(String nome, String reitor, String cnpj) {
		this.nome = nome;
		this.reitor = reitor;
		this.cnpj = cnpj;
	}
	
	public Instituicao(int id, String nome, String reitor, String cnpj) {
		this.id = id;
		this.nome = nome;
		this.reitor = reitor;
		this.cnpj = cnpj;
	}

	public String getReitor() {
		return reitor;
	}
	
	public void setReitor(String reitor) {
		this.reitor = reitor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.getNome() + " Reitor: " + this.getReitor() + " CNPJ: " + this.getCnpj();
	}
}
