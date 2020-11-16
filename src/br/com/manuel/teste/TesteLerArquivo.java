package br.com.manuel.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLerArquivo {
	
	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("lorem.txt");
		InputStreamReader reader = new InputStreamReader(file);
		BufferedReader buffer = new BufferedReader(reader);
		String linha = buffer.readLine();
		while(linha != null) {
			System.out.println(linha);
			linha = buffer.readLine();
		}
		
		buffer.close();
	}

}
