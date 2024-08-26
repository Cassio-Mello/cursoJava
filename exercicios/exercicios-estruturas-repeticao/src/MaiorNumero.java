import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        int maiorNumero = 1;

        Scanner scanner = new Scanner(System.in);

        while (true){
        int numero = scanner.nextInt();
            if (numero > maiorNumero){
                maiorNumero = numero;
            }else if (numero < 0 ){
                break;
            }else{
                continue;
            }
        }
        System.out.println(maiorNumero);
        scanner.close();
    }
    
}
