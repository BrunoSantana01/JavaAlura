package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArraysReferencias {

	public static void main(String[] args) {

		// int [] idades = new int [5];

		Conta[] contas = new Conta[5];

		ContaCorrente cc1 = new ContaCorrente(22, 11);
		ContaPoupanca cc2 = new ContaPoupanca(22, 12);

		contas[0] = cc1;
		contas[1] = cc2;

		System.out.println(cc2.getNumero());
		System.out.println(contas[1].getNumero());

		ContaPoupanca ref = (ContaPoupanca) contas[1]; // type cast
		System.out.println(ref.getNumero());
		
		
		Cliente cliente = new Cliente();
		contas[2] = cc1;
	}

}
