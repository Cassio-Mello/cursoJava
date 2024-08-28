import java.util.Scanner;

public class ComparandoNumerosArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //recebendo o tamanho do primeiro array
        System.out.println("Informe o tamanho do Array 1:");
        int tamanhoArray1 = scanner.nextInt();
        
        //recebendo o tamanho do segundo array
        System.out.println("Informe o tamanho do Array 2:");
        int tamanhoArray2 = scanner.nextInt();
        
        //criando arrays com o tamanho indicado
        int [] array1 = new int[tamanhoArray1];
        int [] array2 = new int[tamanhoArray2];

        //receendo valores do array 1
        System.out.printf("Informe %d numeros do Array 1:%n", tamanhoArray1 );
        for (int i = 0; i < tamanhoArray1; i++){
            array1[i] = scanner.nextInt();
        }
        //recebendo valores do array 2
        System.out.printf("Informe %d numeros do Array 2:%n", tamanhoArray2 );
        for (int i = 0; i < tamanhoArray2; i++){
            array2[i]= scanner.nextInt();
        }
        

        for (int numero1 : array1) {
            for ( int numero2 : array2){
                if (numero1 == numero2){
                    System.out.println(numero1);
                }
            }
            
        }

        scanner.close();

    }
}
