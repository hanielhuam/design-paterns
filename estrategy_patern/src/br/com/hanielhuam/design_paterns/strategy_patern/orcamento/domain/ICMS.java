package br.com.hanielhuam.design_paterns.strategy_patern.orcamento.domain;

public class ICMS implements Imposto{

	@Override
	public double calculaImposto(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}
}
