package br.com.manuel.teste;

import java.io.FileInputStream;
import java.util.Locale;
import java.util.Scanner;

public class TestaScanner {
	
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(new FileInputStream("contas.csv"), "UTF-8");
		while(scan.hasNextLine()) {
		String linha = scan.nextLine();
		/*while(scan.hasNextLine()) {
			String linha = scan.nextLine();
			System.out.println(linha);
		}*/
		Scanner scan2 = new Scanner(linha);
		scan2.useLocale(Locale.US);
		scan2.useDelimiter(",");
		
		String valor1 = scan2.next();
		int valor2 = scan2.nextInt();
		int valor3 = scan2.nextInt();
		String valor4 = scan2.next();
		double valor5 = scan2.nextDouble();
		
		String valoresFormatados = String.format(new Locale("pt","BR"),"%s - %04d-%d %s %010.2f", valor1, valor2, valor3, valor4, valor5);
		
		System.out.println(valoresFormatados);
		
		scan2.close();
		//scan.close();
		}
	}

}
