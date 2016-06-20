package br.com.polomorphism2.dominio;

import br.com.polomorphism2.util.Calculador;

public class Auxiliar extends Funcinario implements Calculador{

	@Override
	public double calcularAciduidade() {
		this.percent = 10.0 /100.00;
		return this.getPayment()*this.percent;
	}
	

}
