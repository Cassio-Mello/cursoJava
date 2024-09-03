public class Jogador {
    /*
     * Crie uma classe Jogador com os atributos nome, placarGeral e placarIndividual. 
O placar individual vai pertencer a cada jogador do time, já o placar geral pertence a todo o time e é a soma das suas pontuações.

Crie um construtor que inicializa o nome do Jogador.

Crie um método derrotarMonstro que incrementa o placar individual e o placar geral em 1.

Sobrescreva o método equals que verifica se um jogador é igual ao outro checando o seu nome.
     */

     //atributos
     private String nome;
     private int placarGeral;
     private int placarIndividual;

     public Jogador(String nome){
        this.nome = nome;
     }

     public void derrotarMonstro(){
        this.placarIndividual ++;
        placarGeral ++;

      
     }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((nome == null) ? 0 : nome.hashCode());
      return result;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      Jogador other = (Jogador) obj;
      if (nome == null) {
         if (other.nome != null)
            return false;
      } else if (!nome.equals(other.nome))
         return false;
      return true;
   }
     



     
}
