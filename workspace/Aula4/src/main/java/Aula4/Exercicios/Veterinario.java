package Aula4.Exercicios;

public class Veterinario extends Humano{
public static void examinar(Animal animal) {
	if (animal instanceof Humano){
		//throw new IllegalArgumentException("Não posso examinar humanos");
		System.out.println("Não posso examinar humanos");
			throw new IllegalArgumentException("Não posso examinar humanos");
		
	}
	animal.emitirSom();


}
}
