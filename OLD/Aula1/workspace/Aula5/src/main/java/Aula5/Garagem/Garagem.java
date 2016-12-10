package Aula5.Garagem;


import java.util.List;

import Aula5.Garagem2.Veiculo;

public interface Garagem {

	public boolean adicionar(Veiculo veiculo);

	public boolean vender(String placa);

	public Veiculo buscar(String placa);

	public List<Veiculo> listar();

}