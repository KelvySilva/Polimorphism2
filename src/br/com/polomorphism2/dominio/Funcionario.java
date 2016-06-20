package br.com.polomorphism2.dominio;

public abstract class Funcionario {
	
	private double pagamento;
	protected double percent;

	public double getPagamento() {
		return pagamento;
	}

	public void setPagamento(double pagamento) {
		this.pagamento = pagamento;
	}
	
}
