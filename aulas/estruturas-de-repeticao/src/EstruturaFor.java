public class EstruturaFor {
    public static void main(String[] args) {
        
        int n = 7;
        int fatorial = 1;

        for (int i =1; i <= n ; i++){
            fatorial = fatorial * i;

        }
        System.out.printf(" fatorial de %d é %d", n, fatorial);
    }
    
}
