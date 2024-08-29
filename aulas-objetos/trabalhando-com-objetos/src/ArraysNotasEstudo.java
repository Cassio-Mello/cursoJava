import java.util.Arrays;

public class ArraysNotasEstudo {
    public static void main(String[] args) {
        int[] idades = {5, 10};

        System.out.println(Arrays.toString(idades));

        Gato[] gatos = {new Gato("Leia"), new Gato("Rey")};
        System.out.println(Arrays.toString(gatos));   
    }
}
