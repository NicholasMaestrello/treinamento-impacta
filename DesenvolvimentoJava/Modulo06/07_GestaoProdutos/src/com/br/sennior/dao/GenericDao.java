package com.br.sennior.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.br.sennior.utils.JpaUtil;

public class GenericDao<T> implements Dao<T> {

	private final Class<T> classe;
	protected EntityManager em;
	
	public GenericDao(Class<T> classe) {
		this.classe = classe;
	}
	
	@Override
	public void adicionar(T entidade) {
		em = JpaUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(entidade);
		em.getTransaction().commit();
		em.close();
	}

	@Override
	public List<T> listar() {
		em = JpaUtil.getEntityManager();
		TypedQuery<T> query = em.createQuery("from " + classe.getSimpleName(), classe);
		List<T> lista = query.getResultList();
		em.close();
		return lista;
	}

	@Override
	public T buscar(int id) {
		em = JpaUtil.getEntityManager();
		em.getTransaction().begin();
		T entidade = em.find(classe, id);
		em.getTransaction().commit();
		em.close();
		return entidade;
	}
	
//	public void adicionarEndereco(int idCliente, Endereco endereco) {
//		em = JpaUtil.getEntityManager();
//		Cliente c = em.find(Cliente.class, idCliente);
//		if(c != null) {
//			endereco.setCliente(c);
//			c.getEnderecos().add(endereco);
//			
//			em.getTransaction().begin();
//			em.persist(c);
//			em.getTransaction().commit();
//		}
//		em.close();
//	}
//	
//	public void adicionarPedido(int idCliente, Pedido pedido) throws Exception{
//		em = JpaUtil.getEntityManager();
//		Cliente c = em.find(Cliente.class, idCliente);
//		
//		if(c != null) {
//			pedido.setCliente(c);
//			c.getPedidos().add(pedido);
//			
//			em.getTransaction().begin();
//			em.persist(c);
//			em.getTransaction().commit();
//		}
//		em.close();
//	}
//	
//	public void adicionarItem(PedidoPK idPedido, Item item) throws Exception{
//		em = JpaUtil.getEntityManager();
//		Pedido p = em.find(Pedido.class, idPedido);
//		if (p!= null) {
//			item.setPedido(p);
//			p.getItens().add(item);
//			
//			em.getTransaction().begin();
//			em.persist(p);
//			em.getTransaction().commit();
//		}
//		em.close();
//	}
}
