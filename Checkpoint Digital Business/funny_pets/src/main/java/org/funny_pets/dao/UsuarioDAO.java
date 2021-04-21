package org.funny_pets.dao;

import javax.persistence.EntityManager;

import org.funny_pets.model.Usuario;
import org.funny_pets.util.EntityManagerFacade;

public class UsuarioDAO {

EntityManager manager = EntityManagerFacade.getEntityManager();
	
	
	public void create(Usuario usuario) {
		
		
		manager.getTransaction().begin();
		manager.persist(usuario);
		manager.getTransaction().commit();
		
		manager.close();
		
		
	}
}
