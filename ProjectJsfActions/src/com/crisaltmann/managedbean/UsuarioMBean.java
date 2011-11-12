package com.crisaltmann.managedbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.crisaltmann.pojo.Usuario;

@ManagedBean(name = "UsuarioMBean")
@RequestScoped
public class UsuarioMBean {

	private Usuario usuario;

	
	public UsuarioMBean() {
		usuario = new Usuario();
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
