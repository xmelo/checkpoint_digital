package org.funny_pets.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.funny_pets.model.Cadastro;
import org.funny_pets.util.EntityManagerFacade;

public class CadastroDAO {
	
	EntityManager manager = EntityManagerFacade.getEntityManager();
	
	
	public void create(Cadastro cadastro) {
	
		
		manager.getTransaction().begin();
		manager.persist(cadastro);
		manager.getTransaction().commit();
		
		manager.close();
	}

	public List<Cadastro> getAll() {
		String jpql = "SELECT s FROM Cadastro s";
		TypedQuery<Cadastro> query = manager.createQuery(jpql, Cadastro.class);
		return query.getResultList();
		}
	
	}





