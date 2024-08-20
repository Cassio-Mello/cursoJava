import java.util.Scanner;

public class PrecoComDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor do produto:");
        double valorProduto = scanner.nextDouble();
        System.out.println("Informe o desconto %:");
        int desconto = scanner.nextInt();
       
        double valorEconomizado = (valorProduto * desconto) / 100;
        double valorProdutoComDesconto = valorProduto - valorEconomizado;
       
        System.out.printf("O preço com desconto é R$%.2f e o valor economizado foi R$%.2f", valorProdutoComDesconto, valorEconomizado);


        scanner.close();
    }
    
}
