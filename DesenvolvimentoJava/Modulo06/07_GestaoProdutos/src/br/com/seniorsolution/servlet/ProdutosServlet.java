package br.com.seniorsolution.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.seniorsolution.dao.GenericDao;
import br.com.seniorsolution.entidades.Produto;

/**
 * Servlet implementation class ProdutosServlet
 */
@WebServlet("/ProdutosServlet")
public class ProdutosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProdutosServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.sendRedirect("cadastro.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		try {
			int codigo = Integer.parseInt(request.getParameter("codigo"));
			String descricao = request.getParameter("descricao");
			double preco = Double.parseDouble(request.getParameter("preco"));
			String fabricante = request.getParameter("fabricante");
			Produto produto = new Produto();
			produto.setCodigo(codigo);
			produto.setDescricao(descricao);
			produto.setFabricante(fabricante);
			produto.setPreco(preco);
			System.out.println(produto.getDescricao());
			GenericDao<Produto> dao = new GenericDao<>(Produto.class);
			dao.adicionar(produto);
			
			// adicionando um atributo � requisi��o
			request.setAttribute("mensagem", "Produto adicionado com sucesso !");
			request.getRequestDispatcher("cadastro.jsp").forward(request, response);
			//out.print("<h2>Cliente adicionado com sucesso ! </h2>");
		} catch (Exception e) {
			request.setAttribute("mensagem", "Error" + e.getMessage());
			request.getRequestDispatcher("cadastro.jsp").forward(request, response);
		}
	}

}
