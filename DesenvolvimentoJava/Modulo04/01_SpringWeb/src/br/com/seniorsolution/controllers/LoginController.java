package br.com.seniorsolution.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.seniorsolution.entidades.Usuario;
import br.com.seniorsolution.jdbc.JdbcUsuarioDao;
import br.com.seniorsolution.utils.Md5;
import br.com.seniorsolution.utils.Nivel;

@Controller
public class LoginController {
	
	@RequestMapping(value= {"/"})
	public String logar() {
		
		return "/login";
	}
	
	@RequestMapping(value= {"/loginusuario"}, method=RequestMethod.POST)
	public String Logar(Usuario usuario, ModelMap model, HttpSession session) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beanJdbc.xml");
		JdbcUsuarioDao dao = (JdbcUsuarioDao) ctx.getBean("jdbcUsuarioDao");
		try {
			Usuario buscado = dao.buscarUsuario(usuario.getNome());
			System.out.println(Md5.gerarMD5(usuario.getSenha()));
			if (buscado.getSenha().equals(Md5.gerarMD5(usuario.getSenha()))){
				session.setAttribute("user", buscado);
				model.addAttribute("mensagem", "bem vindo " + usuario.getNome() + " !");
				model.addAttribute("usuario", buscado);
				return "home/menu";
			}else {
				model.addAttribute("mensagem", "Senha invalida");
				return "/login";
			}
		} catch (Exception e) {
			// TODO: handle exception
			model.addAttribute("mensagem", "Usuario n�o cadastrado");
			return "/login"; 
		}
	}
	
	
}
