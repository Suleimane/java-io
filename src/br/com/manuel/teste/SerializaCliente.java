package br.com.manuel.teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializaCliente{

	public static void main(String[] args) throws IOException, ClassNotFoundException{
//		Cliente cl = new Cliente();
//		cl.setNome("Iris Lopes Nanque");
//		cl.setCpf("11111111111");
//		cl.setProfissao("Médica");
//		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//		oos.writeObject(cl);
//		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente cl1 = (Cliente) ois.readObject();
		System.out.println(cl1.getNome());
	}

}
