package com.db1.db1start;

public class ExercicioString {
	
	private String texto;
		
	public ExercicioString(String texto) {
			this.texto = texto;
		}
	
	public String Maiusculo() {
		return texto.toUpperCase();
	}
	
	public String Minusculo() {
		return texto.toLowerCase();
	}
	
	public int Contagem(String texto2) {
		return texto.length();
	}
	
	public int Contagem2(String texto2) {
		return texto2.length();
	}
	
	public String RemoverEspacos(String texto2) {
		String texto;
		texto = texto2.trim();
		return texto;
	}
	
	public String QuatroPrimeirasLetras(String texto2) {
		return texto2.substring(0,4);
	}
	
	public String apartir3Letra(String texto2) {
		int qtd = texto2.length();
		return texto2.substring(3,qtd);
	}
	
	public String ultimasQuatroLetras(String texto2) {
		int qtd = texto2.length();
		return texto2.substring(qtd - 4,qtd);
	}
	
	public String substrituirPrimeiroNome(String texto2) {
		int i, qtdCaracteres, qtd = 0;
		qtdCaracteres = texto2.length();
		for (i = 0; i < texto2.length(); i++) {
			if (texto2.charAt(i) == ' ') {
				return texto2.replace(texto2, "Aluno") + texto2.substring(i,qtdCaracteres);
			}
		}
		
		return texto2.substring(qtd,qtdCaracteres);
	}
	
	public int contarVogais(){
		int contador = 0;
		String texto2 = texto.toLowerCase();
		for (int i = 0; i < texto2.length(); i++) {
			if ((texto2.charAt(i)) == 'a' || (texto2.charAt(i)) == 'e' || (texto2.charAt(i)) == 'i' || (texto2.charAt(i)) == 'o' || (texto2.charAt(i)) == 'u') {
				contador++;
			}
		}
		return contador;
	}
	
	public String inverterString() {
		String fraseInvertida = new StringBuilder(texto).reverse().toString();
		return fraseInvertida;

	}
	
	public String separarTexto(String texto2) {
	String array[] = new String[2];
	array = texto2.split(",");
	return array[0] + "\n" + array[1] + "\n" +  array[2];
}
		
}

