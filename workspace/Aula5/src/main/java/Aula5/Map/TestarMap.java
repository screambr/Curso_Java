package Aula5.Map;
import java.util.HashSet;
import java.util.Map;

import Aula5.List.*;

public class TestarMap {
public static void main(String[] args) {
 Map<String, Pessoa> pessoasPorCpf = (Map<String, Pessoa>) new HashSet<>();
 
	pessoasPorCpf.put("0",new Pessoa("Juquinha", "0"));
	pessoasPorCpf.put("1",new Pessoa("Julia", "1"));
	pessoasPorCpf.put("2",new Pessoa("Marina", "2"));
	pessoasPorCpf.put("3",new Pessoa("Suzan", "3"));
	pessoasPorCpf.put("4",new Pessoa("Jose", "0"));
	
	System.out.println("pessoaPorCpf.size: " + pessoasPorCpf.size());
	System.out.println("pessoaPorCpf.containsKey(10): " + pessoasPorCpf.containsKey(10));
	System.out.println("pessoaPorCpf.containsKey(0): " + pessoasPorCpf.containsKey(0));
	
	

}
}
