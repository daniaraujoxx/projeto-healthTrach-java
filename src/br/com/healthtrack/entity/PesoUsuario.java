package br.com.healthtrack.entity;

import java.util.Scanner;

/**
 * Classe para gravar peso do usuário e para calcular imc
 * 
 * @author Grupo LIFED
 * @version 1.0<h3> </h3>*/
public class PesoUsuario {

	private double vlrPeso;
	private double metaPeso;
	private double altura;
	private double imc;
	

	public void cadastrarPeso() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu peso: ");
		this.vlrPeso = sc.nextDouble();
		System.out.println("Digite sua meta de peso: ");
		this.metaPeso = sc.nextDouble();
		
		System.out.println("Dados salvos com sucesso!");
		sc.close();
		
	}

	public double calculaIMC() {
		this.imc =  this.vlrPeso / (this.altura * this.altura);
		return imc;

	}
	
	public double calculaMetaPeso() {
		return this.vlrPeso - this.metaPeso;
	}

}
