public class Livro {
    //criando atributos
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String isbn;

    //construtor
    public Livro(String titulo, String autor, int anoPublicacao, String isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.isbn = isbn;
    }

    //criando toString para listar os livros
    public String toString(){
        return "Título: " + titulo +"\nAutor: " + autor + "\nAno publicação: " + anoPublicacao + "\nISBN: " + isbn+"\n";
        
    }

    //criando geters and seters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    

    
}
