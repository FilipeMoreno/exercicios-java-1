package com.db1.db1start.collections;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.db1.db1start.ArrayList.Exercicios;

public class ExerciciosTest {
	
	
	//01
	@Test
	public void retornarCores() {
		Exercicios exercicios = new Exercicios();
		List<String> cores = exercicios.cores();
		
		Assert.assertTrue(cores.contains("Preto"));
		Assert.assertTrue(cores.contains("Branco"));
		Assert.assertTrue(cores.contains("Vermelho"));
		Assert.assertTrue(cores.contains("Azul"));
	}
	
	//02
	@Test
	public void retornarQtdItens() {
		Exercicios exercicios = new Exercicios();
		List<String> qtditens = exercicios.cores();
		Assert.assertEquals(4, qtditens.size());
	}
	
	//03
	@Test
	public void deveRemoverOSegundo() {
		Exercicios exercicios = new Exercicios();
		List<String> nomes = exercicios.nomes("Filipe", "Mateus", "João");
		Assert.assertTrue(nomes.contains("Filipe"));
		Assert.assertTrue(nomes.contains("João"));
	}
	
	//04
	@Test
	public void coresOrdenadas() {
		Exercicios exercicios = new Exercicios();
		List<String> ordenados = exercicios.coresOrdenadas();
		Assert.assertEquals("Azul", ordenados.get(0));
		Assert.assertEquals("Branco", ordenados.get(1));
		Assert.assertEquals("Preto", ordenados.get(2));
		Assert.assertEquals("Vermelho", ordenados.get(3));
	}
	
	//05
	@Test
	public void coresComOpcaoRemocao() {
		Exercicios exercicios = new Exercicios();
		List<String> cores = exercicios.cores2("Preto");
		Assert.assertTrue(cores.contains("Branco"));
		Assert.assertTrue(cores.contains("Vermelho"));
		Assert.assertTrue(cores.contains("Azul"));	
	}
	
	//06
	@Test
	public void coresDecrescente() {
		Exercicios exercicios = new Exercicios();
		List<String> coresDecrescente = exercicios.coresDecrescente();
		Assert.assertEquals("Vermelho", coresDecrescente.get(0));
		Assert.assertEquals("Preto", coresDecrescente.get(1));
		Assert.assertEquals("Branco", coresDecrescente.get(2));
		Assert.assertEquals("Azul", coresDecrescente.get(3));
	}
	
	//07
	@Test
	public void listaParImpar() {
		Exercicios exercicios = new Exercicios();
		List<List<Integer>> numeros = exercicios.verificarParImpar();
		List<Integer> par = new ArrayList<Integer>();
		List<Integer> impar = new ArrayList<Integer>();
		impar.add(1);
		par.add(2);
		impar.add(3);
		par.add(4);
		impar.add(5);
		par.add(6);
		Assert.assertEquals(par, numeros.get(1));
		Assert.assertEquals(impar, numeros.get(0));
	}
	
	//08
	@Test
	public void nomesOrdenados() {
		Exercicios exercicios = new Exercicios();
		List<String> nomes = exercicios.nomes();
		Assert.assertEquals("Ana", nomes.get(0));
		Assert.assertEquals("Ana Laura", nomes.get(1));
		Assert.assertEquals("Clecio", nomes.get(2));
		Assert.assertEquals("Joaldo", nomes.get(3));
		Assert.assertEquals("Jose", nomes.get(4));
		Assert.assertEquals("José", nomes.get(5));
		Assert.assertEquals("José", nomes.get(6));
		Assert.assertEquals("Marcos", nomes.get(7));
		Assert.assertEquals("Maria", nomes.get(8));
		Assert.assertEquals("Roberval", nomes.get(9));
		Assert.assertEquals("Rodolfo", nomes.get(10));
		Assert.assertEquals("Rodolpho", nomes.get(11));
		Assert.assertEquals("Vagner", nomes.get(12));
		Assert.assertEquals("Wagner", nomes.get(13));
	}
	
	//09
	@Test
	public void retornarSomaList() {
		Exercicios exercicios = new Exercicios();
		Integer soma = exercicios.somarNumeros();
		Assert.assertEquals(6, soma, 0.0001);
	}
	
	//10
	@Test
	public void retornarMediaList() {
		Exercicios exercicios = new Exercicios();
		Double media = exercicios.mediaNumeros();
		Assert.assertEquals(2, media, 0.0001);
	}
	
	//11
	@Test
	public void retornarMenorValor() {
		Exercicios exercicios = new Exercicios();
		Integer menor = exercicios.menorValor();
		Assert.assertEquals(1, menor, 0.0001);
	}
	
	//12
	@Test
	public void retornarMaiorValor() {
		Exercicios exercicios = new Exercicios();
		Integer maior = exercicios.maiorValor();
		Assert.assertEquals(3, maior, 0.0001);
	}
	
	//13
	@Test
	public void deveRemoverImpares() {
		Exercicios exercicios = new Exercicios();
		List<Integer> pares = exercicios.removerImpares();
		System.out.println(pares);	
	}
	
	//14
	@Test
	public void deveListarVogais() {
		Exercicios exercicios = new Exercicios();
		List<String> vogais = exercicios.contarVogais("Filipe");
		Assert.assertEquals("i", vogais.get(0));
		Assert.assertEquals("i", vogais.get(1));
		Assert.assertEquals("e", vogais.get(2));
	}
}
