package org.funny_pets.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String adicionar;
	private String remover;
	private String alterar;

	public String getAdicionar() {
		return adicionar;
	}

	public void setAdicionar(String adicionar) {
		this.adicionar = adicionar;
	}

	public String getRemover() {
		return remover;
	}

	public void setRemover(String remover) {
		this.remover = remover;
	}

	public String getAlterar() {
		return alterar;
	}

	public void setAlterar(String alterar) {
		this.alterar = alterar;
	}

	@Override
	public String toString() {
		return "Usuario [adicionar=" + adicionar + ", remover=" + remover + ", alterar=" + alterar + "]";
	}

}
