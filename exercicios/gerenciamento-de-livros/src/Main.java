public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("Historia de Capela", "Professor Laerte", 2000, "0001-0001-000");
        biblioteca.adicinoarLivro(livro1);
        
        Livro livro2 = new Livro("historia barbeari", "cassio mello", 2016, "0002-0002-001");
        biblioteca.adicinoarLivro(livro2);


        biblioteca.listarLivros();
        
        Livro livroAtualizado = new Livro("barbearia coronel", "Cássio Mello", 2015, "0003-0003-001");
        biblioteca.atualizarLivro("0002-0002-001", livroAtualizado);
        biblioteca.listarLivros();
    }


        

}
