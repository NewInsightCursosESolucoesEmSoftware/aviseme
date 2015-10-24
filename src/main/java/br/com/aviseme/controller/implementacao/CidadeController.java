package br.com.aviseme.controller.implementacao;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.aviseme.controller.generics.Controller;
import br.com.aviseme.model.persistence.entity.Cidade;
import br.com.aviseme.model.persistence.entity.Estado;
import br.com.aviseme.model.service.implementacao.CidadeService;

@ManagedBean
@ViewScoped
public class CidadeController extends Controller<Cidade, CidadeService> {

	private static final long serialVersionUID = 3343620524385107206L;

	private List<Estado> estados;

	@Override
	protected void inicializarVariavel() {
		limpar();
		buscarEstados();
	}

	private void buscarEstados() {
		estados = new ArrayList<Estado>();
		estados.add(new Estado());
		estados.add(new Estado());
		estados.add(new Estado());
		estados.add(new Estado());
		estados.add(new Estado());
	}

	@Override
	public void limpar() {
		entidade = new Cidade();
	}

	@Override
	public CidadeService getService() {
		return new CidadeService();
	}

	public List<Estado> getEstados() {
		return estados;
	}

	public void setEstados(List<Estado> estados) {
		this.estados = estados;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
