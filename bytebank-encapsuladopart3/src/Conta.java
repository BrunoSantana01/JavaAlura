

public class Conta{
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int totalContas;

	
	public Conta(int agencia, int numero){
		Conta.totalContas++;
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 0;
		System.out.println("Criando a conta " + this.numero);
		System.out.println("Total de contas abertas at� o momento: " + Conta.totalContas);
	}

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
	
	public int getNumero(){
		return this.numero;
	}
	
	public void setNumero(int novoNumero){
		if(this.numero <= 0){
			System.out.println("Numero de conta inv�lido.");
			return; // return "vazio" porque o metodo � void
		} else this.numero = novoNumero;
	}
	
	public int getAgencia(){
		return this.agencia;
	}
	
	public void setAgencia(int agencia){
		if(this.agencia <= 0){
			System.out.println("Numero de agencia inv�lido.");
			return; // return "vazio" porque o metodo � void
		}
		else this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular){ //Variavel do tipo Cliente(Classe)
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal(){
		return Conta.totalContas;
	}
}