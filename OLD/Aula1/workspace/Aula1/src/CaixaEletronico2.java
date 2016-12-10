import java.util.Scanner;


public class CaixaEletronico2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		  	
		System.out.print("Digite o valor desejado: ");
		int valorSaque = scanner.nextInt();
		int restante = valorSaque;
		
		int qtdNotas100 = restante / 100;
		restante = restante % 100;
		if (qtdNotas100 != 0) {
		System.out.println("Nota(s) de 100: " + qtdNotas100);
		}
		int qtdNotas50 = restante / 50;
		restante = restante % 50;
		if (qtdNotas50 != 0) {
		System.out.println("Nota(s) de 50: " + qtdNotas50);	
		}
		int qtdNotas20 = restante / 20;
		restante = restante % 20;	
		if (qtdNotas20 != 0) {
		System.out.println("Nota(s) de 20: " + qtdNotas20);
		}
		
		int qtdNotas10 = restante / 10;
		restante = restante % 10;	
		if (qtdNotas10 != 0) {
		System.out.println("Nota(s) de 10: " + qtdNotas10);
		}
		
		int qtdNotas5 = restante / 5;
		restante = restante % 5;	
		if (qtdNotas5 != 0) {
		System.out.println("Nota(s) de 5: " + qtdNotas5);
		}
		
		int qtdNotas2 = restante / 2;
		restante = restante % 2;	
		if (qtdNotas2 != 0) {
		System.out.println("Nota(s) de 2: " + qtdNotas2);
		}
		
		int qtdNotas1 = restante / 1;
		restante = restante % 1;	
		if (qtdNotas1 != 0) {
		System.out.println("Nota(s) de 1: " + qtdNotas1);
		}
				
		}

}
