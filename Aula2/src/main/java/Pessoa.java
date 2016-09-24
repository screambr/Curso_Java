
public class Pessoa {
	String nome;
	String rg;
	String cpf;
	public Pessoa(String nome, String rg, String cpf){
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
			
		
	}
	@Override
	public String toString() {
		return nome+rg+cpf;
	}
}
