package br.com.seniorsolution.bean;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import br.com.seniorsolution.dao.GenericDao;
import br.com.seniorsolution.entity.Usuario;

@ManagedBean(name="bUsuario")
@RequestScoped
public class UsuariosBean {

	private Usuario usuario;

	public UsuariosBean() {
		usuario = new Usuario();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String logIn() {
		Usuario novo ;
		try {
			GenericDao<Usuario> dao = new GenericDao<Usuario>(Usuario.class);
			novo = dao.buscarUsuario(usuario.getNome());
			if (novo == null) return "erro";
			if(novo.getSenha().equals(usuario.getSenha())) {
				HttpSession session = (HttpSession) FacesContext
						.getCurrentInstance()
						.getExternalContext()
						.getSession(true);
				session.setAttribute("user", novo);
				return "admin/menu?faces-redirect=true";
			}
			else {
				FacesContext context = FacesContext.getCurrentInstance();
				FacesMessage message = new FacesMessage();

				message.setSummary("Erro login : ");
				message.setDetail("Senha invalida");
				message.setSeverity(FacesMessage.SEVERITY_FATAL);
				context.addMessage(null, message);


				return "login";
			}
		} catch (Exception e) {
			FacesContext context = FacesContext.getCurrentInstance();
			FacesMessage message = new FacesMessage();

			message.setSummary("Erro login : ");
			message.setDetail("Usuario invalido");
			message.setSeverity(FacesMessage.SEVERITY_FATAL);
			context.addMessage(null, message);


			return "login";
		}
	}
}
