package br.com.javaweb.gerenciadorjavaweb;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter(filterName = "FiltroAuditoria", urlPatterns = { "/*" })
public class FiltroAuditoria implements Filter {

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		
		HttpServletRequest request = (HttpServletRequest) arg0;
		HttpServletResponse response = (HttpServletResponse) arg1;
		
		Cookie cookie = getUsuario(request);
		String usuario = "<deslogado>";
		if(cookie != null){
			
			cookie.setMaxAge(60*10);
			response.addCookie(cookie);
			usuario = cookie.getValue();
			
		}

		HttpServletRequest req = (HttpServletRequest) arg0;
		System.out.println("Usuário acessando a URI " + req.getRequestURI());
		arg2.doFilter(arg0, arg1);

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {

	}
	
	

	public Cookie getUsuario(HttpServletRequest request) {

		Cookie[] cookies = request.getCookies();
		if (cookies == null) {
			return null;
		}

		for (Cookie cookie : cookies) {

			if (cookie.getName().equals("usuario.logado")) {

				return cookie;
			}

		}
		return null;

	}

}
