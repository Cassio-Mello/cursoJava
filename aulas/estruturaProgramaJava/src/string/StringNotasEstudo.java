package string;
/*
 * String é um tipo de referencia que representauma cadeia de caracteres.
 */

import java.util.Scanner;

public class StringNotasEstudo {
    public static void main(String[] args) {
        
        Scanner sacanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sacanner.nextLine();
        System.out.println("Olá, " + nome);

        sacanner.close();
    }
    
}
