package br.com.aviseme.model.service.implementacao;

import java.util.List;

import br.com.aviseme.model.persistence.dao.implementacao.EstadoHibernateDAO;
import br.com.aviseme.model.persistence.entity.Estado;
import br.com.aviseme.model.service.generics.Service;

public class EstadoService extends Service<Estado,Long,EstadoHibernateDAO>{

	public boolean validarEntity(Estado entity) throws Exception {
		return false;
	}

	@Override
	public List<Estado> buscar(Estado entity) throws Exception {
		return null;
	}

	@Override
	public EstadoHibernateDAO getDao() {
		return new EstadoHibernateDAO();
	}

}
