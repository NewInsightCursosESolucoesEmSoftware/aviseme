package br.com.aviseme.model.persistence.dao.implementacao;

import br.com.aviseme.model.persistence.dao.generics.GenericDAO;
import br.com.aviseme.model.persistence.dao.generics.GenericHibernateDAO;
import br.com.aviseme.model.persistence.entity.Cidade;

public class CidadeHibernateDAO extends GenericHibernateDAO<Cidade,Long> implements GenericDAO<Cidade,Long> {

}
