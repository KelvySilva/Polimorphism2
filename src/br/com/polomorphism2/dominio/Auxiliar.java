package br.com.polomorphism2.dominio;

import br.com.polomorphism2.util.Calculador;

public class Auxiliar extends Funcionario implements Calculador{

	@Override
	public double calcularAciduidade() {
		this.percent = 10.0 /100.00;
		return this.getPagamento()*this.percent;
	}
	

}
