import java.util.Scanner;


public class CaixaEletronico {
public static void main(String[] args) {
	float qtdNotas;
	float valorSaque;
   	Scanner scanner = new Scanner(System.in);
	System.out.print("Digiteo o valor desejado: ");
	valorSaque = scanner.nextFloat();
	if(valorSaque%5!=0){
        System.out.print("Não existem notas disponiveis");

    }


    if(valorSaque%100==0){
    	qtdNotas=valorSaque/100;

        System.out.print("A quantidade de notas e: "+qtdNotas+"  Valor do Saque foi :" + valorSaque);

    }else if(valorSaque%50==0){
    	qtdNotas=valorSaque/50;

        System.out.print("A quantidade de notas e: "+qtdNotas+"  Valor do Saque foi :" + valorSaque);
    }else if(valorSaque%20==0){
    	qtdNotas=valorSaque/20;
        System.out.print("A quantidade de notas e: "+qtdNotas+"  Valor do Saque foi :" + valorSaque);

    }else if(valorSaque%10==0){
    	qtdNotas=valorSaque/10;
        System.out.print("A quantidade de notas e: "+qtdNotas+"  Valor do Saque foi :" + valorSaque);

    }else if(valorSaque%5==0){
        qtdNotas=valorSaque/5;
        System.out.print("A quantidade de notas e: "+qtdNotas+"  VValor do Saque foi :" + valorSaque);

    }

}
}