package src.entities;


//TODO fare una super classe Portata per tutte le altre classi
public class Beverage extends Portata {
    private String type;



    public Beverage(String name, String type, double price) {
        super(name, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void printInfo() {
        System.out.println( this.getName() + this.getPrice()+"$");
    }
}
