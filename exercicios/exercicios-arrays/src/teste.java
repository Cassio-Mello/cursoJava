import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        String[] diasDaSemana = { "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo" };
        String[][] compromissos = new String[7][0];
    
        Scanner scanner = new Scanner(System.in);
    
        while (true) {
          // Exibir opções
          System.out.println();
          System.out.println("Escolha uma opção:");
          System.out.println("1. Exibir compromissos");
          System.out.println("2. Cadastrar compromisso");
          System.out.println("3. Sair");
    
          int opcao = scanner.nextInt();
    
          switch (opcao) {
            case 1 -> {
              // Exibir compromissos
              for (int i = 0; i < compromissos.length; i++) {
                System.out.println();
                System.out.println(diasDaSemana[i] + ":");
                for (String compromisso : compromissos[i]) {
                  System.out.println("- " + compromisso);
                }
              }
            }
            case 2 -> {
              // Cadastrar compromisso
              System.out.println();
              System.out.println("Digite o dia da semana (1, 2, 3, 4, 5, 6, 7):");
              int dia = scanner.nextInt();
    
              if (dia >= 1 && dia <= 7) {
                scanner.nextLine(); // Consumir a quebra de linha pendente
                System.out.println("Digite o compromisso:");
                String compromisso = scanner.nextLine();
    
                int diaDoCompromisso = dia - 1;
                // Adicionar o compromisso ao array do dia correspondente
                int tamanhoAtual = compromissos[diaDoCompromisso].length;
                // Novo array para os novos compromissos
                String[] novosCompromissos = new String[tamanhoAtual + 1];
                for (int i = 0; i < tamanhoAtual; i++) {
                  novosCompromissos[i] = compromissos[diaDoCompromisso][i];
                }
                novosCompromissos[tamanhoAtual] = compromisso;
                compromissos[diaDoCompromisso] = novosCompromissos;
              }
            }
            default -> {
              System.out.println("Saindo...");
              scanner.close();
              return;
            }
          }
        }
    }
}
