package br.com.hanielhuam.design_paterns.strategy_patern.orcamento.test;



import org.junit.Assert;
import org.junit.Test;

import br.com.hanielhuam.design_paterns.strategy_patern.orcamento.domain.*;


public class ImpostoTest {
	
	@Test
	public void calculoImposto() {
		
		Imposto icms = new ICMS();
		Imposto iss = new ISS();
		
		CalculadorDeIposto calculadora = new CalculadorDeIposto();
		
		Orcamento orcamento = new Orcamento(500.0);
		
		calculadora.realizaCalculo(orcamento, icms);
		calculadora.realizaCalculo(orcamento, iss);
		
		Assert.assertEquals(50.0, calculadora.realizaCalculo(orcamento, icms), 0.00001);
		Assert.assertEquals(30.0, calculadora.realizaCalculo(orcamento, iss), 0.00001);
		
	}
}
