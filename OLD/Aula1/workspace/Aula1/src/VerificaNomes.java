import java.util.Scanner;


public class VerificaNomes {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String valorNome1 = scanner.next();
	String valorNome2 = scanner.next();
	System.out.println("Compara Endereco Memoria: "  + (valorNome1 == valorNome2));
	System.out.println("Compara Conteudo da Variavel: "  + valorNome1.equals(valorNome2));
	
	
	scanner.close();

    }
}
