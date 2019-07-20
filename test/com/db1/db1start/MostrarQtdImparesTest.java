package com.db1.db1start;

import org.junit.Test;
import org.junit.Assert;

public class MostrarQtdImparesTest {
	
	@Test
	public void deveMostrarQtdImpares() {
		MostrarQtdImpares quantidade = new MostrarQtdImpares();
		int qtd = quantidade.numero(100);
		Assert.assertEquals(50, qtd);
	}

}
