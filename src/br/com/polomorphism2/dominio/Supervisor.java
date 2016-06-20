package br.com.polomorphism2.dominio;

import br.com.polomorphism2.util.Calculador;

public class Supervisor extends Funcionario implements Calculador{

	@Override
	public double calcularAciduidade() {
		this.percent = 12.0/100.0;
		return this.getPagamento()*this.percent;
	}

}
