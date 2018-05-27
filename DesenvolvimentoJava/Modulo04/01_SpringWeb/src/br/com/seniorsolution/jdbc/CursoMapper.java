package br.com.seniorsolution.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.RowMapper;

import br.com.seniorsolution.entidades.Curso;

public class CursoMapper implements RowMapper<Curso> {
	
	@Override
	public Curso mapRow(ResultSet rs, int arg1) throws SQLException {
		Curso curso = new Curso();
		curso.setId(rs.getInt("ID"));
		curso.setDescricao(rs.getString("DESCRICAO"));
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beanJdbc.xml");
		JdbcEscolaDao escolaDao = (JdbcEscolaDao) ctx.getBean("jdbcEscolaDao");
		try {
		curso.setEscola(escolaDao.buscarEscola(rs.getInt("IDESCOLA")));
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return curso;
	}
}