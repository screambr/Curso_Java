package ExerciciosArrays;

import java.util.Scanner;

public class InverteArray {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	
	System.out.println("Informe a quantidade de numeros: ");
	int n = scanner.nextInt();
	int[] numeros = new int[n], numerosInvertidos = new int[n];
	
	for (int i = 0; i < numeros.length; i++) {
		System.out.println("Informe o numero na posicao " + i + ":");
		numeros[i] = scanner.nextInt();
		
	}
	//corrigir
//	for (int i = 0; i = numeros.length; i--) {
	//	for (int i = numeros.length - i; i >= 0; i--) {
		
	}
		
	}
}
}
