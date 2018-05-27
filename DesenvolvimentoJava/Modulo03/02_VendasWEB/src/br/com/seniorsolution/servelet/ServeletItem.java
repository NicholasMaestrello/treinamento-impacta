package br.com.seniorsolution.servelet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.seniorsolution.dao.GenericDao;
import br.com.seniorsolution.entidades.Item;
import br.com.seniorsolution.entidades.PedidoPK;

/**
 * Servlet implementation class ServeletItem
 */
@WebServlet("/item")
public class ServeletItem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServeletItem() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.sendRedirect("cadItem.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String pedidoPK = request.getParameter("pedido");
			String [] elementos = pedidoPK.split("-");
			int codigo = Integer.parseInt(elementos[0].trim());
			String categoria = elementos[1].trim();
			
			double quantidade = Double.parseDouble(request.getParameter("quantidade"));
			String descricao = request.getParameter("descricao");
			
			PedidoPK pk = new PedidoPK();
			pk.setCategoria(categoria);
			pk.setCodigo(codigo);
			
			Item item = new Item();
			item.setQuantidade(quantidade);
			item.setDescricao(descricao);
			
			GenericDao<PedidoPK> dao = new GenericDao<>(PedidoPK.class);
			dao.adicionarItem(pk, item);
			
			request.setAttribute("mensagem", "Item adicionado com sucesso");
			request.getRequestDispatcher("cadItem.jsp").forward(request, response);
			
		} catch (Exception e) {
			// TODO: handle exception
			request.setAttribute("mensagem", "ERRO : " + e.getMessage());
			request.getRequestDispatcher("cadItem.jsp").forward(request, response);
		}
	}

}
