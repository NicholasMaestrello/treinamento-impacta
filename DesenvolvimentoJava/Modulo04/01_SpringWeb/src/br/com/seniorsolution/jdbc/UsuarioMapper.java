package br.com.seniorsolution.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.seniorsolution.entidades.Escola;
import br.com.seniorsolution.entidades.Usuario;
import br.com.seniorsolution.utils.Nivel;

public class UsuarioMapper implements RowMapper<Usuario> {
	
	@Override
	public Usuario mapRow(ResultSet rs, int arg1) throws SQLException {
		Usuario usuario = new Usuario();
		usuario.setNome(rs.getString("NOME"));
		usuario.setSenha(rs.getString("SENHA"));
		int nivel = rs.getInt("NIVEL");
		if (nivel == 0) usuario.setNivel(Nivel.COMUM);
		else if (nivel == 1) usuario.setNivel(Nivel.ADMIN);
		else if(nivel == 2) usuario.setNivel(Nivel.MASTER);
		
		return usuario;
	}
	
}
