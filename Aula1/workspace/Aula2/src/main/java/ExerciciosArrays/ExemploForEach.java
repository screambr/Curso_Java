package ExerciciosArrays;

import java.util.Scanner;

public class ExemploForEach {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int[] numeros =new int[10];
	
	for (int i = 0; i < numeros.length; i++) {
		System.out.println("numeros["+ i +"] =");
		numeros [i] = scanner.nextInt();
			
	}
	for (int numero : numeros) {
		System.out.println(numero);
		
	}
	scanner.close();
}
}
