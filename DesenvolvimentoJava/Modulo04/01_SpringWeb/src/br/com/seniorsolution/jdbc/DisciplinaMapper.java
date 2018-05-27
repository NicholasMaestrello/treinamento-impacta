package br.com.seniorsolution.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.RowMapper;

import br.com.seniorsolution.entidades.Disciplina;

public class DisciplinaMapper implements RowMapper<Disciplina> {

	@Override
	public Disciplina mapRow(ResultSet rs, int arg1) throws SQLException {
		Disciplina disciplina = new Disciplina();
		disciplina.setId(rs.getInt("ID"));
		disciplina.setDescricao(rs.getString("DESCRICAO"));
		disciplina.setCargaHoraria(rs.getInt("CH"));
		try {
			ApplicationContext ctx = new ClassPathXmlApplicationContext("beanJdbc.xml");
			JdbcCursoDao dao = (JdbcCursoDao)ctx.getBean("jdbcCursoDao");
			disciplina.setCurso(dao.buscarCurso(rs.getInt("IDCURSO")));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return disciplina;
	}

	
}
