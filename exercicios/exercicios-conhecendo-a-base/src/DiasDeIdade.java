import java.util.Scanner;

public class DiasDeIdade {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe sua idade:");
        int idade = scanner.nextInt();
        int idadeEmDias = idade * 365;
        scanner.close();

        System.out.printf("Sua idade em dias é %d", idadeEmDias);
    }
}
