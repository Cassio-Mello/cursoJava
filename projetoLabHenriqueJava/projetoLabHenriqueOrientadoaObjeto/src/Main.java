import java.util.Scanner;

import br.com.cassiomello.amostra.Amostra;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Amostra amostra = new Amostra(null, 0, 0, 0, 0, 0, 0, 0);

        while (true) {
            
        amostra.informarParametros(scanner);

        amostra.tiparAmostra();

        amostra.imprimirResultados();

        scanner.close();

        System.out.println("Fazer nova análise? 1.Sim 2Não");
        int sair = scanner.nextInt();
        if (sair == 1){
            break;
        }else{
            continue;
        }

        }
    }
    
}