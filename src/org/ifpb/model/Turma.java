package org.ifpb.model;

public class Turma {
	private int id;
	private int vagas;
	private int cursoOfertadoId;
	
	public Turma(int vagas, int cursoOfertadoId) {
		this.vagas = vagas;
		this.cursoOfertadoId = cursoOfertadoId;
	}
	
	public Turma(int id ,int vagas, int cursoOfertadoId) {
		this.id = id;
		this.vagas = vagas;
		this.cursoOfertadoId = cursoOfertadoId;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public int getCursoOfertadoId() {
		return cursoOfertadoId;
	}
	
	public void setCursoOfertadoId(int cursoOfertadoId) {
		this.cursoOfertadoId = cursoOfertadoId;
	}
	
	public int getVagas() {
		return vagas;
	}
	
	public void setVagas(int vagas) {
		this.vagas = vagas;
	}
	
	@Override
	public String toString() {
		return "Vagas: " + this.getVagas();
	}
}
