import java.util.Scanner;


public class TestaPessoa {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	
	System.out.println("digite o nome: ");
	String nome = scanner.next();
	
	System.out.println("digite o rg: ");
	String rg = scanner.next();
	
	System.out.println("digite o cpf: ");
	String cpf = scanner.next();
	
	Pessoa pessoa = new Pessoa(nome, rg, cpf);
	
	System.out.println("Nome: "+ pessoa.nome + "\n" +"RG: "  + pessoa.rg + "\n" + "CPF: " + pessoa.cpf);
}
}
