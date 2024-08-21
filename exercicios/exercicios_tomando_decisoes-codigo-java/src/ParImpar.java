import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero inteiro:");
        int numero = scanner.nextInt();

        boolean par = numero % 2 == 0;

        if (par)
            System.out.printf("O numero %d é par.", numero);
        else
            System.out.printf("O numero %d é impar", numero);


        scanner.close();

    }
    
}
