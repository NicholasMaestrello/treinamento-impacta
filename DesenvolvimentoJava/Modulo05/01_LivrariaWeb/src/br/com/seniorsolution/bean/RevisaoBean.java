package br.com.seniorsolution.bean;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import br.com.seniorsolution.dao.GenericDao;
import br.com.seniorsolution.entity.Livro;
import br.com.seniorsolution.entity.Revisao;

@ManagedBean(name="bRevisao")
@SessionScoped
public class RevisaoBean {

	@ManagedProperty(value="#{beanRevisao}")
	private Revisao revisao;
	private int codLivro;
	private List<Revisao> revisoes;

	//	public RevisaoBean() {
	//		this.revisao = new Revisao();
	//	}

	public Revisao getRevisao() {
		return revisao;
	}

	public void setRevisao(Revisao revisao) {
		this.revisao = revisao;
	}


	public int getCodLivro() {
		return codLivro;
	}

	public void setCodLivro(int codLivro) {
		this.codLivro = codLivro;
	}

	public List<Revisao> getRevisoes() {
		return revisoes;
	}

	public void setRevisoes(List<Revisao> revisoes) {
		this.revisoes = revisoes;
	}

	public List<Livro> getListaLivros(){
		GenericDao<Livro> dao = new GenericDao<Livro>(Livro.class);
		return dao.listar();
	}
	
	public List<Revisao> getTodasRevisoes(){
		GenericDao<Revisao> dao = new GenericDao<Revisao>(Revisao.class);
		return dao.listar();
	}

	public String incluirRevisao() {
		FacesContext context = FacesContext.getCurrentInstance();
		FacesMessage msg = new FacesMessage();
		msg.setSummary("Info : ");
		try {
			GenericDao<Livro> daoLivro = new GenericDao<Livro>(Livro.class);
			this.getRevisao().setLivro(daoLivro.buscar(this.getCodLivro()));
			GenericDao<Revisao> daoRev = new GenericDao<Revisao>(Revisao.class);
			msg.setDetail("Revis�o incluida com sucesso");
			msg.setSeverity(FacesMessage.SEVERITY_INFO);
			daoRev.adicionar(this.getRevisao());
			return "sucesso";
		} catch (Exception e) {
			msg.setDetail("Erro ao incluir revis�o ");
			msg.setSeverity(FacesMessage.SEVERITY_FATAL);
			return "erro";
		}
	}

	public void alterarRevisoes(ValueChangeEvent e){
		if(Integer.parseInt(e.getNewValue().toString()) == -1) {
			this.setRevisoes(null);
			return;
		}
		try {
			int codLivro = (Integer) e.getNewValue();
			GenericDao<Revisao> dao = new GenericDao<Revisao>(Revisao.class);
			this.setRevisoes(dao.listarRevisoes(codLivro));
			FacesContext context =  FacesContext.getCurrentInstance();
			FacesMessage msg = new FacesMessage();
			msg.setSummary("Info :");
			if(this.getRevisoes().size() > 0) msg.setDetail("Numero de revisoes encontradas : " + this.getRevisoes().size());
			else msg.setDetail("Nenhuma revis�o encontrada");
			msg.setSeverity(FacesMessage.SEVERITY_INFO);
			context.addMessage(null, msg);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}