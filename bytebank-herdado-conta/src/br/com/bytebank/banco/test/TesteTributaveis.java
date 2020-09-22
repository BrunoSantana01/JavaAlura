package br.com.bytebank.banco.test;
import br.com.bytebank.banco.modelo.*;

public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 333);
		
		cc.deposita(100.0);
		
		SeguroDeVida sv = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		
		calc.registro(cc);
		calc.registro(sv);
		
		System.out.println(calc.getTotalImposto());
		
	}			

}		
		