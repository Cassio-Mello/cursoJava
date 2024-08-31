import java.util.Scanner;

public class ProjLabHenrJava {
    public static void main(String[] args) {
        
        //criando variáveis e coletando informações
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome da amostra:");
        String nomeAmostra = scanner.next();
        
        System.out.println("Informe a quantidade total (g):");
        double qtdTotalAmostra = scanner.nextDouble();
        
        System.out.println("Informe a quantida de residuos (g):");
        double qtdResiduo = scanner.nextDouble();
        
        System.out.println("Informe a quantida de ardidos (g):");
        double qtdArdido = scanner.nextDouble();
        
        System.out.println("Informe a quantida de carunchados (g):");
        double qtdCarunchado = scanner.nextDouble();
        
        System.out.println("Informe a quantida de quebrados (g):");
        double qtdQuebrado = scanner.nextDouble();
        
        System.out.println("Informe a quantida de outros avariados (g):");
        double qtdOutrosAvariados = scanner.nextDouble();
        
        System.out.println("Informe a umidade (%):");
        double percentualUmidade = scanner.nextDouble();

        //calculando percentuais
        double percentualResiduo = (qtdResiduo * 100) / qtdTotalAmostra;
        double percentualArdido = (qtdArdido * 100) / qtdTotalAmostra;
        double percentualCarunchado = (qtdCarunchado * 100) / qtdTotalAmostra;
        double percentualQuebrado = (qtdQuebrado * 100) / qtdTotalAmostra;
        double percentualOutrosAvariados = (qtdOutrosAvariados * 100) / qtdTotalAmostra;
        double percentualAvariadosTotais = percentualArdido + percentualCarunchado + percentualQuebrado +percentualOutrosAvariados;

        //exibindo percentuais
        System.out.printf("Quantidade de residuos %.2f porcento \n", percentualResiduo);
        System.out.printf("Quantidade de ardidos %.2f porcento \n", percentualArdido);
        System.out.printf("Quantidade de carunchados %.2f porcento \n", percentualCarunchado);
        System.out.printf("Quantidade de qubrados %.2f porcento \n", percentualQuebrado);
        System.out.printf("Quantidade de outros avariados %.2f porcento \n", percentualOutrosAvariados);
        System.out.printf("Quantidade de avariados totais %.2f porcento \n", percentualAvariadosTotais);

        //condição tipo 1
        //umidade < 14% e residuos <=1 andardidos <=1% e carunchados <= 2% e qubrados <= 3% e avariados total <= 6%
        if ( percentualUmidade <= 14 && percentualResiduo <= 1 && percentualArdido <=1 
        && percentualCarunchado <= 2 && percentualQuebrado <= 3 && percentualAvariadosTotais <= 6){
            System.out.println("A amostra " + nomeAmostra + " é do TIPO 1");
        }
        
        //condição tipo 2
        //umidade < 14% e residuos <= 1,5 ardidos <=2% e carunchados <= 3% e qubrados <= 4% e avariados total <= 10%
        else if ( percentualUmidade <= 14 && percentualResiduo <= 1.5 
        && percentualArdido <= 2 && percentualCarunchado <= 3 && percentualQuebrado <= 4 
        && percentualAvariadosTotais <= 10){
            System.out.println("A amostra " + nomeAmostra + " é do TIPO 2");
        }
        //condição tipo 3
        //#umidade < 14% e residuos <= 2 ardidos <=3% e carunchados <= 4% e qubrados <= 5% e avariados total <= 15%
        else if ( percentualUmidade <= 14 && percentualResiduo <= 2 
        && percentualArdido <= 3 && percentualCarunchado <= 4 && percentualQuebrado <= 5
         && percentualAvariadosTotais <= 15){
            System.out.println("A amostra " + nomeAmostra + " é do TIPO 3");
        }
        else{
            System.out.println("Fora de TIPO");
        }

        scanner.close();
    }
}
