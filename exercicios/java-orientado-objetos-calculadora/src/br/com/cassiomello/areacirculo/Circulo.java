package br.com.cassiomello.areacirculo;

public class Circulo {
    private double raio;

    //contrutor

    public Circulo(double raio){
        this.raio = raio;
    }

    //metodo par clcular a area
    public double calcularArea(){
        return 3.14 * (raio * raio);
    }

    //metodo para exiir a area
    public void exibirArea() {
        double area = calcularArea();
        System.out.println("A área do círculo com raio " + raio + " é: " + area);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    

    
}
