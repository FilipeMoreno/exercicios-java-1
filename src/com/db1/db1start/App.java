package com.db1.db1start;

import java.util.ArrayList;
import java.util.List;

public class App {
	
	public static void main(String[] args ) {
		
		List<String> nomes = new ArrayList<String>();
		
		nomes.add("Filipe");
		nomes.add("Amanda");
		nomes.add("Michele");
		nomes.add("Filipe");
		nomes.add("Filipe");
		
		System.out.println(nomes);

		nomes.removeIf(nome -> nome.contentEquals("Filipe"));
		nomes.add(1, "João");
		
		System.out.println(nomes);

		List<Integer> numeros = new ArrayList<>();
		
		numeros.add(2);
		numeros.add(3);
		
		System.out.println(numeros);
		
		List<List<String>> todosOsNomes = new ArrayList<>();
		
		System.out.println(todosOsNomes);
		
		todosOsNomes.add(nomes);
		
		
		}

} 