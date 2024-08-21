package io;

import java.util.Scanner;

/*
 * Entrada e saida de dados (i=input, o=output IO) de dados de java
 * Entrada= ler os dados digitados pelo usuario
 * Saída=escrever dados para o usuario
 */
public class io {
    public static void main(String[] args) {

        //Leitura de dados de entrada
        System.out.println("Digite um numero:");
        Scanner scanner = new Scanner(System.in);
        int valorDigitado = scanner.nextInt();
        System.out.println(valorDigitado);
        scanner.close();
        
        //saida de dados
        float qualquerNumero = 3.0f;
        System.out.printf("O numero digitado foi %f", qualquerNumero);
    }
    
}
