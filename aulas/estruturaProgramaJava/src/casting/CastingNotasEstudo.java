package casting;
/*
 * Casting: trasnformar um tipo de dado em outro
 * Widening Casting vs Narrowing Casting
 */

public class CastingNotasEstudo {
    public static void main(String[] args) {

        //Widening Casting(implicito)
        byte variavelPequena = 1;
        int variavelGrande = variavelPequena;
        
        System.out.println(variavelGrande);

        //Narrowing Casting (Explicito)
        long variavelLonga = 232424324324325L;
        int variavelInt2 = (int) variavelLonga;

        //operação de divisão numeros inteiros
        int numero1 = 9;
        int numero2 = 2;
        float resultadoDivisao = (float) numero1 / numero2;
        System.out.println(resultadoDivisao);



        
    }
    
}
