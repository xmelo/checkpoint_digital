package org.funny_pets.bean;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.funny_pets.dao.CadastroDAO;
import org.funny_pets.model.Cadastro;

@Named
@RequestScoped
public class CadastroBean {

	private Cadastro cadastro = new Cadastro();

	public Cadastro getCadastro() {
		return cadastro;
	}

	public void setCadastro(Cadastro cadastro) {
		this.cadastro = cadastro;
	}

	public void save() {
		new CadastroDAO().create(this.cadastro);
		System.out.println(this.cadastro);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cadastro realizado!"));
		}
	
	public List<Cadastro> getCadastros(){
		return new CadastroDAO().getAll();
	}
}


