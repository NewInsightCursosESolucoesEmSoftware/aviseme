package br.com.aviseme.model.service.implementacao;

import java.util.List;

import br.com.aviseme.model.persistence.dao.implementacao.ComponentHibernateDAO;
import br.com.aviseme.model.persistence.entity.Component;
import br.com.aviseme.model.service.generics.Service;

public class ComponentService extends Service<Component,Long,ComponentHibernateDAO>{

	public boolean validarEntity(Component entity) throws Exception {
		return false;
	}

	@Override
	public List<Component> buscar(Component entity) throws Exception {
		return null;
	}

	@Override
	public ComponentHibernateDAO getDao() {
		return new ComponentHibernateDAO();
	}

}
