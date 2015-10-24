package br.com.aviseme.model.persistence.dao.implementacao;

import br.com.aviseme.model.persistence.dao.generics.GenericDAO;
import br.com.aviseme.model.persistence.dao.generics.GenericHibernateDAO;
import br.com.aviseme.model.persistence.entity.Usuario;

public class UsuarioHibernateDAO extends GenericHibernateDAO<Usuario,Long> implements GenericDAO<Usuario,Long>{

}
