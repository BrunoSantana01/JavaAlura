package br.com.bytebank.banco.modelo;

/**
 *  Classe representa a forma de uma conta.
 * @author brusa
 *
 */
public abstract class Conta extends Object implements Comparable<Conta>{
	protected double saldo;
	protected int agencia;
	protected int numero;
	protected Cliente titular;
	protected static int totalContas;
	
	
	/**
	 * 
	 * 
	 * @param agencia
	 * @param numero
	 */

	public Conta(int agencia, int numero) {
		Conta.totalContas++;
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 0;
		// System.out.println("Criando a conta " + this.numero);
		// System.out.println("Total de contas abertas at� o momento: " +
		// Conta.totalContas);
	}

	public abstract void deposita(double valor);
	// this.saldo += valor;

	// public void saca(double valor){
	// this.saldo-= valor;
	// System.out.println("Novo saldo: " + this.saldo);
	// }

	public void saca(double valor) throws SaldoInsuficienteException {

		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor a sacar: " + valor);
		}
		this.saldo -= valor;

	}

	public void transfere(double valor, Conta destino)throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int novoNumero) {
		if (this.numero <= 0) {
			System.out.println("Numero de conta inv�lido.");
			return; // return "vazio" porque o metodo � void
		} else
			this.numero = novoNumero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (this.agencia <= 0) {
			System.out.println("Numero de agencia inv�lido.");
			return; // return "vazio" porque o metodo � void
		} else
			this.agencia = agencia;
	}

	public void setTitular(Cliente titular) { // Variavel do tipo
												// Cliente(Classe)
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}

	public static int getTotal() {
		return Conta.totalContas;
	}
	
	@Override
	public int compareTo(Conta outra) {
		return Double.compare(this.saldo, outra.saldo);
	}
	
	
	@Override
	public String toString() {
		return "Numero " + this.numero + " Agencia " + this.agencia + "Titular: " + this.getTitular().getNome() +  ", saldo: " + this.getSaldo();
	}
}