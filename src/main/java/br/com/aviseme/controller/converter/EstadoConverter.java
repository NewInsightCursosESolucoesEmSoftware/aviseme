package br.com.aviseme.controller.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.aviseme.model.persistence.dao.implementacao.EstadoHibernateDAO;
import br.com.aviseme.model.persistence.entity.Estado;

@FacesConverter(value = "estadoConverter",forClass = Estado.class)
public class EstadoConverter implements Converter {

	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		if (value != null && !value.equals("Selecione")) {
			if (!value.trim().isEmpty()) {
				try {
					return new EstadoHibernateDAO().findById(Long.valueOf(value));
				} catch (Exception e) {
					return e.getMessage();
				}
			}
		}
		return null;
	}

	public String getAsString(FacesContext arg0, UIComponent arg1, Object obj) {
		if(obj instanceof Estado && ((Estado)obj).getId() != null){
			return ((Estado)obj).getId().toString();
		}
		return null;
	}


}
