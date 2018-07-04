package br.com.hanielhuam.design_paterns.strategy_patern.orcamento.domain;

public class CalculadorDeIposto {
	
	public double realizaCalculo (Orcamento orcamento, Imposto imposto) {
		return imposto.calculaImposto(orcamento);
	}
}
