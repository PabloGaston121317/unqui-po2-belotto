package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	
	private ArrayList<Integer> numeros = new ArrayList<Integer>();
	
	public void addNumber(int numero) {
		this.numeros.add(numero);
	}
	
	public int getEvenOcurrences() {
		int cont = 0;
		
		for (int numero: numeros) {
			if (numero % 2 == 0) {
				cont ++;
			}
		}
		return cont;
	}
	
	public int totalImpares() {
		int cont = 0;
		
		for(int numero:numeros) {
			if (numero % 2 != 0) {
				cont ++;
			}
		}
		return cont;
	}
	
	public int totalMultiplos(int numeroCheck) {
		int cont = 0;
		
		for(int numero:numeros) {
			if (numero % numeroCheck == 0) {
				cont ++;
			}
		}
		return cont;
	}
	
	
}
