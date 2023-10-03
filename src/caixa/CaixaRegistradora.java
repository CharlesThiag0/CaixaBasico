package caixa;

import java.util.Scanner;

public class CaixaRegistradora {
	
	public static void main(String[] args) {
	
		String nome = "Charles Thiago";
		String conta = "Corrente";
		double saldo = 3000.02;
		
		//dados Inciais do cliente nome ,tipo da conta , saldo
		System.out.println("*************************");
		System.out.println("\nNome do Cliente : "+nome);
		System.out.println("Tipo da Conta : "+conta);
		System.out.println("\nSaldo : "+saldo);
		System.out.println("*************************\n");

		//operacoes loop 1- saldo 2-receber valor 3-tranferir 4- sair
		Scanner sc = new Scanner(System.in);
		double numeroDigitado = 0;
		
		while (numeroDigitado != 4) {
		
		String mensagem2 = """
				  \n **Operações**
				
				1 - Consultar Saldo 
				2 - Receber Transferencia
				3 - Tranferir  Saldo ou Pix
				4 - Sair
				
				""";
		System.out.println(mensagem2);
		System.out.println("Opção : ");
		
		numeroDigitado = sc.nextInt();
		String valorDesejavel = "Digite o valor desejado";
		
		if (numeroDigitado > 4) {
		System.out.println("Numero Invalido");
		
		} 
		else if  (numeroDigitado == 1) {
			System.out.printf("Seu saldo : %.2f%n",saldo);	
		}
		else if (numeroDigitado == 2) {

			System.out.println(valorDesejavel);
			double receberValor = sc.nextDouble();
			saldo += receberValor;
			System.out.println("Novo Saldo : "+saldo);

			} 	
			else if (numeroDigitado == 3) {
				System.out.println(valorDesejavel);
				double enviarValor = sc.nextDouble();
					if (enviarValor > saldo) {
						System.out.println("Saldo insuficiente");
						} 	
					else {
						saldo -= enviarValor;
						System.out.println("Novo Saldo : "+saldo);
						}	
				}
		}
		System.out.println("Encerrada com sucesso Obrigado volte sempre");
		sc.close();
	}

}
