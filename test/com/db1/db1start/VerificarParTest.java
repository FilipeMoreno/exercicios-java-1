package com.db1.db1start;

import org.junit.Test;
import org.junit.Assert;

public class VerificarParTest {
	
	@Test
	public void deveVerificarPar() {
		VerificarPar verificar = new VerificarPar();
		boolean par = verificar.numero(10);
		Assert.assertEquals(true, par);
	}

}
