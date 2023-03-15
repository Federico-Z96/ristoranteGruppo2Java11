package src.entities;


//TODO fare una super classe Portata per tutte le altre classi
public class Beverage {
    private String name;
    private double price;
    private String type;

    public Beverage(String type,String name,double price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

   public void  printinfo(){
        System.out.println(this.type + this.name + this.price+"$");
    }
}
