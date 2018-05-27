package br.com.seniorsolution.executaveis;

import java.util.ArrayList;
import java.util.List;

import br.com.seniorsolution.entity.Aluno;
import br.com.seniorsolution.entity.Curso;
import br.com.seniorsolution.entity.Disciplina;
import br.com.seniorsolution.enums.NomeBandeira;
import br.com.seniorsolution.enums.TipoPagemento;

public class Executavel1 {

	public static void main(String[] args) {
		List<Disciplina> disciplinasADS = new ArrayList<>();
		disciplinasADS.add(new Disciplina("ED", 300.00));
		disciplinasADS.add(new Disciplina("BD", 120.00));
		disciplinasADS.add(new Disciplina("SO", 80.00));
		
//		List<Disciplina> matriculasAluno = new ArrayList<>();
//		matriculasAluno.add(new Disciplina("ED", 300.00));
//		matriculasAluno.add(new Disciplina("BD", 120.00));
		
		Curso ads = new Curso("ADS", disciplinasADS);
		
		Aluno aluno = new Aluno();
		aluno.setNome("Jo�o");
		aluno.setRa("123456");
		aluno.setCurso(ads);
		aluno.matricular(0);
		aluno.matricular(1);
		
		System.out.println(aluno.totalApagar());
		aluno.realizarPagamento(TipoPagemento.Cheque);
		aluno.realizarPagamento(TipoPagemento.Boleto, NomeBandeira.MasterCard);
		
		
		
	}
}