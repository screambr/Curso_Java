package Aula4.Exercicios;

public class TestarAnimal {
public static void main(String[] args) {
	Jacare jacare = new Jacare();
	Baleia baleia = new Baleia();
	Humano humano = new Humano();
	Veterinario veterinario = new Veterinario();
	System.out.println("\tExaminando a Baleia\t");
	veterinario.examinar(baleia);
	System.out.println("\tExaminando a Jacare\t");
	veterinario.examinar(jacare);
	
	
	System.out.println("\tExaminando Humano\t");
	veterinario.examinar(humano);
	veterinario.examinar(veterinario);
}
}
