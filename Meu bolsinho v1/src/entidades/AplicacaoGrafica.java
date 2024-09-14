package entidades;
/**
* Senai-AL - Técnico em Informática para Internet
* @author Prof. Me. Carlos Vasconcelos
* @version 1.0
* Classe especialista Apliacação (Main) com GUI.
* 
*/
import javax.swing.JOptionPane;

public class AplicacaoGrafica {
	public static void main(String[] args) {
        // Criar e inicializar duas contas empresariais
        ContaEmpresarial contaEmpresarial1 = criarContaEmpresarial(1);
        ContaEmpresarial contaEmpresarial2 = criarContaEmpresarial(2);

        // Criar e inicializar três contas pessoa física
        ContaPessoaFisica contaPF1 = criarContaPessoaFisica(3);
        ContaPessoaFisica contaPF2 = criarContaPessoaFisica(4);
        ContaPessoaFisica contaPF3 = criarContaPessoaFisica(5);

        // Criar e inicializar duas contas poupança
        ContaPoupanca contaPoupanca1 = criarContaPoupanca(6);
        ContaPoupanca contaPoupanca2 = criarContaPoupanca(7);

        // Exibir extrato
        exibirExtrato(contaEmpresarial1);
        exibirExtrato(contaEmpresarial2);
        exibirExtrato(contaPF1);
        exibirExtrato(contaPF2);
        exibirExtrato(contaPF3);
        exibirExtrato(contaPoupanca1);
        exibirExtrato(contaPoupanca2);
    }

    // Método para criar uma conta empresarial
    public static ContaEmpresarial criarContaEmpresarial(int numeroConta) {
        String nome = JOptionPane.showInputDialog("Digite o nome da empresa " + numeroConta + ":");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da empresa:"));
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo inicial:"));
        double limiteSaque = Double.parseDouble(JOptionPane.showInputDialog("Digite o limite de saque:"));
        double limiteEmprestimo = Double.parseDouble(JOptionPane.showInputDialog("Digite o limite de empréstimo:"));

        return new ContaEmpresarial(numeroConta, nome, idade, saldo, limiteSaque, limiteEmprestimo);
    }

    // Método para criar uma conta pessoa física
    public static ContaPessoaFisica criarContaPessoaFisica(int numeroConta) {
        String nome = JOptionPane.showInputDialog("Digite o nome do titular da conta " + numeroConta + ":");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do titular:"));
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo inicial:"));
        double limiteSaque = Double.parseDouble(JOptionPane.showInputDialog("Digite o limite de saque:"));
        double limiteEmprestimo = Double.parseDouble(JOptionPane.showInputDialog("Digite o limite de empréstimo:"));

        return new ContaPessoaFisica(numeroConta, nome, idade, saldo, limiteSaque, limiteEmprestimo);
    }

    // Método para criar uma conta poupança
    public static ContaPoupanca criarContaPoupanca(int numeroConta) {
        String nome = JOptionPane.showInputDialog("Digite o nome do titular da conta poupança " + numeroConta + ":");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do titular:"));
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo inicial:"));

        return new ContaPoupanca(numeroConta, nome, idade, saldo);
    }

    // Método para exibir extrato
    public static void exibirExtrato(Conta conta) {
        String mensagem = "Extrato da Conta:\n" +
                "Número da Conta: " + conta.getNumeroConta() + "\n" +
                "Nome do Titular: " + conta.getNomeTitular() + "\n" +
                "Idade: " + conta.getIdade() + "\n" +
                "Saldo: " + conta.getSaldo() + "\n" +
                "-----------------------------";
        
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
