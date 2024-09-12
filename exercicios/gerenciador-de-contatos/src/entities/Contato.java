package entities;


public class Contato {
    //atributos
    private String nome;
    private String telefone;
    private String email;

    //contrutor
    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void exibirContato(){
        System.out.println("\nNome: " + getNome() + "\nTelefone: " + getTelefone() + "\nE-mail: " + getEmail() + "\n");
    }

    
    
}
