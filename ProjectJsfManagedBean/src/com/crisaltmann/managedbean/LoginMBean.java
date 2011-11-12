package com.crisaltmann.managedbean;

import com.crisaltmann.pojo.Usuario;

public class LoginMBean {

	private Usuario usuario;
	
	public LoginMBean() {
		System.out.println("#### Criando LoginMBean ####");
		usuario = new Usuario();
		//Teste
		usuario.setLogin("MBLogin");
		usuario.setSenha("123");
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
