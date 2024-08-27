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
        
        //Arrays de Arrays - Array Multidimencional
        //Dado Tabular - Linhas e Colunas
        int [][] sudoku = { {3, 6, 7}, {4, 9, 8}, {5, 2, 1} };
        
        //Loop
        //for
        for (int i = 0; i < sudoku.length; i++){
            for (int j = 0; j < sudoku[i].length; j++){
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }

        //for each
        for (int [] linhaSudoku : sudoku){
            for (int numero : linhaSudoku){
                System.out.print(numero + " ");
            }
            System.out.println();
        }
    }
}
