package br.com.seniorsolution.servelet;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.seniorsolution.dao.GenericDao;
import br.com.seniorsolution.entidades.Cliente;
import br.com.seniorsolution.entidades.Pedido;
import br.com.seniorsolution.entidades.PedidoPK;

/**
 * Servlet implementation class PedidosServelet
 */
@WebServlet("/pedidos")
public class ServeletPedidos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServeletPedidos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("cadPedidos.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		try {
			int idEmpresa = Integer.parseInt(request.getParameter("cliente"));
			String dataString = request.getParameter("data");
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			Date data = df.parse(dataString);
			
			int numPedido = Integer.parseInt(request.getParameter("numpedido"));
			String categoria = request.getParameter("categoria");
			
			PedidoPK pk = new PedidoPK();
			pk.setCodigo(numPedido);
			pk.setCategoria(categoria);
			
			Pedido pedido = new Pedido();
			pedido.setDataPedido(data);
			pedido.setPedidoPK(pk);
			
			GenericDao<Cliente> dao = new GenericDao<>(Cliente.class);
			dao.adicionarPedido(idEmpresa, pedido);
			
			request.setAttribute("mensagem", "Pedido adicionado com sucesso !");
			request.getRequestDispatcher("cadPedidos.jsp").forward(request, response);
			
		} catch (Exception e) {
			// TODO: handle exception
			request.setAttribute("mensagem", "ERRO: "+ e.getMessage());
			request.getRequestDispatcher("cadPedidos.jsp").forward(request, response);
		}
	}

}
