package com.db1.db1start.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<String>();
		
		nomes.add("Maiko Cunha");
		nomes.add("Maiko Cunha");
		nomes.add("João");
		nomes.add("Maria");
		
		System.out.println(nomes);
		
		nomes.removeIf(banana -> banana.equals("Maiko Cunha"));
		
		System.out.println(nomes);
		
		nomes.add("Fernando");
		
		System.out.println(nomes);
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		nomes.add(2, "João Felipe");
		
		System.out.println(nomes);
		
		List<Integer> numeros = new ArrayList<>();
		
		numeros.add(2);
		numeros.add(3);
		
		System.out.println(numeros);
		
		List<List<String>> todosOsNomes = new ArrayList<>();
		
		List<String> nomesComLetraA = new ArrayList<>();
		
		nomesComLetraA.add("Ana");
		
		todosOsNomes.add(nomes);
		todosOsNomes.add(nomesComLetraA);
		
		System.out.println(todosOsNomes);
		
	}


}
