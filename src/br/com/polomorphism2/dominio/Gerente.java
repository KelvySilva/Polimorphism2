package br.com.polomorphism2.dominio;

import br.com.polomorphism2.util.Calculador;

public class Gerente extends Funcinario implements Calculador{



	@Override
	public double calcularAciduidade() {
		this.percent = 15.0/100.0;
		return this.getPayment()*this.percent;
	}
}
