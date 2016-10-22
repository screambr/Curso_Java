package Aula4.Equipamento;

public class Teclado extends Equipamento {
	private String layout;

	public Teclado(String fabricante, double preco, String layout) {
		super(fabricante, preco);
		this.layout=layout;
	}
	public String layout() {
		return layout;
	}

	public void setlayout(String layout) {
		this.layout = layout;
	}
}
