import java.util.Scanner;

public class EstruturaWhile {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);


        
        int numeroSecreto = 5;

        int numeroTentativas = 5;

        while (numeroTentativas > 0){
            
            System.out.println("Informe um numero entre 1 e 10");
            int numeroInformado = scanner.nextInt();

            if (numeroInformado == numeroSecreto){

                System.out.println("Parbens! Você aertou!");

            }else{
                
                numeroTentativas --;
                
                System.out.println("Errou! Tente novamente");
            }
        }
        scanner.close();
    }
    
}
