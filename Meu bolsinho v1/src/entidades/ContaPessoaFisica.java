package entidades;
/**
* Senai-AL - Técnico em Informática para Internet
* @author Prof. Me. Carlos Vasconcelos
* @version 1.0
* Classe especialista Conta Pessoa Física.
* 
*/
class ContaPessoaFisica extends Conta {
    private double limiteSaque;
    private double limiteEmprestimo;

    // Construtor padrão
    public ContaPessoaFisica() {
    }

    // Construtor personalizado
    public ContaPessoaFisica(int numeroConta, String nomeTitular, int idade, double saldo, double limiteSaque, double limiteEmprestimo) {
        super(numeroConta, nomeTitular, idade, saldo);
        this.limiteSaque = limiteSaque;
        this.limiteEmprestimo = limiteEmprestimo;
    }

    // Getters e Setters
    public double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    // Sobrecarga de métodos
    @Override
    public void sacar(double valor) {
        if (getSaldo() >= valor + 3.00) {
            super.sacar(valor + 3.00);  // taxa adicional de R$ 3,00
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    @Override
    public void emprestimo(double valor) {
        if (getSaldo() + limiteEmprestimo >= valor + 15.00) {
            super.emprestimo(valor + 15.00);  // taxa adicional de R$ 15,00
        } else {
            System.out.println("Limite de empréstimo excedido.");
        }
    }
}
