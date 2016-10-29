package Aula5.GeradorSenha;

import java.util.Scanner;

public class InterfaceUsuario {
	Scanner entrada = new Scanner(System.in);

	public void senhaPadrao() {
		System.out.println("\tGerar Senha Padrao");

	}

	public void senhaIdoso() {
		System.out.println("\tGerar Senha Idoso");

	}

	public void proximaSenha() {
		System.out.println("\tChamar Proxima Senha");

	}

	public void sair() {

	}

	public void iniciar() {
		int opcao;

		do {
			exibeMenu();
			opcao = entrada.nextInt();
			escolheOpcao(opcao);
		} while (opcao != 4);
	}

	public void exibeMenu() {

		System.out.println("\t Escolha a opção desejada");
		System.out.println("1 - Gerar Senha Padrao");
		System.out.println("2 - Gerar Senha Idoso");
		System.out.println("3 - Chamar Proxima Senha");
		System.out.println("4 - Sair\n");
		System.out.print("Opção: ");

	}

	public void escolheOpcao(int opcao) {

		switch (opcao) {
		case 1:
			senhaPadrao();
			break;
			
		case 2:
			senhaIdoso();
			break;

		case 3:
			proximaSenha();
			break;

		case 4:
			sair();
			break;

		default:
			System.out.println("Opção inválida");
		}

	}
}