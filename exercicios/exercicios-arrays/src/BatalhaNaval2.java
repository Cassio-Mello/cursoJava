import java.util.Scanner;

public class BatalhaNaval2 {
    public static void main(String[] args) {
        //criação de variaveis e array
        Scanner scanner = new Scanner(System.in);
        
        //array do campo
        String campoNaval [][] = {{"~ ","~ ","~ ","~ ","~ "}, {"~ ","~ ","~ ","~ ","~ "}, {"~ ","~ ","~ ","~ ","~ "},{"~ ","~ ","~ ","~ ","~ "},{"~ ","~ ","~ ","~ ","~ "}};
        //array de indicador lateral
        String indicadorPosLateral [] = {"0- ","1- ","2- ","3- ","4- "};
        
        //variaveis de posição dos navios
        int posicao1Navio1;
        int posicao2Navio1;

        int posicao1Navio2;
        int posicao2Navio2;

        int posicao1Navio3;
        int posicao2Navio3;

        
        // variaveis de posiçoes de ataque do jogador
        int jogadorPosicao1;
        int jogadorPosicao2;
        
        //variavel de numero de tentativas
        int tentativas = 10;
        
        while (tentativas > 0){
            
            System.out.println("Informe a linha e a coluna da posição do Navio 1 entre (0 e 4):");
            posicao1Navio1 = scanner.nextInt();
            posicao2Navio1 = scanner.nextInt();
            
            System.out.println("Informe a linha e a coluna da posição do Navio 2 entre (0 e 4):");
            posicao1Navio2 = scanner.nextInt();
            posicao2Navio2 = scanner.nextInt();
            
            
            System.out.println("Informe a linha e a coluna da posição do Navio 3 entre (0 e 4):");
            posicao1Navio3 = scanner.nextInt();
            posicao2Navio3 = scanner.nextInt();
            
            
            //variavel para condição de teste se nao posições repetidas
            boolean  testePosisao = posicao1Navio1 == posicao1Navio2 && posicao1Navio2 == posicao2Navio2 || posicao1Navio2 == posicao1Navio3 && posicao2Navio2 == posicao2Navio3 || posicao1Navio1 == posicao1Navio3 && posicao2Navio1 == posicao2Navio3;
            
            if (testePosisao){

                continue;

            }

            for (int t = tentativas; t > 0; t--){

                System.out.printf("Tentativa %d.%n", tentativas);
                System.out.println("Informe a lnha e coluna que deseja atacar Ex(2 4):");
                jogadorPosicao1 = scanner.nextInt();
                jogadorPosicao2 = scanner.nextInt();

                tentativas--;

                if (jogadorPosicao1 == posicao1Navio1 && jogadorPosicao2 == posicao2Navio1){

                    campoNaval[posicao1Navio1][posicao2Navio1] = "X ";
                    
                }else if (jogadorPosicao1 == posicao1Navio2 && jogadorPosicao2 == posicao2Navio2){
                    
                    campoNaval[posicao1Navio2][posicao2Navio2] = "X ";
                    
                }else if (jogadorPosicao1 == posicao1Navio3 && jogadorPosicao2 == posicao2Navio3){
                    
                    campoNaval[posicao1Navio3][posicao2Navio3] = "X ";

                }else{
                    
                    continue;
                }

                System.err.println("   0 1 2 3 4");

                for (int i = 0; i < campoNaval.length; i++){

                    System.out.print(indicadorPosLateral[i]);

                    for (int j = 0; j < campoNaval[i].length; j++){

                        System.out.print(campoNaval[i][j]);
                        
                    }

                    System.out.println();

                }

            }

            //condição para avalair se ganhou
            boolean condicaoGanhou = campoNaval[posicao1Navio1][posicao2Navio1] == "X " && campoNaval[posicao1Navio2][posicao2Navio2] == "X " && campoNaval[posicao1Navio3][posicao2Navio3] == "X ";

            if (condicaoGanhou){

                System.out.println("Parabén! Você Ganhou :)");

            }

            System.out.println("Você Perdeu :(");

        }
        scanner.close();
    

    }
}
