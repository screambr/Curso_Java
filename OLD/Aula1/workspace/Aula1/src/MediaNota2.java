import java.util.Scanner;


public class MediaNota2 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Digiteo nome do Aluno: ");
	String nomeAluno = scanner.next();
	System.out.print("Digiteo a Primeira Nota: ");
	double valorNota1 = scanner.nextDouble();
	System.out.print("Digiteo a Segunda Nota: ");
	double valorNota2 = scanner.nextDouble();
	System.out.print("Digiteo a Terceira Nota: ");
	double valorNota3 = scanner.nextDouble();
	
	double valorMedia =(valorNota1 + valorNota2 + valorNota3) / 3;	
	if (valorMedia > 7){
		System.out.println("A media do aluno foi: " + valorMedia );
		System.out.println("O aluno " + nomeAluno + " foi Aprovado");
		
	}else if (valorMedia >= 4 && valorMedia < 7 ) {
		System.out.println("A media do aluno foi: " + valorMedia );
		System.out.println("O aluno " + nomeAluno + " esta de Exame");
			
	} else {
		System.out.println("A media do aluno foi: " + valorMedia );
		System.out.println("O aluno " + nomeAluno + " foi Reprovado");
		

		}
		
	
	}
}
	