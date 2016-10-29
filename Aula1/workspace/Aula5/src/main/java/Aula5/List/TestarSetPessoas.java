package Aula5.List;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestarSetPessoas {
	public static void main(String[] args) {
		Set<Pessoa> pessoas = new HashSet<>();
		pessoas.add(new Pessoa("Juquinha", "1"));
		pessoas.add(new Pessoa("Flavia", "2"));
		pessoas.add(new Pessoa("Julia", "3"));
		pessoas.add(new Pessoa("Marcio", "4"));
		pessoas.add(new Pessoa("Manoela", "5"));

		pessoas.remove(new Pessoa("Manoela", "5"));

		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getNome() + " " + pessoa.getCpf());
		}
		Set<Pessoa> pessoaOrdenadas = new TreeSet<>(new PessoaPorCpfComparator());
		pessoas.add(new Pessoa("Juquinha", "1"));
		pessoas.add(new Pessoa("Flavia", "2"));
		pessoas.add(new Pessoa("Julia", "3"));
		pessoas.add(new Pessoa("Marcio", "4"));
		pessoas.add(new Pessoa("Manoela", "5"));
		
		for (Pessoa pessoa : pessoaOrdenadas) {
			System.out.println();	
		}
		
		}
}
