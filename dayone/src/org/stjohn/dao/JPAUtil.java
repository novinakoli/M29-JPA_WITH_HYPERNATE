package org.stjohn.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static EntityManagerFactory factory;
	private static EntityManager em;

	// Entity manager - CRUD methods
	// create->persist(obj)
	// retrieve->find(pk)
	// update->merge(obj)
	// delete->remove(pk)

	// static block to initialize an object
	static {
		factory = Persistence.createEntityManagerFactory("JPA-PU");
	}

	// JPA runtime LifeCycle
	public static EntityManager getEntityManager() {
		if (em == null || !em.isOpen()) {
			em = factory.createEntityManager();
		}
		return em;

	}
}
