package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {
	public static void main(String[] args) throws IOException {
		
		// Fluxo de entrada com Arquivo
		FileInputStream fis = new FileInputStream("lorem.txt"); 
		// Estabelece a entrada, mas l� apenas os binarios//Saida do .read() : 34
		InputStreamReader isr = new InputStreamReader(fis); 
		/*L� os bits capturados com o FIS, capaz de retornar o numero de caracteres, mas n�o os caracteres//Saida do .read() : 34*/
		BufferedReader br = new BufferedReader(isr); //Aqui sim � capaz de apresentar os caracteres//Saida do .read() : Frase
		
		
		String linha = br.readLine();
		
		while(linha !=null){
			System.out.println(linha);
			linha = br.readLine();
		}
		
		br.close();
	}
}
