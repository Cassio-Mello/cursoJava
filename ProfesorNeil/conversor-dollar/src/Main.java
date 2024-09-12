import java.util.Scanner;

import entities.CurrencyConverter;

public class Main {
    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in);
       CurrencyConverter dollarConverter = new CurrencyConverter(0, 0);

       System.out.println("What is the dollar price? ");
       dollarConverter.setDollarPrice(scanner.nextDouble());
       
       System.out.println("How many dollars will be bougth? ");
       dollarConverter.setBuyDollar(scanner.nextDouble());

       System.out.println(dollarConverter.toString());
       
       scanner.close();


    }
}
