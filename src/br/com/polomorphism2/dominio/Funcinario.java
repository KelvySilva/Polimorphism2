package br.com.polomorphism2.dominio;

public abstract class Funcinario {
	
	private double payment;
	protected double percent;

	public double getPayment() {
		return payment;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}
	
}
