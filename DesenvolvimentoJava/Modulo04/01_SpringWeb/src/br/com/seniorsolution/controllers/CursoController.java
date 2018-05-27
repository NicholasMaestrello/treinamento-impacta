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

import br.com.seniorsolution.entidades.Curso;
import br.com.seniorsolution.entidades.Escola;
import br.com.seniorsolution.jdbc.JdbcCursoDao;
import br.com.seniorsolution.jdbc.JdbcDisciplinaDao;
import br.com.seniorsolution.jdbc.JdbcEscolaDao;

@Controller
public class CursoController {

	@RequestMapping(value= {"/curso/cadastro"})
	public String incluir(ModelMap model) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beanJdbc.xml");
		JdbcEscolaDao dao = (JdbcEscolaDao) ctx.getBean("jdbcEscolaDao");

		try {
			model.addAttribute("escolas", dao.listarEscolas());
			return "cadastro/incluirCurso";
		} catch (Exception e) {
			// TODO: handle exception
			model.addAttribute("mensagem", e.getMessage());
			return "paginas/erro";
		}
	}

	@RequestMapping( value= {"/cadcurso"}, method=RequestMethod.POST)
	public String incluir( @RequestParam("idescola") int id_e, @Valid Curso curso, BindingResult result, ModelMap model) {
		if(result.hasErrors()) {
			return "forward:/curso/cadastro";
		}
		try {
			ApplicationContext ctx = new ClassPathXmlApplicationContext("beanJdbc.xml");
			JdbcEscolaDao escolaDao = (JdbcEscolaDao) ctx.getBean("jdbcEscolaDao");
			curso.setEscola(escolaDao.buscarEscola(id_e));
			JdbcCursoDao cursoDao = (JdbcCursoDao) ctx.getBean("jdbcCursoDao");
			cursoDao.incluirCurso(curso);


			model.addAttribute("mensagem", "Curso : " + curso.getDescricao() + " adicionado com sucesso a escola : " + curso.getEscola().getDescricao());
			return "paginas/sucesso";
		} catch (Exception e) {
			model.addAttribute("mensagem", "Erro : " + e.getMessage());
			return "paginas/erro"; 
		}
	}
	
	@RequestMapping(value= {"/curso/disciplinas"})
	public ModelAndView listarDisciplinas(@RequestParam("id")int id) {
		ModelAndView model = new ModelAndView();
		try {
			ApplicationContext ctx = new ClassPathXmlApplicationContext("beanJdbc.xml");
			JdbcDisciplinaDao dao = (JdbcDisciplinaDao) ctx.getBean("jdbcDisciplinaDao");
			model.addObject("listaDisciplinas", dao.listarDisciplinas(id));
			model.setViewName("consulta/listarDisciplinas");
		} catch (Exception e) {
			// TODO: handle exception
			model.addObject("mensagem", "Erro : " + e.getMessage());
			model.setViewName("paginas/erro"); 
		}
		return model;
	}
	
	@RequestMapping("/curso/remover")
	public ModelAndView remover(@RequestParam("id") int id) {
		ModelAndView model = new ModelAndView();
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beanJdbc.xml");
		JdbcCursoDao dao = (JdbcCursoDao) ctx.getBean("jdbcCursoDao");
		JdbcEscolaDao escolaDao = (JdbcEscolaDao) ctx.getBean("jdbcEscolaDao");
		try {
			dao.removerCurso(id);
			model.addObject("listaEscolas", escolaDao.listarEscolas());
			model.setViewName("consulta/listarEscolas");
		} catch (Exception e) {
			// TODO: handle exception
			model.addObject("mensagem", e.getMessage());
			model.setViewName("paginas/erro");	
		}
		return model;
	}
}
