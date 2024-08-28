import java.util.Scanner;

public class CompromissoDiasSemanas {
    public static void main(String[] args) {
        //criando os arrays
        String diasDaSemana [] = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabado", "Domingo"};
        String compromissos [][] = new String[7][];

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println();
            System.out.println("Escolha a opção desejada:");
            System.out.println("1. Novo compromisso");
            System.out.println("2. Ver compromissos");
            System.out.println("3. Sair");

            int opcao = scanner.nextInt();

            switch (opcao){
                case 1 ->{
                    System.out.println("Escolha o dia da semana:");
                    System.out.println("1. Segunda");
                    System.out.println("2. Terça");
                    System.out.println("3. Quarta");
                    System.out.println("4.Quinta");
                    System.out.println("5. Sexta");
                    System.out.println("6. Sábado");
                    System.out.println("7. Domingo");
                    System.out.println();

                    int opcaoDiaDaSemana = scanner.nextInt();
                    
                    if (opcaoDiaDaSemana >= 1 && opcaoDiaDaSemana <= 7){
                        System.out.printf("Informe o compromisso para %s:%n", diasDaSemana[opcaoDiaDaSemana - 1]);
                        String compromisso = scanner.next();

                        int diaDoCompromisso = opcaoDiaDaSemana - 1;

                        int tamanhoAtual = compromissos[diaDoCompromisso].length;

                        String []novosCompromissos = new String[tamanhoAtual + 1];


                       

                    }
                }  
                        
                    
                case 2 ->{
                    scanner.close();
                    break;

                } 
            }



        }



    }
}
