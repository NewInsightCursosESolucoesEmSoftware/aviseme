package br.com.aviseme.model.persistence.entity;

public class Component extends EntidadeBase{


	private static final long serialVersionUID = 8731635848910967233L;
	private Long id;
	private String nome;
	private String seletor;
	private String valor;
	private Tipo tipo;
	private Acao acao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSeletor() {
		return seletor;
	}

	public void setSeletor(String seletor) {
		this.seletor = seletor;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Acao getAcao() {
		return acao;
	}

	public void setAcao(Acao acao) {
		this.acao = acao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Component other = (Component) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Id: " + id +
		"\nnome: "+ nome +
		"\nseletor: " + seletor+
		"\nvalor: " + valor + 
		"\ntipo: " + tipo.getTipo() +
		"\nacao: " + acao.getAcao();
	}
}
