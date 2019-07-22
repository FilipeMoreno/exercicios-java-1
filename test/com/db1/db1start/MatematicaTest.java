package com.db1.db1start;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

public class MatematicaTest {
	
	private Matematica matematica;
	
	@Before
	public void setUp() {
		matematica = new Matematica(6,8,16);
	}
	
	@Test
	public void menorEntreDoisNumeros() {
		double menorDois = matematica.menorDois();
		Assert.assertEquals(6, menorDois, 0.0001);
	}
	
	@Test
	public void menorEntreTresNumeros() {
		double menorTres = matematica.menorTres();
		Assert.assertEquals(6, menorTres, 0.0001);
	}
	
	@Test
	public void mediaTresNumeros() {
		double media = matematica.mediaTresNumeros();
		Assert.assertEquals(10, media, 0.0001);
	}
	
	@Test
	public void areaTriangulo() {
		double area = matematica.areaTriangulo(10, 10);
		Assert.assertEquals(50, area, 0.0001);
	}
	
	

}
