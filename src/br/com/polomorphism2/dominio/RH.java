package br.com.polomorphism2.dominio;

import br.com.polomorphism2.util.Calculador;

public class RH {

	public String calcularPgtoAcid(Calculador c){
		return "O Funcionario "+c.getClass().getSimpleName()+" ganhou "+c.calcularAciduidade()+" Reais de aciduidade";
	}

}
