import java.util.Scanner;


public class Calculadora {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o Primeiro Numero: ");
		double valorN1 = scanner.nextDouble();
		System.out.print("Digite o Segundo Numero: ");
		double valorN2 = scanner.nextDouble();
		// char valorOp = scanner.next();
				
		System.out.println("O valor da soma e: " + (valorN1 + valorN2));	
		System.out.println("O valor da subtracao e: " + (valorN1 - valorN2));	
		System.out.println("O valor da multiplcacao e: " + (valorN1 * valorN2));	
		System.out.println("O valor da divisao e: " + (valorN1 / valorN2));	
		System.out.println("O valor da resto da divisao e: " + (valorN1 % valorN2));	
		
		scanner.close();

        }
}
