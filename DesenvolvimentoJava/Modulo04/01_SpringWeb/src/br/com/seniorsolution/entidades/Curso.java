package br.com.seniorsolution.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Curso {

	private int id;
	
	@NotNull
	@NotEmpty
	@Size(min=3, max=45, message="{erro.curso.descricao}")
	private String descricao;
	
	private Escola escola;
	
	private List<Disciplina> disciplinas = new ArrayList<>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Escola getEscola() {
		return escola;
	}
	public void setEscola(Escola escola) {
		this.escola = escola;
	}
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	
//	public void setIdescola(String id) {
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("beanJdbc.xml");
//		JdbcEscolaDao dao = (JdbcEscolaDao) ctx.getBean("jdbcEscolaDao");
//		try {
//		this.escola = dao.buscarEscola(Integer.parseInt(id));
//		}catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//	}
}
