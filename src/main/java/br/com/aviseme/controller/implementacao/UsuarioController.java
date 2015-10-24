package br.com.aviseme.controller.implementacao;

import br.com.aviseme.controller.generics.Controller;
import br.com.aviseme.model.persistence.entity.Usuario;
import br.com.aviseme.model.service.implementacao.UsuarioService;

public class UsuarioController extends Controller<Usuario, UsuarioService> {

	private static final long serialVersionUID = 8988197976833874512L;

	@Override
	protected void inicializarVariavel() {
		limpar();
	}

	@Override
	public void limpar() {
		entidade = new Usuario();
	}

	@Override
	public UsuarioService getService() {
		return new UsuarioService();
	}

}
