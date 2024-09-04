import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros; 

    //Construtor classe Biblioteca
    public Biblioteca(){
        this.livros = new ArrayList<>();
    }

    //Método para adicionar um livro ao array list
    public void adicinoarLivro(Livro livro){
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro.getTitulo());
    }

    //metodo para remover um livro pelo isbn
    public void removerLivro(String isbn){
        for (int i = 0; i < livros.size(); i++){
            if (livros.get(i).getIsbn().equals(isbn)){
                System.out.println("Livro removido: " + livros.get(i).getTitulo());
                livros.remove(i);
                return;
            }
        }
        System.out.println("Livro com ISBN " + isbn + " não encontrado");
    }

    //método para atualizar um ivro
    public void atualizarLivro(String isbn, Livro livroAtualizado){
        for (int i = 0; i < livros.size(); i++){
            if (livros.get(i).getIsbn().equals(isbn)){
                livros.set(i, livroAtualizado);
                System.out.println("Livro atualizado : " + livroAtualizado.getTitulo());
                return;

            }

        }
        System.out.println("Livrocom ISBN: " + isbn + "não encontrado");

    }

    //método para listar livros
    public void listarLivros(){
        if (livros.isEmpty()){
            System.out.println("Nenhum livro encontrado");
        }else{
            for(Livro livro : livros){
                System.out.println(livro);
            }
        }
    }

}


