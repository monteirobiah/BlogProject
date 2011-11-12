package com.crisaltmann.managedbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.crisaltmann.pojo.Usuario;

@ManagedBean(name = "UsuarioMBean")
@RequestScoped
public class UsuarioMBean {

	private Usuario usuario;

	
	public UsuarioMBean() {
		//Teste
		System.out.println("### Criando UsuarioMBean ###");
		usuario = new Usuario();
		usuario.setLogin("UsuarioMBean");
		usuario.setSenha("123");
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
