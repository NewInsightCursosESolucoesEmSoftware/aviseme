package br.com.aviseme.model.service.implementacao;

import java.util.List;

import br.com.aviseme.model.persistence.dao.implementacao.CidadeHibernateDAO;
import br.com.aviseme.model.persistence.entity.Cidade;
import br.com.aviseme.model.service.generics.Service;

public class CidadeService extends Service<Cidade,Long,CidadeHibernateDAO>{

	public boolean validarEntity(Cidade entity) throws Exception {
		return false;
	}

	@Override
	public List<Cidade> buscar(Cidade entity) throws Exception {
		return null;
	}

	@Override
	public CidadeHibernateDAO getDao() {
		return new CidadeHibernateDAO();
	}

}
