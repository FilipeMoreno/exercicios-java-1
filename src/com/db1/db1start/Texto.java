package com.db1.db1start;

public class Texto {
	
	public static String Maiusculo(String texto) {
		if (texto != null) {
			String maiusculo = texto.toUpperCase();
			return maiusculo;
		}
		return null;
	}
	
	public static String Minusculo(String texto) {
		if (texto != null) {
			String minusculo = texto.toLowerCase();  
			return minusculo;
		}
		return null;
	}

}
