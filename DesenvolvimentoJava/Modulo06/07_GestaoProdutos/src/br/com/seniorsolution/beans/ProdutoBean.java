package br.com.seniorsolution.beans;

import java.util.List;

import br.com.seniorsolution.dao.GenericDao;
import br.com.seniorsolution.entidades.Produto;

public class ProdutoBean {

	public List<Produto> getListaProduto(){
		GenericDao<Produto> dao = new GenericDao<>(Produto.class);
		return dao.listar();
	}
}
