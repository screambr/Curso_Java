
public class Interruptor {
	Lampada lampada;
public Interruptor(Lampada lampada) {
	this.lampada = lampada;
}
	
	public void Apertar() {
if (lampada.ligada()){
	lampada.Desligar();
	
} else {
	lampada.ligada();
}		
	}

}
