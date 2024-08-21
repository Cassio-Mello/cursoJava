
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro numero");
        int numero1 = scanner.nextInt();
        
        System.out.println("Informe o operador (-, +, *, /)");
        String operador = scanner.next();
        
        System.out.println("Informe o segundo numero");
        int numero2 = scanner.nextInt();

        switch (operador){
            case "-" -> System.out.printf("%d - %d = %d", numero1, numero2, numero1 - numero2);
            case "+" -> System.out.printf("%d - %d = %d", numero1, numero2, numero1 + numero2);
            case "*" -> System.out.printf("%d - %d = %d", numero1, numero2, numero1 * numero2);
            case "/" -> System.out.printf("%d - %d = %d", numero1, numero2, numero1 / numero2);

        }
        




        scanner.close();


    }
}
