package Aula5.List;

import java.util.HashSet;
import java.util.Set;

public class TestarSets {
	public static void main(String[] args) {
		Set<String> meuSet = new HashSet<>();
//		meuSet.add(e);
//		meuSet.remove();
		meuSet.add("valor 1");
		meuSet.add("valor 2");
		meuSet.add("valor 3");
		meuSet.add("valor 4");
		for (String valor : meuSet) {
			System.out.println(valor);
		}
	}

}
