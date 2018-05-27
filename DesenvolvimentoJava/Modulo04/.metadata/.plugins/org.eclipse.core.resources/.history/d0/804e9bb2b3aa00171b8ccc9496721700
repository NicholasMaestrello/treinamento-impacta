package br.com.seniorsolution.controllers;

import javax.validation.Valid;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.seniorsolution.entidades.Escola;
import br.com.seniorsolution.jdbc.JdbcCursoDao;
import br.com.seniorsolution.jdbc.JdbcEscolaDao;

@Controller
public class EscolaController {

	@RequestMapping(value={"/escola/cadastro"})
	public String incluir() {
		return "cadastro/incluirEscola";
	}
	
	@RequestMapping(value={"/cadescola"}, method=RequestMethod.POST)
	public String incluir(@Valid Escola escola, BindingResult result, ModelMap model) {
		if(result.hasErrors()) {
			return "forward:/escola/cadastro";
		}
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beanJdbc.xml");
		JdbcEscolaDao dao = (JdbcEscolaDao) ctx.getBean("jdbcEscolaDao");
		try {
			dao.incluirEscola(escola);
			model.addAttribute("mensagem", "Escola " + escola.getDescricao() + " incluida com sucesso !");
			return "paginas/sucesso";
		} catch (Exception e) {
			model.addAttribute("mensagem", "Erro : " + e.getMessage());
			return "paginas/erro"; 
		}
	}
	
//	Todo
	@RequestMapping("/escola/lista")
	public ModelAndView listar() {
		ModelAndView model = new ModelAndView();
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beanJdbc.xml");
		JdbcEscolaDao dao = (JdbcEscolaDao)ctx.getBean("jdbcEscolaDao");
		try {
			model.addObject("listaEscolas", dao.listarEscolas());
			model.setViewName("consulta/listarEscolas");
		} catch(Exception e) {
			model.addObject("mensagem", e.getMessage());
			model.setViewName("paginas/erro");			
		}
		return model;
	}
	
//	Todo
	@RequestMapping("/escola/cursos")
	public ModelAndView listar(@RequestParam("id") int id) {
		ModelAndView model = new ModelAndView();
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beanJdbc.xml");
		JdbcCursoDao dao = (JdbcCursoDao)ctx.getBean("jdbcCursoDao");
		try {
			model.addObject("listaCursos", dao.listarCursos(id));
			model.setViewName("consulta/listarCursos");
		} catch(Exception e) {
			model.addObject("mensagem", e.getMessage());
			model.setViewName("paginas/erro");			
		}
		return model;
	}
	
	@RequestMapping("/escola/remover")
	public ModelAndView remover(@RequestParam("id") int id) {
		ModelAndView model = new ModelAndView();
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beanJdbc.xml");
		JdbcEscolaDao dao = (JdbcEscolaDao) ctx.getBean("jdbcEscolaDao");
		try {
			dao.removerEscola(id);
			model.addObject("listaEscolas", dao.listarEscolas());
			model.setViewName("consulta/listarEscolas");
		} catch (Exception e) {
			// TODO: handle exception
			model.addObject("mensagem", e.getMessage());
			model.setViewName("paginas/erro");	
		}
		return model;
	}
}
