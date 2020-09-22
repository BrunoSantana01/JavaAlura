package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {
	public static void main(String[] args) throws IOException {
		
		// Fluxo de entrada com Arquivo
		FileOutputStream fos = new FileOutputStream("lorem2.txt"); 
		Writer osw = new OutputStreamWriter(fos); 
		
		BufferedWriter bw = new BufferedWriter(osw); 
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
		
		bw.close();
	}
}
