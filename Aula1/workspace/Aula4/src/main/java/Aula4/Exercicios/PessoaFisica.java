package Aula4.Exercicios;

public class PessoaFisica extends Pessoa {
	private int cpf;

	public PessoaFisica(String nome, int cpf) {
		super(nome);
		this.cpf = cpf;
		}

	public double getcpf() {
		return cpf;
	}

	public void setcpf(int cpf) {
		this.cpf = cpf;
	}

}
