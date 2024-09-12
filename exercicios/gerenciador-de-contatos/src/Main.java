import java.util.Scanner;



import entities.Agenda;
import entities.Contato;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Agenda agenda = new Agenda();

        while (true){
            System.out.println("Insira o nome:");
            String nome = scanner.nextLine();
            System.out.println("Insira o telefone");
            String telefone = scanner.nextLine();
            System.out.println("Insira o email:");
            String email = scanner.nextLine();
            
            Contato contato = new Contato(nome, telefone, email);
            agenda.adicionarContato(contato);
            
            System.out.println("Adicionar outro contato? [S]im  [N]ão");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("s")){
                continue;
            }
            
            break;


        }
    



        
        


        scanner.close();
    }
}
