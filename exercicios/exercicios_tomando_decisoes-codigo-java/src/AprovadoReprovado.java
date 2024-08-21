/*
 * Leia 3 notas de um aluno e imprima se ele foi aprovado ou não
 * O aluno deve possuir média 7.0 ou maior para ser aprovado
 */

import java.util.Scanner;

public class AprovadoReprovado {

    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Infrme a primeira nota:");
        double nota1 = scanner.nextDouble();
        
        System.out.println("Infrme a segunda nota:");
        double nota2 = scanner.nextDouble();
        
        System.out.println("Infrme a terceira nota:");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;


        boolean condicaoAprovado = media >= 7;

        if (condicaoAprovado)
            System.out.printf("Parabens! Voce foi aprovado e sua nota foi %.2f", media);
        else
            System.out.printf("Você foi reprovado sua nota foi %.2f", media);

        
        scanner.close();

    }
}
