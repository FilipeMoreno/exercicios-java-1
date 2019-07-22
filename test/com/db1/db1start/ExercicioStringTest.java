package com.db1.db1start;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

public class ExercicioStringTest {
	
	private ExercicioString exercicioString;
	
	@Before
	public void setUp() {
		exercicioString = new ExercicioString("DB1Start");
	}
	
	@Test
	public void deveMostrarMaiusculo() {
		String maiusculo = exercicioString.Maiusculo();
		Assert.assertEquals("DB1START", maiusculo);
	}
	@Test
	public void deveMostrarMinusculo() {
		String minusculo = exercicioString.Minusculo();
		Assert.assertEquals("db1start", minusculo);
	}
	@Test
	public void contagemcaracteres(){
		int caracteres = exercicioString.Contagem("DB1Start");
		Assert.assertEquals(8, caracteres);
	}
	@Test
	public void contagemcaracteres2() {
		int caracteres = exercicioString.Contagem2(" DB1START ");
		Assert.assertEquals(10, caracteres);
	}
	@Test
	public void RemoverEspaco() {
		String texto = exercicioString.RemoverEspacos(" DB1Start ");
		int caracteres = texto.length();
		Assert.assertEquals(8, caracteres);
	}
	@Test
	public void retornar4PrimeirasLetras() {
		String nomeCompleto = exercicioString.QuatroPrimeirasLetras("Filipe Moreno");
		Assert.assertEquals("Fili", nomeCompleto);
	}
	
	@Test
	public void retornarAPartirDa3Letra() {
		String nomeCompleto = exercicioString.apartir3Letra("Filipe Moreno");
		Assert.assertEquals("ipe Moreno", nomeCompleto);
	}
	@Test
	public void retornarUltimas4Letras() {
		String nomeCompleto = exercicioString.ultimasQuatroLetras("Filipe Moreno");
		Assert.assertEquals("reno", nomeCompleto);
	}
	
	@Test
	public void substrituirPrimeiroNome() {
		String nomeCompleto = exercicioString.substrituirPrimeiroNome("Filipe Moreno");
		Assert.assertEquals("Aluno Moreno", nomeCompleto);
	}
	
	@Test
	public void inverterString() {
		String inverterString = exercicioString.inverterString();
		Assert.assertEquals("tratS1BD", inverterString);
	}
	
	@Test
	public void contarVogais() {
		int contarVogais = exercicioString.contarVogais();
		Assert.assertEquals(1, contarVogais);
	}
	
	@Test
	public void separarTexto() {
		String separarTexto = exercicioString.separarTexto("Banana, Maça, Melancia");
		Assert.assertEquals("Banana\n Maça\n Melancia", separarTexto);
	}
		
}
