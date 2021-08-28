package br.com.healtrack.entity;

/**
 * Classe que abstrai o conceito de Nutricionista
 * 
 * @author Grupo LIFED
 * @version 1.0*/
public class Nutricionista {

	private int cfn;
	private String nome;

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
