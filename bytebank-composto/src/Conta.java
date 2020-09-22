

public class Conta {
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;


	public void deposita(double valor) {
		this.saldo += valor;
	}

	// public void saca(double valor){
	// this.saldo-= valor;
	// System.out.println("Novo saldo: " + this.saldo);
	// }

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			//System.out.println("Transferencia concluida para a conta: " + destino.numero);
			return true;
		} else
			return false;

	}
	
	public double getSaldo(){
		return this.saldo;	
	}
}