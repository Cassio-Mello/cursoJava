package estrutura_switch;

import java.io.Console;

public class ChecadorDeNotas {

    public static void main(String[] args) {
        //A, B, C, D ou F

        Console console = System.console();

        System.out.println("Informe a nota (A, B, C, D ou F):");
        String nota = console.readLine().toUpperCase();
        
        switch(nota){
            case "A" -> System.out.println("Excelente!");
            case "B" -> System.out.println("Bom trabalho!");
            case "C" -> System.out.println("Esta progredindo!");
            case "D" -> System.out.println("Você precisa melhorar!");
            case "F" -> System.out.println("Voce Falhou!");
            default -> System.out.println("Opção invalida");
        }
    }
}
