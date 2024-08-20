/*
 * Exercicio 1
 * 
 * Dadas 3 notas, imorimir a media aritimetica do aluno
 * 
 * 1.Ler 3 notas
 * 2.Calcular a media
 * 3.Imprimir o resultado
 * 
 * formula media = (n1 + n2 + n3) / 3
 */

import java.util.Scanner;

public class MediaAritimetica {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe a primeira nota:");
        double nota1 = scanner.nextDouble();
        System.out.println("Informe a segunda nota:");
        double nota2 = scanner.nextDouble();
        System.out.println("Informe a terceira nota:");
        double nota3 = scanner.nextDouble();
        scanner.close();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("A media do aluno foi: %.2f", media);


    }


    
}
