package br.com.seniorsolution.entity;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="revisao")
@ManagedBean(name="beanRevisao")
@SessionScoped
public class Revisao implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	private int id;
	
	@Column(name="DATA")
	private Date data;
	
	@Column(name="DESCRICAO")
	private String descricao;
	
	@Column(name="RESPONSAVEL")
	private String responsavel;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="IDLIVRO")
	private Livro livro;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
//	public Livro getObjLivro() {
////		GenericDao<Livro> dao = new GenericDao<Livro>(Livro.class);
////		this.livro = dao.buscar(Integer.parseInt(livro));
//		return this.livro;
//	}


	
}
