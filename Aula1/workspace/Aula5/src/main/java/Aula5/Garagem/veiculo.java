package Aula5.Garagem;

import java.util.Scanner;

public class veiculo {
	private String marca;
	private String modelo;
	private int placa;
	private int ano;
	private double preco;
	Scanner entrada = new Scanner(System.in);

	public veiculo(String marca, String modelo, int placa, int ano, double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
		this.preco = preco;
	}
		
	public void adicionar() {
		System.out.println("\tADICIONAR VEICULO");

	}

	public void vender() {
		System.out.println("\tVENDER VEICULO");

	}

	public void buscar() {
		System.out.println("\tBUSCAR VEICULO");

	}

	public void listar() {
		System.out.println("\tLISTAR VEICULO");
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Placa: " + this.placa);
		System.out.println("Ano: " + this.ano);
		System.out.println("Preco: " + this.preco);

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
		System.out.println("1 - Adicionar Veiculo");
		System.out.println("2 - Vender Veiculo");
		System.out.println("3 - Buscar Veiculo");
		System.out.println("4 - Listar Veiculo");
		System.out.println("5 - Sair\n");
		System.out.print("Opção: ");

	}

	public void escolheOpcao(int opcao) {

		switch (opcao) {
		case 1:
			adicionar();
			break;
		case 2:
			vender();
			break;

		case 3:
			buscar();
			break;

		case 4:
			listar();
			break;

		case 5:
			sair();
			break;

		default:
			System.out.println("Opção inválida");
		}
	}
}