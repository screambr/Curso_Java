package br.com.javaweb.gerenciadorjavaweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.javaweb.gerenciador.Usuario;
import br.com.javaweb.gerenciador.dao.UsuarioDAO;

/**
 * Servlet implementation class Autenticar
 */
@WebServlet("/autenticar")
public class Autenticar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Autenticar() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");
		Usuario user = new Usuario(email, password);

		Usuario usuario = new UsuarioDAO().buscaPorEmailESenha(email, password);
		
		PrintWriter writer = response.getWriter();
		
		if(usuario == null){
			
			response.sendRedirect("/ExemploServlets/ErrorPage.html");
			
		}else{
			
			Cookie cookie = new Cookie("usuario.logado", email);
			response.addCookie(cookie);
			response.sendRedirect("/ExemploServlets/LoginScreen.html");
			
		}

		doGet(request, response);
	}

}
