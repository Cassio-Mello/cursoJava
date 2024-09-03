public class Carro {
    private String modelo;
    private int ano;
    private String cor;
    private int velocidade;

    public Carro(String modelo, int ano, String cor, int velocidade){
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.velocidade = velocidade;
    }

    public int acelerar(){
        return  velocidade += 10;
    }

    public void getDetalhes(){
        System.out.println("Modelo: " + modelo + "\n Ano: " + ano + "\n Cor: " + cor + "\n Velocidade: " + velocidade);
    }
}
