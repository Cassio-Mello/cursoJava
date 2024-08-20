import java.io.Console;

public class BoasVindas {
    public static void main(String[] args) {
        Console console = System.console();

        System.out.println("Qaul o seu nome:");
        String nome = console.readLine();
        System.out.println("Olá, " + nome);
    }
    
}