package Aula5.List;

public class Pessoa implements Comparable<Pessoa>{
	private String nome;
	private String cpf;

	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int compareTo(Pessoa outraPessoa) {
		return nome.compareTo(outraPessoa.nome);
	}
}