import java.util.Scanner;

public class PiramideDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i, j;
        
        for (i = 1; i <= n; i++){

            for (j = 1; j <= i; j++){
                System.out.print(j);
                
            }
            System.out.println();
        }
            
        scanner.close();
    }
}
