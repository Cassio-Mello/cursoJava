public class Metodos {
    public static void main(String[] args) {
        //ativarSoneca();
       String mensagemDoAlarme =  agendarAlarme(12, 30);
       System.out.println(mensagemDoAlarme);
    }
        /*
         * Sintaxe da declaração de metodos(funçoes) no java:
         * 
         * <tipo de retorno do metodo(int, boolean, void etc)> identificador(<tipo> parametro){
         *  <bloco de comando>
         * }
         */

        static void ativarSoneca(){
            System.out.println("Só mais 5 minutinhos");
        }

        static String agendarAlarme(int hora, int minutos){
            return "Seu alarme foi configurado às " + hora + ":" + minutos;
        }
    }
    
