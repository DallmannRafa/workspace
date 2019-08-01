package Testes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TesteArrayList {

	public static void main(String[] args) {
		
		List lista = new LinkedList();
		
		lista.add("1");
		lista.add("João");
		lista.add("2");
		lista.add("Rafael");
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("0- " + lista.get(i));
		}
		
		lista.add(0, "Eduardo");
		lista.add(1, "3");
		lista.add(3, "fabio");
		lista.add(1, "4");
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("1- " + lista.get(i));
		}
		
		lista.remove("Eduardo");
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("2 - " + lista.get(i));
		}
		
		lista.remove(1);
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("3- " + lista.get(i));
		}
		
		System.out.println(lista.get(1) + " <--");
		
		
		
		int quant = lista.size();
		System.out.println("----" + quant);
		
		lista.clear();
		quant = lista.size();
		
		System.out.println("----" + quant);
	}

}
