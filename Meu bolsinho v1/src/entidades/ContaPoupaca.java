package entidades;
/**
* Senai-AL - Técnico em Informática para Internet
* @author Prof. Me. Carlos Vasconcelos
* @version 1.0
* Classe especialista Conta Poupança.
* 
*/
class ContaPoupanca extends Conta {
    private final double rendimento = 0.07;

    // Construtor padrão
    public ContaPoupanca() {
    }

    // Construtor personalizado
    public ContaPoupanca(int numeroConta, String nomeTitular, int idade, double saldo) {
        super(numeroConta, nomeTitular, idade, saldo);
    }

    // Get rendimento
    public double getRendimento() {
        return rendimento;
    }

    // Método para aplicar rendimento
    public void aplicarRendimento() {
        double novoSaldo = getSaldo() + (getSaldo() * rendimento);
        depositar(novoSaldo - getSaldo());  // Atualiza o saldo com rendimento
    }

    @Override
    public void emprestimo(double valor) {
        System.out.println("Empréstimos não são permitidos para contas poupança.");
    }
}

