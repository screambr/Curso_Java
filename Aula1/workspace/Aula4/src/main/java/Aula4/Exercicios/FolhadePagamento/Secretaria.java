package Aula4.Exercicios.FolhadePagamento;

public class Secretaria extends Funcionario {

	public Secretaria(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	protected double getPorcentagemAdicional() {
		return 0;
	}
}