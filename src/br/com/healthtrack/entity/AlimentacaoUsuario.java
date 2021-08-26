package br.com.healthtrack.entity;

import java.util.Scanner;

/**
 * Classe que abstrai refei��es di�rias
 * @author Grupo LIFED
 * @version 1.0<h3> </h3>*/

public class AlimentacaoUsuario {

	/** Quantidade de refei��es que o usu�rio fez em um dia 
	 * 
	 */
	private int qtAlimento;
	
	/** Descri��o de cada refei��o
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

	/** M�todo que possibilita o cadastro de cada refei��o
	 * 
	 */
	public void cadastrarAlimento() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o n�mero de refei��es: ");
		this.qtAlimento = sc.nextInt();

		for (int i = 0; i < this.qtAlimento; i++) {
			System.out.println("Digite a refei��o: ");
			this.descAlimento = sc.next();

		}
		System.out.println("Voc� fez: " + this.qtAlimento + " refei��es" + "\nRefei��es salvas com sucesso!");
		sc.close();
	}

}
