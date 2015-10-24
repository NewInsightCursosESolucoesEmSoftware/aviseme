package br.com.aviseme.controller.generics;

import static br.com.aviseme.controller.util.Message.ERROR;
import static br.com.aviseme.controller.util.Message.SUCCESS_DELETE;
import static br.com.aviseme.controller.util.Message.SUCCESS_RECORD;
import static br.com.aviseme.controller.util.Message.SUCCESS_UPDATE;
import static br.com.aviseme.controller.util.Message.message;

import java.io.Serializable;
import java.util.List;

import javax.faces.context.FacesContext;

import br.com.aviseme.model.persistence.entity.EntidadeBase;
import br.com.aviseme.model.persistence.entity.Usuario;

@SuppressWarnings({ "unchecked", "rawtypes" })
public abstract class Controller<T extends EntidadeBase,Service extends br.com.aviseme.model.service.generics.Service> implements Serializable {

	private static final long serialVersionUID = -1464679430891204110L;
	protected Service service;
	protected T entidade;
	protected List<T> entidades;
	
	private boolean editando_registro = false;
	private boolean size_maior_q_zero = false;

	public Controller() {
		inicializarVariavel();
		if(entidade==null)return;
		entidade.setAtivo(true);
		buscar();
	}
	
	protected abstract void inicializarVariavel();
	
	public void gravar() {
		try {
			entidade.setId(null);
			getService().gravar(entidade);
			limpar();
			buscar();
			message(SUCCESS_RECORD);
		} catch (Exception e) {
			message(ERROR, e.getMessage());
		}
	}

	public void alterar() {
		try {
			getService().alterar(getEntidade());
			inicializarVariavel();
			buscar();
			message(SUCCESS_UPDATE);
		} catch (Exception e) {
			message(ERROR, e.getMessage());
		}
	}

	public void apagar(T entidade) {
		try {
			getService().apagar(entidade);
			buscar();
			message(SUCCESS_DELETE);
		} catch (Exception e) {
			message(ERROR, e.getMessage());
		}
	}

	public void buscar() {
		try {
			getEntidade().setAtivo(true);
			entidades = getService().buscar(getEntidade());
			if (entidades != null)
				setSize_maior_q_zero(entidades.size() > 0 ? true : false);
		} catch (Exception e) {
			message(ERROR, e.getMessage());
		}
	}

	public abstract void limpar();
	
	public abstract Service getService();
	
	public T getEntidade(){
		return entidade;
	}
	
	public void setEntidade(T entidade){
		setEditando_registro(true);
		 this.entidade = entidade;
	}
	
//	public boolean getAcesso(String permissao){
//		if(permissao == null) return false;
//		Usuario usuario = getCurrentInstanceUser();
//		if(usuario==null)return false;
//		return Security.getAcesso(usuario.getPerfil(),permissao);
//	}

	public static Usuario getCurrentInstanceUser() {
		return (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
	}

	public boolean isEditando_registro() {
		return editando_registro;
	}

	public void setEditando_registro(boolean editando_registro) {
		this.editando_registro = editando_registro;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public boolean isSize_maior_q_zero() {
		return size_maior_q_zero;
	}

	public void setSize_maior_q_zero(boolean size_maior_q_zero) {
		this.size_maior_q_zero = size_maior_q_zero;
	}

	public List<T> getEntidades() {
		return entidades;
	}

	public void setEntidades(List<T> entidades) {
		this.entidades = entidades;
	}

	public void setService(Service service) {
		this.service = service;
	}


}
