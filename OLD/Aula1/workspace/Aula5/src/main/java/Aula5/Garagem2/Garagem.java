package Aula5.Garagem2;


import java.util.List;

public interface Garagem {

	public boolean adicionar(Veiculo veiculo);

	public boolean vender(String placa);

	public Veiculo buscar(String placa);

	public List<Veiculo> listar();

}