package com.db1.db1start;

public class App {
	
	public static void main(String[] args ) {
		
		int tamanhoDoNome = Nome.tamanho("Filipe Moreno");
		System.out.println("Tamanho do nome: " + tamanhoDoNome + " caracteres");
		
		Integer soma = Inteiro.Soma(10, 20);
		Integer subtracao = Inteiro.Subtracao(789, 458);
		System.out.println("Soma: " + soma);
		System.out.println("Subtracao: " + subtracao);
		
		String maiusculo = Texto.Maiusculo("filipe");
		String minusculo = Texto.Minusculo("FILIPE");
		System.out.println("Maiusculo: " + maiusculo);
		System.out.println("Minusculo: " + minusculo);
		
		Matematica matematica = new Matematica(300,65,10);
		System.out.println("Menor entre dois numeros: " + matematica.menorDois());
		System.out.println("Menor entre tres numeros: " + matematica.menorTres());
		
		Calculadora calculadora = new Calculadora(10,20);
		System.out.println(calculadora.somar());
		System.out.println(calculadora.subtrair());
	}

} 