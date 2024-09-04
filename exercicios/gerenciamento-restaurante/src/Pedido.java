import java.util.ArrayList;
public class Pedido {
    private int idPedido;
    private ArrayList<Item> itensPedidos;

    public Pedido(int idPedido){
        this.idPedido = idPedido;
        this.itensPedidos = new ArrayList<>();
    }

    public void adicionarItem(Item Item){
        itensPedidos.add(Item);
        System.out.println( Item.getNomeItem() + " Adicionado ao pedido");
    }

}
