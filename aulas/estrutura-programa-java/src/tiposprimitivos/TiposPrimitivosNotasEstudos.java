package tiposprimitivos;
/*
 * Notas de estudos tipos primitivos
 * tipos primitivos são providos pela linguagem nativamente
 */

public class TiposPrimitivosNotasEstudos {

    public static void main(String[] args) {

        // Caracteres ou Characters
        char primeiraLetraDoNome = 'G';
        char primeiraLetraDoNomeASCII = 71;

        System.out.println(primeiraLetraDoNome);
        System.out.println(primeiraLetraDoNomeASCII);

        //tipos inteiros ou integers
        byte nota = 10; //-128 até 127
        short itensComprados = 2; // -32768 até 32767
        int qtdEstoque = 23366; // -2_147_483_648 até 2_147_483_647
        long numeroMuitoGrande = 3212345674567894564L; //19digitos

        //tipos decimais
        float peso = 1.5f; //6-7 casas decimais
        double preco = 24.99; //~ 15 casas decimais

        //Booleanos ou Booleans
        boolean verdadeir = true;
        boolean falso = false;
    }

}