package br.com.healthtrack.entity;

/**
 * Classe para agendar consulta com Nutricionista
 * 
 * @author Grupo LIFED
 * @version 1.0<h3> </h3>*/
public class Nutricionista {

	private int cfn = 123;
	private String nome = "Rafaela";

	public int getCfn() {
		return cfn;
	}

	public void setCfn(int cfn) {
		this.cfn = cfn;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
