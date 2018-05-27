package br.com.seniorsolution.jdbc;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import br.com.seniorsolution.entidades.Usuario;

public class JdbcUsuarioDao {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void incluirUsuario(Usuario usuario) throws Exception{
		try {
			String sql = "INSERT INTO USUARIO (NOME, SENHA, NIVEL) VALUES (?,?,?)";
			this.jdbcTemplate.update(sql,
					usuario.getNome(),
					usuario.getSenha(),
					usuario.getNivel().ordinal());
		} catch (Exception e) {
			throw e;
		}	
	}
	
	public Usuario buscarUsuario(String nome) throws Exception{
		Usuario usuario = null;
		try {	
			String sql =  "SELECT * FROM USUARIO WHERE NOME = ?";
			usuario = this.jdbcTemplate.queryForObject(sql, new String[] {nome},new UsuarioMapper());
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
		return usuario;
	}
}