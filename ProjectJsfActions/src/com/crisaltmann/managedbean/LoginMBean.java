package com.crisaltmann.managedbean;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

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
	
	public String login() {
		System.out.println("### Executando Action ###");
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
		
		if("joao".equals(usuario.getLogin()) && "12345".equals(usuario.getSenha())) {
			session.removeAttribute("loginCont");
			return "OK";
		}
		
		Integer loginCont = (Integer) session.getAttribute("loginCont");
		loginCont = loginCont == null ? 0 : loginCont;
		loginCont++;
		session.setAttribute("loginCont", loginCont);

		if(loginCont > 5) {
			return "MAX_LOGIN_EXCED";
		}
		FacesMessage msg = new FacesMessage("Usuário ou senha incorretos");
		FacesContext.getCurrentInstance().addMessage("form", msg);
		return "";
	}
	
}
