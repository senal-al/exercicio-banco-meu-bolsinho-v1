package entidades;
/**
* Senai-AL - Técnico em Informática para Internet
* @author Prof. Me. Carlos Vasconcelos
* @version 1.0
* Classe especialista Apliacação (Main).
* 
*/
import java.util.Scanner;

public class Aplicacao {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Criar e inicializar duas contas empresariais
		ContaEmpresarial contaEmpresarial1 = criarContaEmpresarial(scanner, 1);
		ContaEmpresarial contaEmpresarial2 = criarContaEmpresarial(scanner, 2);

		// Criar e inicializar três contas pessoa física
		ContaPessoaFisica contaPF1 = criarContaPessoaFisica(scanner, 3);
		ContaPessoaFisica contaPF2 = criarContaPessoaFisica(scanner, 4);
		ContaPessoaFisica contaPF3 = criarContaPessoaFisica(scanner, 5);

		// Criar e inicializar duas contas poupança
		ContaPoupanca contaPoupanca1 = criarContaPoupanca(scanner, 6);
		ContaPoupanca contaPoupanca2 = criarContaPoupanca(scanner, 7);

		// Exibir extrato
		exibirExtrato(contaEmpresarial1);
		exibirExtrato(contaEmpresarial2);
		exibirExtrato(contaPF1);
		exibirExtrato(contaPF2);
		exibirExtrato(contaPF3);
		exibirExtrato(contaPoupanca1);
		exibirExtrato(contaPoupanca2);

		scanner.close();
	}

	// Método para criar uma conta empresarial
	public static ContaEmpresarial criarContaEmpresarial(Scanner scanner, int numeroConta) {
		System.out.println("Informe os dados da Conta Empresarial " + numeroConta);

		System.out.print("Nome da empresa: ");
		String nome = scanner.nextLine();

		System.out.print("Idade da empresa: ");
		int idade = Integer.parseInt(scanner.nextLine());

		System.out.print("Saldo inicial: ");
		double saldo = Double.parseDouble(scanner.nextLine());

		System.out.print("Limite de saque: ");
		double limiteSaque = Double.parseDouble(scanner.nextLine());

		System.out.print("Limite de empréstimo: ");
		double limiteEmprestimo = Double.parseDouble(scanner.nextLine());

		return new ContaEmpresarial(numeroConta, nome, idade, saldo, limiteSaque, limiteEmprestimo);
	}

	// Método para criar uma conta pessoa física
	public static ContaPessoaFisica criarContaPessoaFisica(Scanner scanner, int numeroConta) {
		System.out.println("Informe os dados da Conta Pessoa Física " + numeroConta);

		System.out.print("Nome do titular: ");
		String nome = scanner.nextLine();

		System.out.print("Idade do titular: ");
		int idade = Integer.parseInt(scanner.nextLine());

		System.out.print("Saldo inicial: ");
		double saldo = Double.parseDouble(scanner.nextLine());

		System.out.print("Limite de saque: ");
		double limiteSaque = Double.parseDouble(scanner.nextLine());

		System.out.print("Limite de empréstimo: ");
		double limiteEmprestimo = Double.parseDouble(scanner.nextLine());

		return new ContaPessoaFisica(numeroConta, nome, idade, saldo, limiteSaque, limiteEmprestimo);
	}

	// Método para criar uma conta poupança
	public static ContaPoupanca criarContaPoupanca(Scanner scanner, int numeroConta) {
		System.out.println("Informe os dados da Conta Poupança " + numeroConta);

		System.out.print("Nome do titular: ");
		String nome = scanner.nextLine();

		System.out.print("Idade do titular: ");
		int idade = Integer.parseInt(scanner.nextLine());

		System.out.print("Saldo inicial: ");
		double saldo = Double.parseDouble(scanner.nextLine());

		return new ContaPoupanca(numeroConta, nome, idade, saldo);
	}

	// Método para exibir extrato
	public static void exibirExtrato(Conta conta) {
		System.out.println("Extrato da Conta:");
		System.out.println("Número da Conta: " + conta.getNumeroConta());
		System.out.println("Nome do Titular: " + conta.getNomeTitular());
		System.out.println("Idade: " + conta.getIdade());
		System.out.println("Saldo: " + conta.getSaldo());
		System.out.println("-----------------------------");
	}
}
