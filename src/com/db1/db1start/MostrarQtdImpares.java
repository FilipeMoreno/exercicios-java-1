package com.db1.db1start;

public class MostrarQtdImpares {
	
	public int numero(int numero) {

		int impar = 0; int par = 0;
		
		for (int i = 0; i < numero; i++) {
				
			if ((i % 2) == 0) {
				par = par + 1;
			}
			impar = numero - par;
		}
		return impar;
	}	
}

