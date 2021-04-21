package org.funny_pets.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import org.funny_pets.model.Usuario;

@Named
@RequestScoped
public class UsuarioBean {

	private Usuario usuario = new Usuario();

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
