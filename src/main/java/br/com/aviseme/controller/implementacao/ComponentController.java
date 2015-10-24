package br.com.aviseme.controller.implementacao;

import br.com.aviseme.controller.generics.Controller;
import br.com.aviseme.model.persistence.entity.Component;
import br.com.aviseme.model.service.implementacao.ComponentService;

public class ComponentController extends Controller<Component,ComponentService>{

	private static final long serialVersionUID = -4092285365805662299L;

	@Override
	protected void inicializarVariavel() {
		limpar();
	}

	@Override
	public void limpar() {
		entidade = new Component();
	}

	@Override
	public ComponentService getService() {
		return new ComponentService();
	}

}
