import java.util.Scanner;


public class VerfParImpar {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Digite um numero: ");
	int valorN = scanner.nextInt();
	System.out.println("Resto: " + (valorN % 2));
	System.out.println((valorN % 2) == 0 ? "Numero Par" : "Numero Impar" );
	scanner.close();

    }
}
