package br.com.manuel.teste;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TestePrintStream {
	
	public static void main(String[] args) throws IOException{
		//PrintStream ps = new PrintStream(new File("lorem2.txt"));
		PrintWriter ps = new PrintWriter("lorem2.txt");
		ps.println("Era uma vez na china");
	    ps.println("Quem quer ser milionario2");
	    ps.close();
	}

}
