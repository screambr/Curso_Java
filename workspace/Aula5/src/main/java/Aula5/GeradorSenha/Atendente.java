package Aula5.GeradorSenha;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Aula5.Garagem.veiculo;

public class Atendente {
	List<String> listaSenha =new ArrayList<String>();

	public static void main(String[] args) {
		String senhaPadrao;
		String senhaIdoso;
		int a = 0;
		int b = 0;
		
		senhaPadrao = "P"+ a++;
		senhaIdoso = "P"+ b++;
		
		

		GeradorSenha novasenha = new GeradorSenha();
		novasenha.iniciar();
	}
}
