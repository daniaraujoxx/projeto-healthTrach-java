package br.com.healthtrack.entity;

import java.util.Scanner;

/**
 * Classe que abstrai refeições diárias
 * @author Grupo LIFED
 * @version 1.0<h3> </h3>*/

public class AlimentacaoUsuario {

	/** Quantidade de refeições que o usuário fez em um dia 
	 * 
	 */
	private int qtAlimento;
	
	/** Descrição de cada refeição
	 * 
	 */
	private String descAlimento;
	
	/** Getters e Setters
	 * 
	 */

	public int getQtAlimento() {
		return qtAlimento;
	}

	public void setQtAlimento(int qtAlimento) {
		this.qtAlimento = qtAlimento;
	}

	public String getDescAlimento() {
		return descAlimento;
	}

	public void setDescAlimento(String descAlimento) {
		this.descAlimento = descAlimento;
	}

	/** Método que possibilita o cadastro de cada refeição
	 * 
	 */
	public void cadastrarAlimento() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número de refeições: ");
		this.qtAlimento = sc.nextInt();

		for (int i = 0; i < this.qtAlimento; i++) {
			System.out.println("Digite a refeição: ");
			this.descAlimento = sc.next();

		}
		System.out.println("Você fez: " + this.qtAlimento + " refeições" + "\nRefeições salvas com sucesso!");
		sc.close();
	}

}
