package br.com.aviseme.model.persistence.entity;

import java.io.Serializable;

public abstract class EntidadeBase implements Serializable {

	private static final long serialVersionUID = -8580465182969898245L;
	protected boolean ativo;
	protected int version;

	public abstract void setId(Long id);

	public abstract Long getId();

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

}
