import java.util.Scanner;

public class AreaGeometrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a forma geometrica (triangulo, retangulo ou circulo):");
        String formaGeom = scanner.next().toLowerCase();

        switch (formaGeom){
            case "triangulo" ->{
                
                System.out.println("Informe o tamnho da base:");
                int baseTri = scanner.nextInt();
                
                System.out.println("Informe o tamnho da altura:");
                int alturaTri = scanner.nextInt();

                double areaTri = (baseTri * alturaTri) / 2;

                System.out.printf("A area do triangulo é: %.2f", areaTri );
            }
            case "retangulo" ->{
                
                System.out.println("Informe o tamnho da base:");
                int baseRet = scanner.nextInt();
                
                System.out.println("Informe o tamnho da altura:");
                int alturaRet = scanner.nextInt();
                
                int areaRet = baseRet * alturaRet;
                
                System.out.printf("A área do retangulo é: %d", areaRet);
            }
            case "circulo" ->{
                
                System.out.println("Informe o raio do circulo:");
                int raioCirc = scanner.nextInt();
                
                double areaCirc = Math.PI * (raioCirc * raioCirc);
                
                System.out.printf("A área do circulo é: %.2f", areaCirc);

            }
            default -> System.out.println("Dado Inválido");
        }

        scanner.close();
    }
    
}
