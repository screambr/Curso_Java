
public class Conta2 {
	double saldo;
	
	public Conta2() {
		this.saldo=0;
	}
	public void sacar(double valor){
		if (valor > saldo) {
			return false;
		}
		saldo -= valor;
		return true;
	}
	public void depositar(double valor) {
		saldo += valor;
	}
	public void obterSaldo() {
		return saldo;
	}
}
