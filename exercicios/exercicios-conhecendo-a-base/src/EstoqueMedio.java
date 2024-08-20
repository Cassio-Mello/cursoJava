import java.util.Scanner;

public class EstoqueMedio {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe aquantidade minima de estoque:");
        int estoqueMin = scanner.nextInt();
        
        System.out.println("Informe aquantidade maxima de estoque:");
        int estoqueMax = scanner.nextInt();
        
        double estoqueMedio = (estoqueMin + estoqueMax) / 2;

        System.out.printf("O estoque medio do produto é de %.0f", estoqueMedio);

        scanner.close();
    }
    
}
