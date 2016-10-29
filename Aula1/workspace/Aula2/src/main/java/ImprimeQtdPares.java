import java.awt.font.NumericShaper;
import java.util.Scanner;


public class ImprimeQtdPares {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Digite um numero: ");
	int numero = scanner.nextInt();
	int quantidadePares = 0;
	for ( int i = 1; i <= numero; i++ ){
	 if (i % 2 == 0){
		 System.out.println(i);
		 quantidadePares++;
	 }
	 if (quantidadePares == 10) {
		break;
	}
	}
}
}
