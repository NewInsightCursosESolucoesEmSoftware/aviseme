package br.com.aviseme.controller.implementacao;

import br.com.aviseme.controller.generics.Controller;
import br.com.aviseme.model.persistence.entity.Estado;
import br.com.aviseme.model.service.implementacao.EstadoService;

public class EstadoController extends Controller<Estado,EstadoService>{

	private static final long serialVersionUID = 1L;

	@Override
	protected void inicializarVariavel() {
		limpar();
	}

	@Override
	public void limpar() {
		entidade = new Estado();
	}

	@Override
	public EstadoService getService() {
		return new EstadoService();
	}

}
