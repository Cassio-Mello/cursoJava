package entities;

public class CurrencyConverter {
    private double dollarPrice;
    private double buyDollar;
    private final double IOF = 0.06;

    public CurrencyConverter(double dollarPrice, double buyDollar){
        this.dollarPrice = dollarPrice;
        this.buyDollar = buyDollar;

    }

    private double conversorDollarReal(){
        return dollarPrice * buyDollar;
    }

    private double calculatorIOF(){
        return (conversorDollarReal() * IOF); 
    }

    public String toString(){
        double totalComIOF = conversorDollarReal() + calculatorIOF();
        return "Amount to be paid in reais = "
               + String.format("%.2f", totalComIOF);
        }

    public double getDollarPrice() {
        return dollarPrice;
    }

    public void setDollarPrice(double dollarPrice) {
        this.dollarPrice = dollarPrice;
    }

    public double getBuyDollar() {
        return buyDollar;
    }

    public void setBuyDollar(double buyDollar) {
        this.buyDollar = buyDollar;
    }

    public double getIOF() {
        return IOF;
    }

        
    
}
