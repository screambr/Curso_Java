import java.util.Scanner;


public class VerificaIdade2 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int idade = scanner.nextInt();
	
	System.out.println(idade >= 18 ? "Maior de Idade" : "Menor de idade" );
	scanner.close();

    }
}
