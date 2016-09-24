import java.util.Random;
import java.util.Scanner;


public class JogoAdvinhaNumero {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int numero = new Random().nextInt(10) + 1;
	int valorNumero=0;
	int ValorTentativa=0;
	
	while (valorNumero != numero) {
		
		System.out.println("Voce errou!!!");
		System.out.println("Digite um numero de 1 a 10");
		valorNumero = scanner.nextInt();
		ValorTentativa++;
		
		}
	
		System.out.println("Voce acertou");
		System.out.println("Numero de tentativas: " + ValorTentativa);
	}
}
