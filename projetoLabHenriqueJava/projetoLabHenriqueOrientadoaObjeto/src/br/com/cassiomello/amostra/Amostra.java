package br.com.cassiomello.amostra;

import java.util.Scanner;

public class Amostra {
    private String nomeAmostra;
    private double quantidadeAmostra;
    private double quantidadeResiduo;
    private double quantidadeArdido;
    private double quantidadeCarunchado;
    private double quantidadeQuebrado;
    private double quantidadeOutrosAvariados;
    private double percentualUmidade;
    
    //construtor
    public Amostra(String nomeAmostra, double quantidadeAmostra, double quantidadeResiduo, double quantidadeArdido,
    double quantidadeCarunchado, double quantidadeQuebrado, double quantidadeOutrosAvariados, double percentualUmidade){
        this.nomeAmostra = nomeAmostra;
        this.quantidadeAmostra = quantidadeAmostra;
        this.quantidadeResiduo = quantidadeResiduo;
        this.quantidadeArdido = quantidadeArdido;
        this.quantidadeCarunchado = quantidadeCarunchado;
        this.quantidadeQuebrado = quantidadeQuebrado;
        this.quantidadeOutrosAvariados = quantidadeOutrosAvariados;
        this.percentualUmidade = percentualUmidade;
    }
    
    private double calcularPorcentagem(double tipoAmostra){
        return (tipoAmostra * 100) / quantidadeAmostra;
    }

    private boolean verificarTipo(double[] limites){
        return calcularPorcentagem(quantidadeResiduo) <= limites[0] &&
               calcularPorcentagem(quantidadeArdido) <= limites[1] &&
               calcularPorcentagem(quantidadeCarunchado) <= limites[2] &&
               calcularPorcentagem(quantidadeQuebrado) <= limites[3] &&
               calcularPorcentagem(quantidadeOutrosAvariados) <= limites[4];

    }

    public void tiparAmostra() {
        final double UMIDADE_LIMITE = 14;
        final double[][] TIPOS = {
              {1.0, 1.0, 2.0, 3.0, 6.0}, //TIPO 1
              {1.5, 2.0, 3.0, 4.0, 10.0},//Tipo 2
              {2.0, 3.0, 4.0, 5.0, 15.0} //TIPO 3
        };

        if  ( percentualUmidade <= UMIDADE_LIMITE) {
            for (int i = 0; i < TIPOS.length; i++){
                if (verificarTipo(TIPOS[i])){
                    System.out.println("A amostra " + nomeAmostra + " é do TIPO "+ (i + 1));
                    return;
                }
            }
        } 
        System.out.println("A amostra: " + nomeAmostra + " é FORA DE TIPO" );
        
        
    }

    public void imprimirResultados(){
       // System.out.println("Nome da amostra: " + nomeAmostra);
        System.out.printf("Quantide de residuo: %.2f%%  \n", calcularPorcentagem(quantidadeResiduo));
        System.out.printf("Quantide de ardido: %.2f%%  \n", calcularPorcentagem(quantidadeArdido));
        System.out.printf("Quantide de carunchado: %.2f%%  \n", calcularPorcentagem(quantidadeCarunchado));
        System.out.printf("Quantide de quebrado: %.2f%%  \n", calcularPorcentagem(quantidadeQuebrado));
        System.out.printf("Quantide de outros avariados: %.2f%%  \n", calcularPorcentagem(quantidadeOutrosAvariados));
        System.out.printf("Umdidade: %.2f%%  \n", percentualUmidade);
    }

    
    public void informarParametros(Scanner scanner){
               
        System.out.println("Informe o nome da amostra:");
        setNomeAmostra(scanner.nextLine());
       
        System.out.println("Informe a quantidade da amostra (g):");
        setQuantidadeAmostra(scanner.nextDouble());

        System.out.println("Informe a quantidade de residuos (g)");
        setQuantidadeResiduo(scanner.nextDouble());
        
        System.out.println("Informe a quantidade de ardidos (g)");
        setQuantidadeArdido(scanner.nextDouble());
        
        System.out.println("Informe a quantidade de carunchado (g)");
        setQuantidadeCarunchado(scanner.nextDouble());
        
        System.out.println("Informe a quantidade de quebrados (g)");
        setQuantidadeQuebrado(scanner.nextDouble());
        
        System.out.println("Informe a quantidade de outros avariados (g)");
        setQuantidadeOutrosAvariados(scanner.nextDouble());
        
        System.out.println("Informe a umidade (%)");
        setPercentualUmidade(scanner.nextDouble());


    }

    public String getNomeAmostra() {
        return nomeAmostra;
    }

    public void setNomeAmostra(String nomeAmostra) {
        this.nomeAmostra = nomeAmostra;
    }

    public double getQuantidadeAmostra() {
        return quantidadeAmostra;
    }

    public void setQuantidadeAmostra(double quantidadeAmostra) {
        this.quantidadeAmostra = quantidadeAmostra;
    }

    public double getQuantidadeResiduo() {
        return quantidadeResiduo;
    }

    public void setQuantidadeResiduo(double quantidadeResiduo) {
        this.quantidadeResiduo = quantidadeResiduo;
    }

    public double getQuantidadeArdido() {
        return quantidadeArdido;
    }

    public void setQuantidadeArdido(double quantidadeArdido) {
        this.quantidadeArdido = quantidadeArdido;
    }

    public double getQuantidadeCarunchado() {
        return quantidadeCarunchado;
    }

    public void setQuantidadeCarunchado(double quantidadeCarunchado) {
        this.quantidadeCarunchado = quantidadeCarunchado;
    }

    public double getQuantidadeQuebrado() {
        return quantidadeQuebrado;
    }

    public void setQuantidadeQuebrado(double quantidadeQuebrado) {
        this.quantidadeQuebrado = quantidadeQuebrado;
    }

    public double getQuantidadeOutrosAvariados() {
        return quantidadeOutrosAvariados;
    }

    public void setQuantidadeOutrosAvariados(double quantidadeOutrosAvariados) {
        this.quantidadeOutrosAvariados = quantidadeOutrosAvariados;
    }

    public double getPercentualUmidade() {
        return percentualUmidade;
    }

    public void setPercentualUmidade(double percentualUmidade) {
        this.percentualUmidade = percentualUmidade;
    }
    
}
