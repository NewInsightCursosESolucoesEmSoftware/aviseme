package br.com.aviseme.model.persistence.entity;

public enum Acao {
	CLICK("click"),SENDKEYS("sendKeys");
	
	private String acao;
	
	private Acao(String acao){
		this.acao = acao;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}
	
}
