package bytebank;

public class TesteReferencias {
	public static void main(String[] args){
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("O Saldo da primeira conta � " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println(primeiraConta);
		
		if(primeiraConta == segundaConta) System.out.println("S�o a mesmissima conta.");
		// isso acontece por que a REFERENCIA das duas variaveis s�o ao mesmo objeto.
	
	}
}
