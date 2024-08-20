import java.util.Scanner;

public class RelacionamentoDeOrdem {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero inteiro:");
        int numero1 = scanner.nextInt();
        System.out.println("Informe um outro numero inteiro:");
        int numero2 = scanner.nextInt();
        System.out.println("Dados os numeros " + numero1 + " e " + numero2);
        System.out.println(numero1 + " = " + numero2 + "? " + (numero1 == numero2));
        System.out.println(numero1 + " != " + numero2 + "? " + (numero1 != numero2));
        System.out.println(numero1 + " > " + numero2 + "? " + (numero1 > numero2));
        System.out.println(numero1 + " < " + numero2 + "? " + (numero1 < numero2));
        scanner.close();
    }
    
}
