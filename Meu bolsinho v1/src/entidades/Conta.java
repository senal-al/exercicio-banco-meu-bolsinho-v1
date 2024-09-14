package entidades;
/**
* Senai-AL - Técnico em Informática para Internet
* @author Prof. Me. Carlos Vasconcelos
* @version 1.0
* Classe generica Conta.
* 
*/
public class Conta {
	private int numeroConta;
    private String nomeTitular;
    private int idade;
    private double saldo;

    // Construtor padrão
    public Conta() {
    }

    // Construtor personalizado
    public Conta(int numeroConta, String nomeTitular, int idade, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.idade = idade;
        this.saldo = saldo;
    }

    // Getters
    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public int getIdade() {
        return idade;
    }

    public double getSaldo() {
        return saldo;
    }

    // Setters
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Métodos de operação
    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void emprestimo(double valor) {
        saldo += valor;
    }
}
