package br.com.healthtrack.entity;

import java.util.Scanner;

/**
 * Classe para agendar consulta com Nutricionista
 * 
 * @author Grupo LIFED
 * @version 1.0<h3> </h3>*/
public class Consulta {
	
	/** Atributo para agendar a data
	 * 
	 */
	private String dataConsulta;
	
	/** Intanciar um nutricionista
	 * 
	 */
	private Nutricionista nutricionista;

	/**Método para verificar se o usuário possui o plano Premium, se ele possuir, consegue marcar a consulta
	 * 
	 */
	public void verificaPlano() {
		Scanner sc = new Scanner(System.in);
		PlanoUsuario planoUsuario = new PlanoUsuario();
		Usuario usuario = new Usuario();
		nutricionista = new Nutricionista();

		System.out.println("Qual o seu plano? ");
		int plano = sc.nextInt();
		if (planoUsuario.getTipoPlano()[0] == plano) {
			System.out.println("Digite o dia que deseja realizar a consulta: ");
			this.dataConsulta = sc.next();
			System.out.println("Sua consulta foi marcada para o dia: " + this.dataConsulta 
					+ "\ncom a nutricionista: " + nutricionista.getNome());

		} else {
			System.out.println("Seu plano não permite realizar consultas com o nutricionista!");
		}

	}

}
