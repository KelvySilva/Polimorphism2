package br.com.polomorphism2.main;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import br.com.polomorphism2.dominio.Analista;
import br.com.polomorphism2.dominio.Auxiliar;
import br.com.polomorphism2.dominio.Gerente;
import br.com.polomorphism2.dominio.RH;
import br.com.polomorphism2.dominio.Supervisor;
import br.com.polomorphism2.util.Calculador;

public class Principal {
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		List<Calculador> lista = new ArrayList<Calculador>();
		RH rh = new RH();
		
		Gerente g = new Gerente();
		g.setPagamento(5000);
		Supervisor s = new Supervisor();
		s.setPagamento(2500);
		Analista a = new Analista();
		a.setPagamento(1800);
		Auxiliar ax = new Auxiliar();
		ax.setPagamento(1200);
		lista.add(g);
		lista.add(s);
		lista.add(a);
		lista.add(ax);
		
		for (Calculador c : lista) {
			System.out.println(rh.calcularPgtoAcid(c));			
		}
		
	}

}
