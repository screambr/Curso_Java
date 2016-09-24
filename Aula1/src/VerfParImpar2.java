import java.util.Scanner;


public class VerfParImpar2 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Digite Nome do Jogador 1: ");
	String valorPlayer1 = scanner.next();
	
	System.out.print("Escolha um Numero: " + valorPlayer1);
	int valorN1 = scanner.nextInt();
	
	System.out.print("Digite Nome do Jogador 2: ");
	String valorPlayer2 = scanner.next();
	
	System.out.print("Escolha um Numero: " + valorPlayer2);
	int valorN2 = scanner.nextInt();
	
	int valorSoma = (valorN1 + valorN2);
	
	System.out.println((valorSoma % 2) == 0 ? "Numero Par" : "Numero Impar" );
	System.out.println((valorSoma % 2) == 0 ? "O jogador: " + valorPlayer1 + " ganhou" : "O jogador: " + valorPlayer2 + " ganhou" );
	scanner.close();
	
    }
}