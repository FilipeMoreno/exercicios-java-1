package com.db1.db1start;

public class Calculadora {
	
	private int numero1;
	private int numero2;
	
	public Calculadora(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
			
	public int somar() {
		return numero1 + numero2;
	}
	
	public int subtrair() {
		if (numero1 > numero2) {
			return numero1 - numero2;
		}
		return numero2 - numero1;
	}
	
	public int multiplicacao() {
		return numero1 * numero2;
	}
	
	public int divisao() {
		return numero1 / numero2;
	}
	
	public int maior() {
		if (numero1 > numero2) {
			return numero1;
		}
		return numero2;
	}
	
}
