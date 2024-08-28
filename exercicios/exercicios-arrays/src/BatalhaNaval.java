import java.util.Scanner;

public class BatalhaNaval {
  public static void main(String[] args) {
      String campoNaval [][] = {{"~ ","~ ","~ ","~ ","~ "}, {"~ ","~ ","~ ","~ ","~ "}, {"~ ","~ ","~ ","~ ","~ "},{"~ ","~ ","~ ","~ ","~ "},{"~ ","~ ","~ ","~ ","~ "}};
      String indicadorPosLateral [] = {"0- ","1- ","2- ","3- ","4- "};

      int tentativas = 3;
        
       Scanner scanner = new Scanner(System.in);
      while (tentativas > 0){
        
        System.out.println("Informe a posição do Navio 1 Entre(0 4)");
        int posicao1Navio1 = scanner.nextInt();
        int posicao2Navio1 = scanner.nextInt();
        
        System.out.println("Informe a posição do Navio 2 Ex(0 1)");
        int posicao1Navio2 = scanner.nextInt();
        int posicao2Navio2 = scanner.nextInt();
        System.out.println("Informe a posição do Navio 3 Ex(0 1)");
        int posicao1Navio3 = scanner.nextInt();
        int posicao2Navio3 = scanner.nextInt();
        
        boolean  testePosisao = posicao1Navio1 == posicao1Navio2 && posicao1Navio2 == posicao2Navio2 || posicao1Navio2 == posicao1Navio3 && posicao2Navio2 == posicao2Navio3 || posicao1Navio1 == posicao1Navio3 && posicao2Navio1 == posicao2Navio3;
        

        if (testePosisao){
          continue;
        }
        
        for (int i = 3; i > 0; i--){
          System.out.printf("Tentativa %d, informe as posiçoes:",i);
          int jogadorPosicao1 = scanner.nextInt();
          int jogadorPosicao2 = scanner.nextInt();
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

          System.out.println("   0 1 2 3 4 ");

          for (int e = 0; e < campoNaval.length; e++){

            System.out.print(indicadorPosLateral[e]);
            for (int j = 0; j < campoNaval[e].length; j++){
              System.out.print(campoNaval[e][j]);            
            }
            System.out.println();
          }

          }
          boolean condicaoGanhou = campoNaval[posicao1Navio1][posicao2Navio1] == "X " && campoNaval[posicao1Navio2][posicao2Navio2] == "X " && campoNaval[posicao1Navio3][posicao2Navio3] == "X ";
          if (condicaoGanhou){
            System.out.println("Voce Ganhou");
          }

          
          System.out.println("Voce perdeu");
        }
        scanner.close();
        
          

        
  
  
  
  
  
  
  

      }
        
        /*
         * Batalha Naval
Implementar um batalha naval, onde dado um mapa o usuário tenta adivinhar onde estão os navios.
 Considere um tabuleiro de tamanho 5 x 5 e 10 tentativas para acertar a posição de 3 navios que estão no mapa 
 (navio ocupa apenas uma posição). 

O jogo deve solicitar primeiro a posição dos 3 navios, e então preencher o mapa com água (~) e com os navios (N).
 Após isso, devem ser lidas a linha e a coluna que o usuário acha que o navio está. 
 Caso ele consiga acertar antes das tentativas esgotarem, ele verá uma mensagem de vitória:

Digite as posições dos navios: 
Navio 1: 
0 0
Navio 2: 
1 1
Navio 3: 
2 2
Bem-vindo ao jogo de Batalha Naval!
Você tem 10 tentativas para afundar 3 navios.
 
  0 1 2 3 4
0 N ~ ~ ~ ~ 
1 ~ N ~ ~ ~ 
2 ~ ~ N ~ ~ 
3 ~ ~ ~ ~ ~ 
4 ~ ~ ~ ~ ~ 
Tentativas restantes: 10
Digite a linha e a coluna (0-4): 0 0
Você acertou um navio!
 
  0 1 2 3 4
0 X ~ ~ ~ ~ 
1 ~ N ~ ~ ~ 
2 ~ ~ N ~ ~ 
3 ~ ~ ~ ~ ~ 
4 ~ ~ ~ ~ ~ 
Tentativas restantes: 9
Digite a linha e a coluna (0-4): 1 1
Você acertou um navio!
 
  0 1 2 3 4
0 X ~ ~ ~ ~ 
1 ~ X ~ ~ ~ 
2 ~ ~ N ~ ~ 
3 ~ ~ ~ ~ ~ 
4 ~ ~ ~ ~ ~ 
Tentativas restantes: 8
Digite a linha e a coluna (0-4): 2 2
Você acertou um navio!
Parabéns! Você afundou todos os navios.
         */
    }


