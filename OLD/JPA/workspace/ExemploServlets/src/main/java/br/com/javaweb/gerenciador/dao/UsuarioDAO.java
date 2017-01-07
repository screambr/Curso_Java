package br.com.javaweb.gerenciador.dao;

import java.util.HashMap;
import java.util.Map;

import br.com.javaweb.gerenciador.Usuario;

public class UsuarioDAO {

	private final static Map<String, Usuario> USUARIOS = new HashMap<>();
	static {
		USUARIOS.put("anderson.m.rodrigues@gmail.com", new Usuario("anderson.m.rodrigues@gmail.com","123456"));
		USUARIOS.put("stabs.fox@gmail.com", new Usuario("stabs.fox@gmail.com","123456"));
	}

	public Usuario buscaPorEmailESenha(String email, String senha) {
		if (!USUARIOS.containsKey(email))
			return null;

		Usuario usuario = USUARIOS.get(email);
		if (usuario.getSenha().equals(senha))
			return usuario;
		
		return null;
	}

}
