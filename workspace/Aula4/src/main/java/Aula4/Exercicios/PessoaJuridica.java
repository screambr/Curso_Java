package Aula4.Exercicios;

public class PessoaJuridica extends Pessoa {
	private int cnpj;

	public PessoaJuridica(String nome, int cnpj) {
		super(nome);
		this.cnpj = cnpj;
	}

	public int getcnpj() {
		return cnpj;
	}

	public void setcnpj(int cnpj) {
		this.cnpj = cnpj;
	}

}
