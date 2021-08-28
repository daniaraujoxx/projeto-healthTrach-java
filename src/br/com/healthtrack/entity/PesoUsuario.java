package br.com.healtrack.entity;

import java.util.Scanner;

/**
 * Classe para cadastrar peso do usuário e para calcular imc
 * 
 * @author Grupo LIFED
 * @version 1.0*/
public class PesoUsuario {
	
	private double vlrPeso;
	private double metaPeso;
	private double altura;
	private double imc;
	
	/**
	 * Construtor Padrão da Classe
	 */
	public PesoUsuario() {
		
	}
	
	/**
	 * Construtor que instancia um objeto com seus atributos definidos
	 * @param vlrPeso O peso do usuário
	 * @param metaPeso A meta de peso do usuário
	 * @param altura A altura do Usuário
	 */
	public PesoUsuario(double vlrPeso, double metaPeso, double altura) {
		this.vlrPeso = vlrPeso;
		this.metaPeso = metaPeso;
		this.altura = altura;
	}
	
	Scanner sc = new Scanner(System.in);
	
	/**
	 * Função responsável por cadastrar o peso do Usuário.
	 */
	public void cadastrarPeso() {
		System.out.print("Digite seu peso: ");
		this.vlrPeso = sc.nextDouble();
		System.out.print("Digite sua meta de peso: ");
		this.metaPeso = sc.nextDouble();
		
		System.out.println("Dados salvos com sucesso!");
		
		System.out.println("Deseja calcular o seu IMC atual?");
		int opcao = 0;
		do {
			System.out.println("============\nDigite \n[1] Para SIM \n[2] Para NÃO\n"
					+ "============");
			System.out.print("Sua Opção: ");
			opcao = sc.nextInt();
		}while(opcao != 1 && opcao != 2);
		
		if(opcao == 1) {
			calculaIMC();
		}
		else {
			System.out.println("Agradecemos por usar o Health Track!");
		}
		
		sc.close();
		
	}
	
	/**
	 *  Função responsável por calcular o IMC do usuário
	 * 
	 */
	public void calculaIMC() {
		System.out.print("Digite a sua altura: ");
		this.altura = sc.nextDouble();
		this.imc =  this.vlrPeso / (this.altura * this.altura);
		System.out.printf("Seu IMC é " + "%.2f\n",this.imc);
		
		if(imc < 18.5) {
			System.out.println("Abaixo do Peso");
		}
		else if(imc >= 18.5 && imc <= 24.9) {
			System.out.println("Peso Normal");
		}
		else if(imc >= 25 && imc <= 29.9) {
			System.out.println("Sobrepeso");
		}
		else if(imc >= 30 && imc <= 34.9) {
			System.out.println("Obesidade Grau I");
		}
		else if(imc >= 35 && imc <= 39.9) {
			System.out.println("Obesidade Grau II");
		}
		else {
			System.out.println("Obesidade Grau III ou Mórbida");
		}
	}
	
	/**
	 * Calcula o valor do peso que deve ser perdido para alcançar a meta.
	 *
	 */
	public double calculaMetaPeso() {
		return this.vlrPeso - this.metaPeso;
	}
	
}
