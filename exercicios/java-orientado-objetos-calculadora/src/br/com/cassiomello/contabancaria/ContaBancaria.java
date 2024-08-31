package br.com.cassiomello.contabancaria;

public class ContaBancaria {
    private int numeroConta ;
    private String nomeTitularConta;
    private double saldoConta;

    //construtores
    public ContaBancaria(int numeroConta, String nomeTitularConta, double saldoConta) {
        this.numeroConta = numeroConta;
        this.nomeTitularConta = nomeTitularConta;
        this.saldoConta = saldoConta;

    }

    public void depositar(double vlrDeposito){
        if (vlrDeposito > 0) {
            saldoConta += vlrDeposito;
            System.out.println("Valor depositado R$" + vlrDeposito + " o saldo total é R$" + saldoConta);
        }else {
            System.out.println("Valor inválido");
        }
    }

    public void sacar(double vlrSaque) {
        if (vlrSaque > 0 && vlrSaque <= saldoConta) {
            saldoConta -= vlrSaque;
            System.out.println("Você sacou R$" + vlrSaque + ", seu saldo atual é" + saldoConta);
        }else {
            System.out.println("Valor para saque inválido ou saque insuficiente");
        }
    }

    public void consultarSaldo() {
        System.out.println("Seu saldo atual é: R$" + saldoConta);
    }

    public void exibirConta() {
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Titular da conta: " + nomeTitularConta);
        System.out.println("Saldo da conta: R$" + saldoConta);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int nUMERO_CONTA) {
        numeroConta = nUMERO_CONTA;
    }

    public String getNomeTituarConta() {
        return nomeTitularConta;
    }

    public void setNomeTituarConta(String nOME_TITULAR_CONTA) {
        nomeTitularConta = nOME_TITULAR_CONTA;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    

}
