
public class Lampada {
	String watts;
	String fabricante;
	boolean ligada;
	public boolean ligada(){
		return ligada;
	}
	public Lampada(String watts, String fabricante){
		this.watts = watts;
		this.fabricante = fabricante;
		
			
	}
	public void Ligar() {
	System.out.println("Lampada ligada");	
	this.ligada = true; 
	}
	public void Desligar() {
	System.out.println("Lampada Desligada");	
	this.ligada = false; 
	
}
	@Override
	public String toString() {
		return watts+fabricante;
	}
}
