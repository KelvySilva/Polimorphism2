package br.com.polomorphism2.dominio;

import br.com.polomorphism2.util.Calculador;

public class Gerente extends Funcionario implements Calculador{

	
	public double getPagamento() {
		// TODO Auto-generated method stub
		return super.getPagamento();
	}


	@Override
	public double calcularAciduidade() {
		this.percent = 15.0/100.0;
		return this.getPagamento()*this.percent;
	}
}
