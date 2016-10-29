package ExerciciosArrays;

import java.util.Scanner;

public class ExemplosForEachStrings {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String[] palavras =new String[5];
	
	for (int i = 0; i < palavras.length; i++) {
		System.out.println("palavras["+ i +"] =");
		palavras [i] = scanner.nextLine();
			
	}
	for (int i = 0; i < palavras.length; i++) {
		
	}
	scanner.close();
}
}
