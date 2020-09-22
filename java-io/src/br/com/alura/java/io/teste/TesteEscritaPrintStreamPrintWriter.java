package br.com.alura.java.io.teste;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaPrintStreamPrintWriter {
	public static void main(String[] args) throws IOException {

		// Fluxo de entrada com Arquivo
		// FileOutputStream fos = new FileOutputStream("lorem2.txt");
		// Writer osw = new OutputStreamWriter(fos);
		// BufferedWriter bw = new BufferedWriter(osw);
		//FileWriter fw = new FileWriter("lorem6.txt");
		//BufferedWriter bw = new BufferedWriter(new FileWriter("lorem.7.txt"));
		
		PrintStream ps = new PrintStream("lorem.txt");
		PrintStream ps1 = new PrintStream(new File("lorem.txt"));
		
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, "
				+ "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
		
		ps.println();
		
		ps.println("Hi!");
		
		
		
		ps.close();

	}
}
