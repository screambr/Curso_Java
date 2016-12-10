
public class Ponto {
	// Inicializado com valor que eu quero
	double x = 0.0;
	// Inicializado com valor padrao
	double y;
	
	public Ponto(double coordX, double coordY){
		x = coordX;
		y = coordY;
		
	}
	public Ponto(double coordX){
		x= coordX;
		y = 0;
	}
	
	/**
	 * Metodo deslocar que recebe dois parametros double
	 * 
	 * @param deltax
	 * @param deltay
	 */
	public void deslocar(double deltax, double deltay){
		x += deltax;
		y += deltay;
	}
	public void zerar(){
		x = 0;
		y = 0;
	}
	/**
	 * Exemplo de metodo de retorno
	 * 
	 * @return
	 */
	public boolean isYMenorQUeZero(){
		if (y < 0)
			return true;
		return false;
	}
}
