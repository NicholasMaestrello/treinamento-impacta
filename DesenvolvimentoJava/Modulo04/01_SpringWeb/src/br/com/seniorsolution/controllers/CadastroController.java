package br.com.seniorsolution.controllers;

import javax.validation.Valid;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.seniorsolution.entidades.Usuario;
import br.com.seniorsolution.jdbc.JdbcUsuarioDao;
import br.com.seniorsolution.utils.Md5;
import br.com.seniorsolution.utils.Nivel;

@Controller
public class CadastroController {

	@RequestMapping(value= {"/login/cadastro"})
	public ModelAndView cadastrar() {
		ModelAndView model = new ModelAndView();
		model.addObject("niveis", Nivel.values());
		model.setViewName("cadastro/incluirUsuario");
		return model;
	}

	@RequestMapping(value= {"/cadusuario"}, method=RequestMethod.POST)
	public ModelAndView cadastrar(@Valid Usuario usuario, BindingResult result) {
		ModelAndView model = new ModelAndView();
		if(result.hasErrors()) {
			System.out.println(result.getFieldErrors());
			model.setViewName("forward:/login/cadastro");
			return model;
		}
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beanJdbc.xml");
		JdbcUsuarioDao dao = (JdbcUsuarioDao) ctx.getBean("jdbcUsuarioDao");
		try {
			usuario.setSenha(Md5.gerarMD5(usuario.getSenha()));
			dao.incluirUsuario(usuario);
			model.addObject("mensagem", "Usuario : " + usuario.getNome() + " adicionado com sucesso ");
			model.addObject("niveis", Nivel.values());
			model.setViewName("cadastro/incluirUsuario");
		}catch (Exception e) {
			model.addObject("mensagem", "Erro : " + e.getMessage());
			model.setViewName("paginas/erro"); 
		}
		return model;
	}
}