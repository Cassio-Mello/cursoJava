package estrutura_if;

import java.util.Scanner;

public class ChecadorDeIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe sua idade:");
        int idade = scanner.nextInt();
        
        //blocos de if e esle com apenas uma instução pode ser executado sem {}
        //if (idade >= 18) {
          //  System.out.println("Voce pode comprar o ingresso");
        //} else {
          //  System.out.println("Voce é menor de idade");
       // }

        // if ternario: condição ? expressao : expressao
        String mensagem = (idade >= 18) ? "Pode comprar o ingresso" : "Você é menor de 18";
        System.out.println(mensagem);

        scanner.close();
    }    
}
