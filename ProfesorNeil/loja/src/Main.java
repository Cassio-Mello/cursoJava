import java.util.Scanner;

import entities.Product;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Product product = new Product();
        
        System.out.println("Enter product data:");
       
        System.out.println("Product:");
        product.setName(scanner.nextLine());
        System.out.println("Price:");
        product.setPrice(scanner.nextDouble());
        System.out.println("Qauntity:");
        product.setQuantity(scanner.nextInt());

        
        
        System.out.println(product.toString());

        System.out.println("Entry new quntidy:");
        product.addProducts(scanner.nextInt());
        scanner.nextLine();
        System.out.println(product.toString());

        



        scanner.close();
    

    }
}
