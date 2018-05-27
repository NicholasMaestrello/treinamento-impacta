package br.com.seniorsolution.aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import br.com.seniorsolution.entidade.Usuario;
import br.com.seniorsolution.helper.ForumHelper;

public class AppUsuario {
	public static void main(String[] args) {
		//		criar um usuario e o adicionar a um forum existente
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaForum");
		EntityManager em = emf.createEntityManager();
		try {

			ForumHelper dao = new ForumHelper(em);
			Usuario usuario = new Usuario();
			usuario.setNome("Elen");
			usuario.setEmail("elen@mail.com");
			dao.adicionarUsuario(3, usuario);
			System.out.println("ok");
			JOptionPane.showMessageDialog(null, "usuario inserido com sucesso !");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
