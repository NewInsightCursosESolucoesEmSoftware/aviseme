package br.com.aviseme.model.persistence.dao.implementacao;

import br.com.aviseme.model.persistence.dao.generics.GenericDAO;
import br.com.aviseme.model.persistence.dao.generics.GenericHibernateDAO;
import br.com.aviseme.model.persistence.entity.Estado;

public class EstadoHibernateDAO extends GenericHibernateDAO<Estado,Long> implements GenericDAO<Estado,Long>{

}
