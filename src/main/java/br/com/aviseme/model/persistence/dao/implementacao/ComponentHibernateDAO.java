package br.com.aviseme.model.persistence.dao.implementacao;

import br.com.aviseme.model.persistence.dao.generics.GenericDAO;
import br.com.aviseme.model.persistence.dao.generics.GenericHibernateDAO;
import br.com.aviseme.model.persistence.entity.Component;

public class ComponentHibernateDAO extends GenericHibernateDAO<Component,Long> implements GenericDAO<Component,Long>{

}
