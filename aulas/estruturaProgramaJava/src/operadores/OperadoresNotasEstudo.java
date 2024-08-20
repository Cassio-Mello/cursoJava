package operadores;

public class OperadoresNotasEstudo {
    public static void main(String[] args) {
        
        //soma
        int numero1 = 1;
        int numero2 = 2;
        int soma = numero1 + numero2;
        //System.out.println("A soma é: " + soma);

        //subtração
        int numero3 = 3;
        int numero4 = 4;
        int subtracao = numero4 - numero3;
       // System.out.println(subtracao);

        //multiplicacao
        int numero5 = 5;
        int numero6 = 6;
        int multiplicacao = numero5  * numero6;
       // System.out.println(multiplicacao);

        //divisão
        int numero7 = 7;
        int numero71 = 71;
        int divisao = numero71 / numero7;
        //System.out.println(divisao);
        double divisaoD = numero71 / numero7;
        //System.out.println(divisaoD);

        //resto da divisao modulo
        int modulo = numero71 % numero7;
        //System.out.println(modulo);

        //acrescimento
        int contador = 0;
        contador ++;
        contador ++; //++ é operador de acrescimento adiciona +1 ao cobtador

        //decrescimento
        contador --;
        contador --;//--é o contador de decrescimento diminui -1 do contador

        /*
         * operadores relacionais
         * > maior que
         * <menor que
         * >=maior ou igual que
         * <=menor ou igual que
         * ==igual a
         * != diferente de
         */
        
        /*
         * atribuição
         * =atribuição
         * +=atribuição soma
         * -=atribuição subtração
         * *=atribuição multiplicação
         *  ./=atribuiçõ  divisao
         * %=atribuiçaõ modulo
         */

        //operadores logicos

        // &&: e/and
        int valor1 = 4;
        int valor2 = 2;
        boolean expressaoAnd = valor1 < 10 && valor2 < 5;
        System.out.println(expressaoAnd);
        
        // || ou/or
        boolean expressaoOu = valor1 < 10 || valor2 < 5;
        
        // ! operador de nedaçao/not
        boolean expressaoNot = (2 < 1);
        System.out.println(!expressaoNot);




    }
    
}
