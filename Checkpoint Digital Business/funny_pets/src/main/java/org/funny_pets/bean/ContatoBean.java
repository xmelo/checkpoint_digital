package org.funny_pets.bean;
import org.funny_pets.dao.ContatoDAO;
import org.funny_pets.model.Contato;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@RequestScoped
public class ContatoBean {
	
	private Contato contato = new Contato();
	
	

	public Contato getContato() {
		return contato;
	}



	public void setContato(Contato contato) {
		this.contato = contato;
	}



	public void save() {
		new ContatoDAO().create(this.contato);
		System.out.println(this.contato);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Contato finalizado com sucesso!"));
	}
	public List<Contato> getContatos(){
		return new ContatoDAO().getAll();
	}
}


