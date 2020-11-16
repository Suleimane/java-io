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

public class TesteSystemIn {
	
	public static void main(String[] args) throws IOException{
		InputStream fis = new FileInputStream("lorem.txt"); //System.in;
		Reader isr = new InputStreamReader(fis);
		BufferedReader bfr = new BufferedReader(isr);
		
		OutputStream fos = new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bwt = new BufferedWriter(osw);
		
		String linha = bfr.readLine();
		
		while(linha != null && linha.isEmpty()) {
			bwt.write(linha);
			bwt.newLine();
			linha = bfr.readLine();
		}
		bfr.close();
		bwt.close();
	}

}
