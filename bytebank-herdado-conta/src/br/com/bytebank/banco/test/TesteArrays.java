package br.com.bytebank.banco.test;

public class TesteArrays {
	public static void main(String[] args) {
		
		
		int [] idades = new int [5];
		
		idades[0] = 29;
		
		System.out.println(idades[0]);
		
		for( int i =0; i < idades.length; i++){ // esse for apenas adiciona os valores dentro do array;
			idades[i] = i * i; 
		}
		
		
		for( int i =0; i < idades.length; i++){// esse for imprime os valores add anteriormente.
			System.out.println(idades[i]); 
		}
		
	}

}
