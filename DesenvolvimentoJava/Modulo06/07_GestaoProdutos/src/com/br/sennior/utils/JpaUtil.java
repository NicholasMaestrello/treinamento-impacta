package com.br.sennior.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaProdutos");

	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
}