package br.com.polomorphism2.dominio;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import br.com.polomorphism2.util.Calculador;

public class RH {

	public String calcularPgtoAcid(Calculador c) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		
		return "O(s) "+c.getClass().getSimpleName()+"(s) ganhou(aram) "+c.calcularAciduidade()+" Reais de aciduidade";
	}

}
