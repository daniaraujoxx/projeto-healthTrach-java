package br.com.healtrack.entity;

/**
 * Classe para passar o tipo de plano
 * 
 * @author Grupo LIFED
 * @version 1.0*/

public class PlanoUsuario {
	
	private int tipoPlano[] = {1, 2};

	public int[] getTipoPlano() {
		return tipoPlano;
	}

	public void setTipoPlano(int[] tipoPlano) {
		this.tipoPlano = tipoPlano;
	}
	
}
