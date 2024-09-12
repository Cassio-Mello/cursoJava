package entities;

import java.util.ArrayList;



public class Agenda {
    //Atributos
    private ArrayList<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    
    //metodo adicionar contato
    public void adicionarContato(Contato contato){
        contatos.add(contato);
        System.out.println("Contato " + contato.getNome() + " adicionado com sucesso!");

    }

    //metodo remover contato
    public boolean removerContato(String nome){
        for(int i = 0; i < contatos.size(); i++){
            if (contatos.get(i).getNome().equals(nome)){
                System.out.println("Contato " + nome + " removido com sucesso");
                contatos.remove(i);
                return true;
            }
        }
        System.out.println("Contato: " + nome + " não encontrado!");
        return false;
    }

    //metodo buscar contato
    public Contato buscarContato(String nome){
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)){
                return contato;
            }
        }
        return null;    
    }

    //metodo buscar contatos
    public void listarContatos(){
        if (contatos.isEmpty()){
            System.out.println("..::NENHUM CONTATO ENCONTRADO::..");
        }else{
            for (Contato contato : contatos) {
                contato.exibirContato();
            }
        }
    }
    
}
