import java.util.Scanner;

public class Contando1a10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero inteiro:");
        int n = scanner.nextInt();
        int i = 0;
        int soma = 0;

        while (i < n){
            i++;
            soma += i;
        }
        System.out.println(soma);
        scanner.close();

    }
    
}
