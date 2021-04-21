package org.funny_pets.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.funny_pets.model.Contato;
import org.funny_pets.util.EntityManagerFacade;

public class ContatoDAO {
	
	EntityManager manager = EntityManagerFacade.getEntityManager();
	
	
	public void create(Contato contato) {
		
		
		manager.getTransaction().begin();
		manager.persist(contato);
		manager.getTransaction().commit();
		
		manager.close();
		
		
	}

	public List<Contato> getAll() {
		String jpql = "SELECT s FROM Contato s";
		TypedQuery<Contato> query = manager.createQuery(jpql, Contato.class);
		return query.getResultList();
		}
	
		
}
	
