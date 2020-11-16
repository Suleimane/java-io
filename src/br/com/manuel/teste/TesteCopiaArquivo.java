package br.com.manuel.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class TesteCopiaArquivo {
	public static void main(String[] args) throws IOException{
		//Socket s = new Socket(); // Escuta comunicação a partir de outpro computador;s
		InputStream fis = new FileInputStream("lorem.txt");//s.getInputStream();
		Reader isr = new InputStreamReader(fis, "UTF-8");
		BufferedReader bfr = new BufferedReader(isr);
		
		OutputStream fos = System.out;// new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bwt = new BufferedWriter(osw);
		
		String linha = bfr.readLine();
		
		while(linha != null && linha.isEmpty()) {
			bwt.write(linha);
			bwt.newLine();
			bwt.flush();
			linha = bfr.readLine();
		}
		bfr.close();
		bwt.close();
	}
	

}
