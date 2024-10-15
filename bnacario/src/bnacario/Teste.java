package bnacario;

import java.util.Scanner;

public class Teste {
	
	public static void main(String[] args) {
		
		//variavel de referencia
		Conta cc = new Conta();
		Scanner scan = new Scanner (System.in);
		
		System.out.println("*******BANCO GUSTAVO*******");
		
		System.out.println("Digite Numero da Conta: ");
		cc.setNumero(scan.nextInt());
		
		System.out.println("Digite Agencia: ");
		cc.setAgencia(scan.nextInt());
		
		System.out.println("Seu Saldo é de: ");
		cc.setSaldo(scan.nextInt());
		
		System.out.println("Deposite um valor");
		cc.Depositar(scan.nextDouble());
		
		System.out.println("Saldo atual de: " + cc.verificarSaldo());
	}

}
