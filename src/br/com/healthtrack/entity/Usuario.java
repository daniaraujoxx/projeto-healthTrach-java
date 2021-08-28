package br.com.healtrack.entity;

import java.util.Scanner;

/**
 * Classe responsável pelo Cadastro dos Usuários e direcionamento pela aplicação
 * @author Grupo LIFED
 *
 */
public class Usuario {

	private String nome;
	private String email;
	private String senha;
	AlimentacaoUsuario alimentacao;
	PesoUsuario peso; 
	Consulta consulta;
	PlanoUsuario plano;
	private int planoEscolhido;

	Scanner sc = new Scanner(System.in);

	
	/**
	 * Método responsável pelo cadastro do usuário
	 */
	public void cadastrarUsuario() {
		System.out.print("Realizar Cadastro: \nNome: ");
		this.nome = sc.next();
		System.out.print("Email: ");
		this.email = sc.next();
		System.out.print("Senha: ");
		this.senha = sc.next();
		System.out.println("\n" + this.nome + ", estamos quase finalizando seu cadastro.");
	}

	/**
	 * Método responsável pela escolha do Plano
	 */
	public void escolherPlano() {
		plano = new PlanoUsuario();
		System.out.println("Escolha um plano: " + "\nDigite: \n[" + plano.getTipoPlano()[0] + "] Para Plano Premium "
				+ " \n[" + plano.getTipoPlano()[1] + "] para Plano Comum");
		this.planoEscolhido = sc.nextInt();

		if (this.planoEscolhido == plano.getTipoPlano()[0]) {
			System.out.println("Digite as informações de cartão de crédito: " + "\n Número do cartão: ");
			int numeroCartao = sc.nextInt();
			System.out.println("Nome impresso no cartão: ");
			String nomeCartao = sc.next();
			System.out.println("Código: ");
			int codigoCartao = sc.nextInt();
			System.out.println("Cadastro finalizado com sucesso!");
		} else {
			System.out.println("Você optou pelo Plano Comum" + "\n Cadastro finalizado com sucesso!");
		}
	}
	
	/**
	 * Método responsável por verificar se o usuário possui cadastro
	 * direciona o usuário para o que for necessário.
	 */
	public void logar() {
		
		int cadastrado = 0;
		
		System.out.println("======== Health Track ========");
		
		do {
			System.out.println("Já possui cadastro? "
					+ "\nDigite: \n[1] Para SIM "
					+ "\n[2] Para NÃO"
					+ "\n==============================");
			System.out.print("Sua Opção: ");
			cadastrado = sc.nextInt();
			
		}while(cadastrado != 1 && cadastrado != 2);
		
		if(cadastrado == 1) {
			System.out.print("Email: ");
			this.email = sc.next();
			System.out.print("Senha: ");
			this.senha = sc.next();
			opcoes();
		} 
		else{
			cadastrarUsuario();
			escolherPlano();
			opcoes();
		}
	}
	
	/**
	 *  Método responsável por marcar uma consulta com Nutricionista
	 */
	public void marcarConsulta() {
		consulta = new Consulta();
		consulta.verificaPlano();
	}
	
	/*
	 * Método responsável pelo menu de acesso das funções da aplicação
	 */
	public void opcoes() {
		alimentacao = new AlimentacaoUsuario();
		peso = new PesoUsuario();
		System.out.println("\n=========== Menu de Opções ==========="
				+ "\nDigite \n[1] Para cadastrar alimentação diária" 
				+ "\n[2] Para cadastrar peso e meta de peso "
				+ "\n[3] Para marcar consulta"
				+ "\n======================================");
		System.out.print("Sua opção: ");
		
		int opcaoEscolhida = sc.nextInt();
		
		if(opcaoEscolhida == 1) {
			alimentacao.cadastrarAlimento();
			
		} else if (opcaoEscolhida == 2) {
			peso.cadastrarPeso();
			
			
		} else if (opcaoEscolhida == 3) {
			marcarConsulta();
		}
		
	}

}
