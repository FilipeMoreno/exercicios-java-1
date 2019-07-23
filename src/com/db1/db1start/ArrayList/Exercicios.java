package com.db1.db1start.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Exercicios {
	
	//01 and 02
	public List<String> cores() {
		
		List<String> cores = new ArrayList<String>();
		cores.add("Preto");
		cores.add("Branco");
		cores.add("Azul");
		cores.add("Vermelho");
		
		return cores;
	}
	
	//03
	public List<String> nomes(String texto1, String texto2, String texto3){
		
		List<String> nomes = new ArrayList<String>();
		nomes.add(texto1);
		nomes.add(texto2);
		nomes.add(texto3);
		nomes.remove(texto2);
		return nomes;
	}
	
	
	//04
	public List<String> cores2(String remover) {
		List<String> cores = new ArrayList<String>();
		cores.add("Preto");
		cores.add("Branco");
		cores.add("Azul");
		cores.add("Vermelho");
		if (cores.equals(remover) == false) {
			cores.remove(remover);
		}
		
		return cores;
	}
	
	//05
	public List<String> coresOrdenadas() {
		
		List<String> coresOrdenadas = new ArrayList<String>();
		coresOrdenadas.add("Preto");
		coresOrdenadas.add("Branco");
		coresOrdenadas.add("Azul");
		coresOrdenadas.add("Vermelho");
		coresOrdenadas.sort((a, b) -> a.compareTo(b));
		return coresOrdenadas;
	}
	
	//06
	public List<String> coresDecrescente() {
		
		List<String> coresDecrescente = new ArrayList<String>();
		coresDecrescente.add("Preto");
		coresDecrescente.add("Branco");
		coresDecrescente.add("Azul");
		coresDecrescente.add("Vermelho");
		coresDecrescente.sort((a, b) -> b.compareTo(a));
		return coresDecrescente;
	}
	
	//07
	public List<List<Integer>> verificarParImpar(){
		
		List<Integer> numeros = new ArrayList<Integer>();
		List<Integer> pares = new ArrayList<>();
		List<Integer> impares = new ArrayList<>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		numeros.add(6);
		
		 numeros.forEach(numero -> {
		        if (numero % 2 == 0) pares.add(numero);
		        else impares.add(numero);
		    });
		 
		List<List<Integer>> listanumeros = new ArrayList<>();
		listanumeros.add(impares);
		listanumeros.add(pares);
		
		return listanumeros;
	}
	
	//08
	public List<String> nomes(){
		List<String> nomes = new ArrayList<String>();
		nomes.add("Ana");
		nomes.add("Ana Laura");
		nomes.add("Jose");
		nomes.add("Wagner");
		nomes.add("Rodolfo");
		nomes.add("Roberval");
		nomes.add("Rodolpho");
		nomes.add("Vagner");
		nomes.add("José");
		nomes.add("Joaldo");
		nomes.add("Clecio");
		nomes.add("José"); 
		nomes.add("Maria"); 
		nomes.add("Marcos"); 
		nomes.sort((a, b) -> a.compareTo(b));
		return nomes;
	}
	
	//09
	public Integer somarNumeros() {
		List<Integer> numeros = new ArrayList<Integer>();
		Integer soma = 0;
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		
		for (Integer i : numeros) {
			soma += i;
		}
		return soma;
	}
	
	//10
	public Double mediaNumeros() {
		List<Double> numeros = new ArrayList<Double>();
		Double media = 0.0, soma = 0.0;
		numeros.add(1.0);
		numeros.add(2.0);
		numeros.add(3.0);
		
		for (Double i : numeros) {
			soma += i;
		}
		media = soma / numeros.size();
		return media;
	}
	
	//11
	public Integer menorValor() {
		List<Integer> numeros = new ArrayList<Integer>();
		Integer menor = 0, maior = 0;
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		
		for (Integer i : numeros) {
			if (i > maior) {
				maior = i;
				menor = i;
			}	
		}
		
		for (Integer i : numeros) {
			if (i > menor) {
			} else {
				menor = i;
			}
		}
		return menor;
	}
	
	//12
	public Integer maiorValor() {
		List<Integer> numeros = new ArrayList<Integer>();
		Integer maior = 0;
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		for (Integer i : numeros) {
			if (i > maior) {
				maior = i;
			}	
		}
		return maior;
		
	}
	
	//13
	public List<Integer> removerImpares() {
		List<Integer> numeros = new ArrayList<Integer>();
		List<Integer> pares = new ArrayList<Integer>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		
		for (Integer i : numeros) {
			if (i % 2 == 0) {
				pares.add(i);
			}
		}
		return pares;
	}
	
	//14
	public List<String> contarVogais(String texto){
		List<String> vogais = new ArrayList<String>();
		String texto2 = texto.toLowerCase();
		for (int i = 0; i < texto2.length(); i++) {
			if ((texto2.charAt(i)) == 'a'){
				vogais.add("a");
			} else if (texto2.charAt(i) == 'e'){
				vogais.add("e");
			} else if (texto2.charAt(i) == 'i'){
				vogais.add("i");
			} else if (texto2.charAt(i) == 'o'){
				vogais.add("o");
			} else if (texto2.charAt(i) == 'u'){
				vogais.add("u");
			} 
		}
		return vogais;
	}

}
