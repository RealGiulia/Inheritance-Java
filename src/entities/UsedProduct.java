package entities;


import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date manufactureDate;
    private double discount;

    public UsedProduct(String name, double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
        this.discount = super.getPrice() * 0.15;
    }




    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }


    @Override
    public String priceTag(){
        double price = getPrice() - discount;
        return  "Name: " + getName() +
                " " +" Price: R$" + price +
                " Manufacture date :"+ sdf.format(manufactureDate);

    }
}
