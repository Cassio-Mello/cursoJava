import java.util.Scanner;

public class CategoriaAtleta {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a idade do atleta:");
        int idade = scanner.nextInt();

        boolean mirim = idade >= 10 && idade <= 12;
        boolean infantil = idade >=13 && idade <= 15;
        boolean juvenil = idade >=16 && idade <=18;

        if (mirim)
            System.out.println("O atleta é da categoria mirim");
       
        else if (infantil)
            System.out.println("O atleta é da categoria infantil");
       
        else if (juvenil)
            System.out.println("O atleta é da categoria juvenil");
    
        else            
            System.out.println("O atleta nao se enquadra em nenhuma categoria");
        
        scanner.close();

    }
    
}
