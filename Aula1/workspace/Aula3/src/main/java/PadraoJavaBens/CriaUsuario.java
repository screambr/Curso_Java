package PadraoJavaBens;

import java.util.Scanner;

public class CriaUsuario {
	private String Nome;
	private String Email;
	private double senha;
	Scanner entrada = new Scanner(System.in);

	public CriaUsuario(String Nome, String Email, double senha) {
		this.Nome = Nome;
		this.Email = Email;
		this.senha = senha;

		System.out.println(Nome + "\n" + Email + "\n" + senha + "\n");
	}
}
