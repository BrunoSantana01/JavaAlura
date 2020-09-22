package br.com.bytebank.banco.test;
import br.com.bytebank.banco.modelo.*;

public class TesteSaca2 {
public static void main(String[] args) {
	ContaCorrente cc = new ContaCorrente(123, 321);
	
	cc.deposita(200.0);
	
	try {
		cc.saca(210.0);
	} catch (SaldoInsuficienteException ex) {
		System.out.println("Ex: " + ex.getMessage());
		ex.printStackTrace();
	}
	
	System.out.println(cc.getSaldo());
}
}
