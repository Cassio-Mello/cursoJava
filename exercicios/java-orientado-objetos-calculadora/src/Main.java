import java.util.Scanner;

import br.com.cassiomello.areacirculo.Circulo;
import br.com.cassiomello.calculadora.Calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        
        Scanner scanner = new Scanner(System.in);
        calculadora.numero1 = scanner.nextInt();
        calculadora.numero2 = scanner.nextInt();
        calculadora.operador = scanner.next();

       System.out.println("Informe o raio do circulo para calcular a aere:");
       double raio = scanner.nextDouble();


        Circulo meCirculo = new Circulo(raio);

        meCirculo.exibirArea();

        calculadora.calcular(calculadora.numero1, calculadora.numero2, calculadora.operador);
        System.out.println("o Resultado é: " + calculadora.resultado);



        scanner.close();
    }
}
