package br.com.javaweb.gerenciadorjavaweb;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.javaweb.gerenciador.Empresa;
import br.com.javaweb.gerenciador.dao.EmpresaDAO;

/**
 * Servlet implementation class BuscaEmpresa
 */
@WebServlet("/busca")
public class BuscaEmpresa extends HttpServlet {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * sempre que sobrescrevemos um método é importante lembrarmos se desejamos chamar o 
	 * método na classe pai. Como o método de inicialização e destruição de uma servlet podem fazer algo
	 */
	@Override
	public void init() throws ServletException {
		 super.init();
		 System.out.println("Inicializando a Servlet " + this);
	}	
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//String filtro = request.getParameter("filtro");
		
		/*
		 * Simulando problema de concorrencia de variaveis compartilhadas (membro)
		 */
		String filtro = request.getParameter("filtro");
		
		Collection<Empresa> empresas = 
				new EmpresaDAO().buscaPorSimilaridade(filtro);
		request.setAttribute("empresas", empresas);
		request.getRequestDispatcher
		("/WEB-INF/paginas/buscaEmpresa.jsp").
		forward(request, response);
		
		}

	@Override
	public void destroy() {
		super.destroy();
		System.out.println("Destruindo a Servlet " + this);
	}

}

