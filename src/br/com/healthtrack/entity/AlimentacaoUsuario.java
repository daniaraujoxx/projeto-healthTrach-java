package br.com.healtrack.entity;

import java.util.Scanner;

/**
 * Classe que abstrai refeições diárias
 * @author Grupo LIFED
 * @version 1.0*/

public class AlimentacaoUsuario {

	/** 
	 * Quantidade de refeições que o usuário fez em um dia 
	 * 
	 */
	private int qtAlimento;
	
	/** 
	 * Descrição de cada refeição
	 * 
	 */
	private String descAlimento;
	
	/** 
	 * Método que possibilita o cadastro de cada refeição
	 * 
	 */
	public void cadastrarAlimento() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número de refeições: ");
		this.qtAlimento = sc.nextInt();

		for (int i = 0; i < this.qtAlimento; i++) {
			System.out.print("Digite a refeição: ");
			this.descAlimento = sc.next();

		}
		System.out.println("==============================\n"
				+ "Você fez: " + this.qtAlimento + " refeições" + "\nRefeições salvas com sucesso!");
		sc.close();
	}
}
