package org.ifpb.model;

public class CursoOfertado {
	private String coordenador;
	private int vagas;
	private int instituicaoId;
	private int cursoId;

	public CursoOfertado(String coordenador, int vagas, int instituicaoId, int cursoId) {
		this.coordenador = coordenador;
		this.vagas = vagas;
		this.instituicaoId = instituicaoId;
		this.cursoId = cursoId;
	}

	public String getCoordenador() {
		return coordenador;
	}
	
	public void setCoordenador(String coordenador) {
		this.coordenador = coordenador;
	}
	
	public int getVagas() {
		return vagas;
	}
	
	public void setVagas(int vagas) {
		this.vagas = vagas;
	}
	
	public int getInstituicaoId() {
		return instituicaoId;
	}
	
	public void setInstituicaoId(int instituicaoId) {
		this.instituicaoId = instituicaoId;
	}
	
	public int getCursoId() {
		return cursoId;
	}
	
	public void setCursoId(int cursoId) {
		this.cursoId = cursoId;
	}
	
	@Override
	public String toString() {
		return "Coordenador: " + this.getCoordenador() + " Vagas: " + this.getVagas();
	}
}
