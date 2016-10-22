package Aula4.ClassesAbstratas;

public class TestarForma {
public static void main(String[] args) {
	Forma quadrado = new Quadrado();
	Forma circulo = new Circulo();
	quadrado.desenhar();
	quadrado.colorir("Azul");
	System.out.println();
	
	circulo.desenhar();
	circulo.colorir("Verde");
	System.out.println();
	
}
}
