public class Item {
    private String nomeItem;
    private Double preco;

    public Item(String nomeItem, Double preco){
        this.nomeItem = nomeItem;
        this.preco = preco;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String toString(){
        return nomeItem + "  R$" + preco;
    }

}




