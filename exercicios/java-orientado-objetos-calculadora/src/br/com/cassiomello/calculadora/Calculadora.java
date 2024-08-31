package br.com.cassiomello.calculadora;
public class Calculadora {
    public int numero1;
    public int numero2;
    public String operador;
    public int resultado;

    //metodo somar
    public int calcular(int numero1, int numero2, String operador){
        switch (operador){
            case "-": 
                resultado = numero1 - numero2;
                break;

            case "+":

                resultado = numero1 + numero2;
                break;

            case "*":
                resultado = numero1 * numero2;
                break;

            case "/":
                resultado = numero1 / numero2;

            default:
                System.out.println("operação invalida");
            
        }
    return resultado;
    }
}
