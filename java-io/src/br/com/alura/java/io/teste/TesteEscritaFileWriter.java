package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {
	public static void main(String[] args) throws IOException {

		// Fluxo de entrada com Arquivo
		// FileOutputStream fos = new FileOutputStream("lorem2.txt");
		// Writer osw = new OutputStreamWriter(fos);
		// BufferedWriter bw = new BufferedWriter(osw);

		//FileWriter fw = new FileWriter("lorem6.txt");
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem.7.txt"));
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, "
				+ "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
		bw.write(System.lineSeparator());
		bw.write(System.lineSeparator());
		bw.close();

	}
}
