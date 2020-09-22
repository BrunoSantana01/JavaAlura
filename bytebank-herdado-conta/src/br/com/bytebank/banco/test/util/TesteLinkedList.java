package br.com.bytebank.banco.test.util;

import java.util.LinkedList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteLinkedList {

	public static void main(String[] args) {
		// <> s�o conhecidos como Generics
		LinkedList<Conta> lista = new LinkedList<Conta>();

		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);

		System.out.println(lista.size());
		Conta ref = (Conta) lista.get(0);

		System.out.println(ref.getNumero());
		System.out.println("Tamanho " + lista.size());

		lista.remove(0);

		System.out.println("Tamanho " + lista.size());
		
		
		for(int i =0 ; i< lista.size(); i++){
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		
		for(Object oRef : lista){ // para cada oRef de lista, fa�a:y
			System.out.println(oRef);
			
			
		}
		
	}
}
