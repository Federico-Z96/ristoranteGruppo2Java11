package src.entities;

public class Appetizer extends Portata {

    public Appetizer(String name, double price) {
        super(name, price);
    }

    @Override
    public void printInfo() {
        System.out.println( this.getName() + this.getPrice() +"$");
    }


}


