package src.entities;

public class SecondDishes extends Portata {


    public SecondDishes(String name, double price) {
        super(name, price);
    }

    @Override
    public void printInfo() {
        System.out.println( this.getName() + this.getPrice()+"$");
    }
}

