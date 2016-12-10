package ExerciciosArrays;

import java.util.Scanner;

public class VerificaVencedorJogoVelha {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	char[][] jogadas = new char[3][3];
	
	System.out.println("Informe as Jogadas: ");
		for (int linha = 0; linha < jogadas.length; linha++) {
		for (int coluna = 0; coluna < jogadas.length; coluna++) {
			jogadas[linha][coluna] = scanner.nextLine().charAt(0);
			
			
		}
		
	}
		char vencedor = tabuleiro.verificaVencedor(){
			return 0;
		}
}
}
