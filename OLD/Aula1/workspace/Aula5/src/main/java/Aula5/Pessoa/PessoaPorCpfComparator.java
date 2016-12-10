package Aula5.Pessoa;


import java.util.Comparator;

public class PessoaPorCpfComparator implements Comparator<Pessoa> {
	
	@Override
	public int compare(Pessoa pessoa, Pessoa outraPessoa) {
		return pessoa.getCpf().compareTo(outraPessoa.getCpf());
	}
}