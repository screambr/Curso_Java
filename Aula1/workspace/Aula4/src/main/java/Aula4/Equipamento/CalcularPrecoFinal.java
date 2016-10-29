package Aula4.Equipamento;

public class CalcularPrecoFinal {
private static final int Ipq = 0;
public static void main(String[] args) {
	Equipamento televisao = new Televisao("Sansumg",1500, 55);
	Equipamento cadeira = new Cadeira("Fabricante Cadeira",100);
	Equipamento impressora = new Impressora("HP",200, 40);

	double valorTotal = ImprimePrecosFinais(televisao, cadeira, impressora);
	System.out.println("Valor total: " + valorTotal);
	// Preço final de uma televisao deve sofrer acrescimo de 2% devido ao IPQ(imposto qualquer
	// Preço final de uma impresora deve sofrer acrescimo de 5% devido ao IPQ(imposto qualquer
}
public static double ImprimePrecosFinais(Equipamento... equipamentos){
	double valorToral = 0;
	
	for (Equipamento equipamento : equipamentos){
		System.out.println(equipamento.getClass().getSimpleName() + ": " + equipamento.calcPreco());
		Object valorTotal = equipamento.calularPrecoFinal();
				
	}
	double valortoal = 0;
		;
	return valortoal;
}
}
