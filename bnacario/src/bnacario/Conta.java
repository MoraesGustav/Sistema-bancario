package bnacario;

/**
 * Classe qe abstrai uma conta Bancaria
 * @author gusta
 * @version 1.0
 */

public class Conta {
	
	int agencia;
	int numero;
	double saldo;
	double Depositar; 
	
	public double getDepositar() {
		return Depositar;
	}
	public void setDepositar(double depositar) {
		Depositar = depositar;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	//construtor padrão
	public Conta() {
		/**
		 * Realiza um deposito na Conta corrente
		 * @param agencia O numero da agencia
		 * @param numero O numero da conta
		 * @pram valor O valor que sera depositado
		 * @return O numero do protocolo de confirmação
		 */
	}
	//contrutor de classe 
	public Conta(int agencia, int numero, double saldo) {
		
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
		
	}
	
	/**
	 * Acrecenta o valor do Saldo da conta
	 * @param valor que sera depositado 
	 */
	
	public void Depositar(double valor) {
		
		this.saldo += valor;
	}
	
	/**
	 * Retira um valor do Saldo da conta
	 * @param valor
	 * @see depositar
	 */
	
	public void Sacar(double valor) {
		
		this.saldo -= valor;
	}
	
	/**
	 * Verificar o Saldo da conta
	 * @return Valor do saldo da conta 	
	 */
	public double verificarSaldo() {
		return this.saldo;
	}
	
	
}
