package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta conta = new Conta();

		conta.deposita(100.0);

		System.out.println(conta.saldo);

		conta.saca(75.0);

		System.out.println(conta.saldo);

		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(50);

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);

		if (contaDaMarcela.transfere(100.0, contaDoPaulo)) {
			System.out.println("Transferencia concluida para a conta: " + contaDoPaulo.numero);
		} else
			System.out.println("Saldo insuficiente.");
		
		contaDoPaulo.titular = "Paulo Silveira";
		System.out.println(contaDoPaulo.titular);

	}

}
