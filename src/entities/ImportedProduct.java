package entities;

public class ImportedProduct extends Product {
    private double customsFee = super.getPrice() * 0.1;


    public  ImportedProduct(String name, double price) {
        super(name, price);
        this.customsFee = customsFee;
    }


    @Override
    public String priceTag(){
        double price = getPrice() +  customsFee;
        String classificacao = "**importado**";
        return getName() + " R$" +  price + " " + classificacao;
    }



}
