import java.util.Scanner;


public class VerificaNomes2 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String valorNome1 = scanner.next();
	String valorNome2 = scanner.next();
	
	if (valorNome1.equals(valorNome2)) {
		System.out.println("Conteudo igual");
	} 
		else {
			System.out.println("Deu Merda");
			
		}
	scanner.close();

    }
}
