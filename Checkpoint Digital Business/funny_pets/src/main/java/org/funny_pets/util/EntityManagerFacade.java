package org.funny_pets.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class EntityManagerFacade {
	
	public static EntityManager getEntityManager() {
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("funny_pets");
		EntityManager manager = factory.createEntityManager();
		return manager;
		
	}

}
