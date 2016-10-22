package PadraoJavaBens;

public class Funcionario {
		private String nome;
		private Double salario;
		private String cargo;
		private Double porcentagemBonificacao;

		public Funcionario(String nome, Double salario, String cargo, Double porcentagemBonificacao) {
			this.nome = nome;
			this.salario = salario;
			this.cargo = cargo;
			this.porcentagemBonificacao=porcentagemBonificacao;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Double getSalario() {
			return salario;
		}

		public void setSalariol(Double salario) {
			this.salario = salario;
		}

		public Double getPorcentagemBonificacao() {
			return porcentagemBonificacao;
		}

		public void setPorcentagemBonificacao(Double salario) {
			this.porcentagemBonificacao = porcentagemBonificacao;
		}

}