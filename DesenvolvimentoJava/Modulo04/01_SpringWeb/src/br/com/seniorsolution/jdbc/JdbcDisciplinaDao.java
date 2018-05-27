package br.com.seniorsolution.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import br.com.seniorsolution.entidades.Disciplina;

public class JdbcDisciplinaDao {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void incluirDisciplina(Disciplina disciplina) throws Exception{
		try {
			String sql = "INSERT INTO DISCIPLINA (DESCRICAO, CH, IDCURSO) VALUES (?, ?, ?)";
			this.jdbcTemplate.update(sql,
					disciplina.getDescricao(),
					disciplina.getCargaHoraria(),
					disciplina.getCurso().getId());
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}
	
	public List<Disciplina> listarDisciplinas(int id) throws Exception{
		List<Disciplina> disciplinas = new ArrayList<>();
		try {
			String sql = "SELECT * FROM DISCIPLINA WHERE IDCURSO = ?";
			disciplinas = this.jdbcTemplate.query(sql, new Integer[] {id}, new DisciplinaMapper());
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
		return disciplinas;
	}
}
