public class Main {
    public static void main(String[] args) {
        /*
         * Descrição do Exercício
Objetivo: Criar um sistema em Java que permita gerenciar os pedidos de um restaurante.
 O sistema deve oferecer funcionalidades para cadastrar novos pedidos,
  atualizar itens dentro de um pedido existente, 
  calcular o total de cada pedido e exibir uma lista de todos os pedidos feitos.

Requisitos
Classe ItemPedido:

Atributos:
nomeItem (String): O nome do item (ex: "Hambúrguer", "Pizza").
quantidade (int): A quantidade desse item no pedido.
precoUnitario (double): O preço unitário do item.
Métodos:
Construtores: Para inicializar os atributos da classe.
Métodos getters e setters: Para acessar e modificar os atributos do item.
getPrecoTotal(): Calcula o preço total do item multiplicando a quantidade pelo preço unitário.
toString(): Para exibir as informações do item em um formato legível.

Classe Pedido:

Atributos:
idPedido (int): Um identificador único para o pedido.
ArrayList<ItemPedido>: Uma lista de itens que compõem o pedido.
Métodos:
Construtores: Para inicializar os atributos da classe.
adicionarItem(ItemPedido item): Adiciona um item ao pedido.
removerItem(String nomeItem): Remove um item do pedido com base no nome.
atualizarItem(String nomeItem, int novaQuantidade): Atualiza a quantidade de um item existente no pedido.
calcularTotal(): Calcula o valor total do pedido, somando o preço de todos os itens.
toString(): Para exibir as informações do pedido, incluindo os itens e o valor total.
Classe ControlePedidos:

Atributos:
ArrayList<Pedido>: Uma lista que armazenará todos os pedidos.
Métodos:
adicionarPedido(Pedido pedido): Adiciona um novo pedido à lista de pedidos.
removerPedido(int idPedido): Remove um pedido da lista com base no ID.
listarPedidos(): Exibe todos os pedidos feitos, mostrando os detalhes de cada um.
getPedido(int idPedido): Retorna um pedido específico com base no ID.
Classe SistemaRestaurante (Classe principal):

Métodos:
main(String[] args): O ponto de entrada do programa, onde você poderá testar as funcionalidades do sistema.
Menu interativo (opcional): Um menu para o usuário interagir com o sistema, podendo escolher entre as opções de cadastrar, atualizar, remover ou listar pedidos.
         */
    }
}
