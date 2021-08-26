package br.com.healthtrack.entity;

import java.util.Date;
import java.util.Scanner;

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

	public void cadastrarUsuario() {
		System.out.println("Realizar Cadastro: \nNome: ");
		this.nome = sc.next();
		System.out.println("Email: ");
		this.email = sc.next();
		System.out.println("Senha: ");
		this.senha = sc.next();
		System.out.println(this.nome + ", estamos quase finalizando seu cadastro.");
	}

	public void escolherPlano() {
		plano = new PlanoUsuario();
		System.out.println("Escolha um plano: " + "\nDigite: \n" + plano.getTipoPlano()[0] + " para plano Premium "
				+ " \n" + plano.getTipoPlano()[1] + " para plano comúm");
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
			System.out.println("Você optou pelo plano comúm" + "\n Cadastro finalizado com sucesso!");
		}
	}

	public void logar() {
		System.out.println("Já possuí cadastro? \nDigite: \n1 - para SIM \n2 - para Não");
		int cadastrado = sc.nextInt();
		
		if(cadastrado == 1) {
			System.out.println("Email: ");
			this.email = sc.next();
			System.out.println("Senha: ");
			this.senha = sc.next();
			opcoes();
		} else {
			cadastrarUsuario();
			escolherPlano();
			opcoes();
		}
			
			
	}
	
	public void marcarConsulta() {
		consulta = new Consulta();
		consulta.verificaPlano();
	}
	
	public void opcoes() {
		alimentacao = new AlimentacaoUsuario();
		peso = new PesoUsuario();

		System.out.println("Menu de opções: \nDigite \n1 para cadastrar alimentação diária" +
	"\n2 para cadastrar peso e meta de peso \n3 para marcar consulta");
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
