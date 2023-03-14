package src.entities;

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

    //TODO inserire sempre il modificatore d'accesso
   public void  printinfo(){
        System.out.println(this.type + this.name + this.price+"$");
    }
}
