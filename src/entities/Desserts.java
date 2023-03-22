package src.entities;

public class Desserts extends Portata {


    public Desserts(String name, double price) {
        super(name, price);
    }

    @Override
    public void printInfo() {
        System.out.println( this.getName() + this.getPrice()+"$");
    }
}
