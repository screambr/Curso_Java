import java.util.Scanner;

public class NumerosDecrescente {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	  	
		System.out.print("Digite o primeiro numero: ");
		int valorN1 = scanner.nextInt();
		System.out.print("Digite o segundo numero: ");
		int valorN2 = scanner.nextInt();
		System.out.print("Digite o terceiro numero: ");
		int valorN3 = scanner.nextInt();

		if (valorN1 > valorN2 && valorN2 > valorN3) 
			System.out.println("A ordem decrescente e: " + valorN1 + " " + valorN2 + " " + valorN3);
		
		if (valorN1 > valorN3 && valorN3 > valorN2) 
			System.out.println("A ordem decrescente e: " + valorN1 + " " + valorN3 + " " + valorN2);
		
		if (valorN2 > valorN1 && valorN1 > valorN3) 
			System.out.println("A ordem decrescente e: " + valorN2 + " " + valorN1 + " " + valorN3);
		
		if (valorN2 > valorN3 && valorN3 > valorN1) 
			System.out.println("A ordem decrescente e: " + valorN2+ " " + valorN3 + " " + valorN1);
		
		if (valorN3 > valorN1 && valorN1 > valorN2) 
			System.out.println("A ordem decrescente e: " + valorN3 + " " + valorN1 + " " + valorN2);
		
		if (valorN3 > valorN2 && valorN2 > valorN1) 
		System.out.println("A ordem decrescente e: " + valorN3 + " " + valorN2 + " " + valorN1);
		
		if (valorN1 == valorN2 && valorN1 > valorN3) 
			System.out.println("A ordem decrescente e: " + valorN1 + " " + valorN2 + " " + valorN3);
		
		if (valorN1 == valorN3 && valorN1 > valorN2) 
			System.out.println("A ordem decrescente e: " + valorN1 + " " + valorN3 + " " + valorN2);
		
		if (valorN2 == valorN3 && valorN2 > valorN1) 
			System.out.println("A ordem decrescente e: " + valorN2 + " " + valorN3 + " " + valorN1);
		
		if (valorN1 == valorN2 && valorN3 > valorN1) 
			System.out.println("A ordem decrescente e: " + valorN3 + " " + valorN1 + " " + valorN2);
		
		if (valorN1 == valorN2 && valorN2 == valorN3) 
			System.out.println("A ordem decrescente e: " + valorN1 + " " + valorN2 + " " + valorN3);
	
				
				
		}
		
	}
