import java.util.Scanner;

public class ArrayDeTarefas {
    public static void main(String[] args) {
        String[] tarefas = new String[] {
            "x", "x", "x", "x", "x", "x", "x", "x", "x", "x" };
     
        Scanner scanner = new Scanner(System.in);
        while (true) {
          // Lê opção (1 - Cadastrar, 2 - Exibir, Qualquer outra - Sair)
          System.out.println("\nOpções:");
          System.out.println("1. Cadastrar tarefa");
          System.out.println("2. Listar tarefas");
          System.out.println("3. Sair");
          
          int opcao = scanner.nextInt();
          scanner.nextLine(); // Limpar o buffer do teclado
    
          switch (opcao) {
            // Escreva a solução a partir daqui...
            case 1 -> { 
                System.out.println("informe o numero da tarefa:");
                int numeroTarefa = scanner.nextInt();
                scanner.nextLine();
                
                if (numeroTarefa <= 0 || numeroTarefa > 10){
                  System.out.println("Posição Invalida");
                  continue;
                }
                System.out.println("Informe uma tarefa:");
                String tarefa = scanner.nextLine();
                tarefas[numeroTarefa - 1] = tarefa;
                  
                
          }
            case 2 -> {
              for (int i = 0; i < tarefas.length; i++ ){
                System.out.printf("Tarefa %d - %s%n", i + 1, tarefas[i]);
              }
            }

            default -> {
              System.out.println("Encerrando programa...");
              scanner.close();
              return;
            }
          }
        }
    }
}
