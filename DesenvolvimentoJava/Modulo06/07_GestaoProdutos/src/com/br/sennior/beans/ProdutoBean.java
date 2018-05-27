package com.br.sennior.beans;

import java.util.List;

import com.br.sennior.dao.GenericDao;
import com.br.sennior.entidades.Produto;

public class ProdutoBean {

	public List<Produto> getListaProduto(){
		GenericDao<Produto> dao = new GenericDao<>(Produto.class);
		return dao.listar();
	}
}