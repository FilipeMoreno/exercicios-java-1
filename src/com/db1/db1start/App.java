package com.db1.db1start;

public class App {
	
	public static void main(String[] args ) {
		int tamanhoDoNome = Nome.quantidadeDeCaracteres("Filipe Moreno");
		System.out.println("Tamanho do nome: " + tamanhoDoNome + " caracteres");
		Integer soma = Inteiro.Soma(10, 20);
		Integer subtracao = Inteiro.Subtracao(30, 130);
		System.out.println("Soma: " + soma);
		System.out.println("Subtracao: " + subtracao);
		String maiusculo = Texto.Maiusculo("filipe");
		String minusculo = Texto.Minusculo("FILIPE");
		System.out.println("Maiusculo: " + maiusculo);
		System.out.println("Minusculo: " + minusculo);
		float compdois = Matematica.dois(3, 1);
		float comptres = Matematica.tres(1, 11, 27);
		System.out.println("Menor entre dois numeros: " + compdois);
		System.out.println("Menor entre tres numeros: " + comptres);
		
	}

} 