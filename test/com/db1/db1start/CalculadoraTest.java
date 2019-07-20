package com.db1.db1start;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

public class CalculadoraTest {
	
	private Calculadora calculadora;
	
	@Before
	public void setUp() {
		calculadora = new Calculadora(10,5);
	}
	
	@Test
	public void deveSomarDoisValores() {
		int soma = calculadora.somar();
		Assert.assertEquals(15, soma);
	}
	@Test
	public void deveSubtrairDoisValores() {
		int subtracao = calculadora.subtrair();
		Assert.assertEquals(5, subtracao);
	}
	@Test
	public void deveMultiplicarDoisValores() {
		int multiplicacao = calculadora.multiplicacao();
		Assert.assertEquals(50, multiplicacao);
	}
	@Test
	public void deveDividirDoisValores() {
		int divisao = calculadora.divisao();
		Assert.assertEquals(2, divisao);
	}
	@Test
	public void deveMostrarOMaior() {
		int maior = calculadora.maior();
		Assert.assertEquals(10, maior);
	}
		
}
