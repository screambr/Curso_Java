package Aula4.Exercicios.FolhadePagamento;

public class Supervisor extends Funcionario {

	public Supervisor(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	protected double getPorcentagemAdicional() {
		return 0.1;
	}

}