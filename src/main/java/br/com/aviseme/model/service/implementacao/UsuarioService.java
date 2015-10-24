package br.com.aviseme.model.service.implementacao;

import java.util.List;

import br.com.aviseme.model.persistence.dao.implementacao.UsuarioHibernateDAO;
import br.com.aviseme.model.persistence.entity.Usuario;
import br.com.aviseme.model.service.generics.Service;

public class UsuarioService extends Service<Usuario,Long,UsuarioHibernateDAO>{

	public boolean validarEntity(Usuario entity) throws Exception {
		return false;
	}

	@Override
	public List<Usuario> buscar(Usuario entity) throws Exception {
		return null;
	}

	@Override
	public UsuarioHibernateDAO getDao() {
		return new UsuarioHibernateDAO();
	}

}
