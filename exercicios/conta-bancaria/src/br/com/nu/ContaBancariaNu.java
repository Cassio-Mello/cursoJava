package br.com.nu;

public class ContaBancariaNu {
    /*
     * Conta Bancária
Crie uma classe ContaBancariaNu no pacote br.com.nu, com os atributos titular e saldo.
 Crie o método atualizarSaldo que recebe um valor Double como parâmetro e incrementa esse valor no saldo atual.
  Crie o método toString que retorna os dados da conta no formato: { Titular: Udemy, Saldo: 50.0 }. 
  Crie um construtor que recebe o titular como parâmetro e além de inicializá-lo, também inicializa o saldo da conta com valor 0.0.
     */

     private String titular;
     private double saldo;

     public ContaBancariaNu(String titular){
        this.titular = titular;
        this.saldo = 0.0;
     }

     public void atualizarSaldo(double valor){
        this.saldo += valor;

     }

     public String toString(){
        return "{Titular: " + titular + ", Saldo: " + saldo + " }";

     }


    
}
