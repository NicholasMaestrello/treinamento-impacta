package br.com.seniorsolution.helper;

import javax.persistence.EntityManager;

import br.com.seniorsolution.entidade.Forum;
import br.com.seniorsolution.entidade.Usuario;

public class ForumHelper {
	private EntityManager em;
	
	public ForumHelper(EntityManager em) {
		this.em = em;
	}
	
	public void salvar(Forum forum) throws Exception{
		this.em.getTransaction().begin();
		this.em.persist(forum);// estado:  attched (conectado)
		this.em.getTransaction().commit();
	}
	
	public void adicionarUsuario(int idForum, Usuario usuario) throws Exception {
		Forum f = em.find(Forum.class, idForum); // estado : persistente
		if(f != null) {
			usuario.setForum(f);
			f.getUsuarios().add(usuario);
			em.getTransaction().begin();
			em.persist(f);
			em.getTransaction().commit();
		}
	}
}
