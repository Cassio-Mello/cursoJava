public class ArraysStructure {
    public static void main(String[] args) {
        //declarar e inicializar
        String [] tarefas = {"Estudar java ", "Fazer exercicios", "Tomar café"};

        //acessar posição
        System.out.println(tarefas[0]);
        System.out.println(tarefas[1]);
        System.out.println(tarefas[2]);

        //atualizar posições array
        tarefas[2] = "limpar casa";
        System.out.println(tarefas[2]);

        //tamanho arrays
        System.out.println("Voce possui " + tarefas.length + " tarefas");
    }
}
