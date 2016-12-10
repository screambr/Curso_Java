import java.util.Scanner;


public class TestaLampada {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
	
	System.out.println("Lampada de quantos Watts: ");
	String watts = scanner.next();
	
	System.out.println("Qual o fabricante: ");
	String fabricante = scanner.next();
	
	Lampada lampada = new Lampada(watts, fabricante);
	
	System.out.println(lampada.watts + " watts" + "\n" +"Fabricante: "+  lampada.fabricante);
	
	Interruptor interruptor = new Interruptor(lampada);
	interruptor.Apertar();
	interruptor.Apertar();
	interruptor.Apertar();
	interruptor.Apertar();
	interruptor.Apertar();
	
	System.out.println(lampada);
	
	scanner.close();
}
}
