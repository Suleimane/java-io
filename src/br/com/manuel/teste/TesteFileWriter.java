package br.com.manuel.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteFileWriter {
	
	public static void main(String[] args) throws IOException {
//		FileWriter fw = new FileWriter("lorem2.txt");
//		fw.write("Era uma vez na china!");
//		fw.write(System.lineSeparator());
//		fw.write("Resgate de Soldado Rian");
//		fw.write(System.lineSeparator());
//		fw.close();
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		bw.write("A volta dos que não foram.");
		bw.newLine();
		bw.write("Trnça de rei Careca.");
		bw.close();
	}

}
