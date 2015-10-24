package br.com.aviseme.model.persistence.entity;

public enum Tipo {

	LABEL("label"), TEXTBOX("textbox"), COMBOBOX("combobox"), RADIOBUTTON("RADIOBUTTON"), CHECKBOX("checkbox"), BUTTON(
			"button");

	private String tipo;

	private Tipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
