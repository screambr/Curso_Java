package Carro;

public class testarCarro {
public static void main(String[] args) {
	Carro primeiroCarro =new Carro("Ferrari", "430 Scuderia", "vermelha", 2009);
	Carro segundo = new Carro("Fiat", "Uno", "Branco", 2009);
	primeiroCarro.acelerar();
	primeiroCarro.acelerar();
	primeiroCarro.frear();
	primeiroCarro.acelerar();
	
	segundo.acelerar();
	segundo.acelerar();
	segundo.acelerar();
	segundo.frear();
	segundo.frear();
	
	System.out.println(primeiroCarro.velocidade);
	
	System.out.println(segundo.velocidade);
	
}
}
