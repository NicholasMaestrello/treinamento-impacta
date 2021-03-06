package br.com.seniorsolution.servelet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.seniorsolution.dao.GenericDao;
import br.com.seniorsolution.entidades.Cliente;
import br.com.seniorsolution.entidades.Endereco;

@WebServlet("/endereco")
public class ServeletEndereco extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServeletEndereco() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("/cadEnderecos.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		try {
			int codigo = Integer.parseInt(request.getParameter("cliente"));
			String rua = request.getParameter("rua");
			String cidade = request.getParameter("cidade");
			String cep = request.getParameter("cep");
			Endereco endereco = new Endereco();
			endereco.setRua(rua);
			endereco.setCidade(cidade);
			endereco.setCep(cep);
			GenericDao<Cliente> dao = new GenericDao<>(Cliente.class);
			dao.adicionarEndereco(codigo, endereco);
			//GenericDao<Cliente> daoCli = new GenericDao<>(Cliente.class);
			//endereco.setCliente(daoCli.buscar(codigo));
			
			//GenericDao<Endereco> daoEnd = new GenericDao<>(Endereco.class);
			//daoEnd.adicionar(endereco);
			// adicionando um atributo � requisi��o
			request.setAttribute("mensagem", "Endere�o adicionado com sucesso !");
			request.getRequestDispatcher("cadEnderecos.jsp").forward(request, response);
			//out.print("<h2>Cliente adicionado com sucesso ! </h2>");
		} catch (Exception e) {
			request.setAttribute("mensagem", "Error" + e.getMessage());
			request.getRequestDispatcher("cadEnderecos.jsp").forward(request, response);

		}
	}

}
