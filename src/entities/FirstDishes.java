package src.entities;

public class FirstDishes extends Portata {

    public FirstDishes(String name, double price) {
        super(name, price);
    }

    @Override
    public void printInfo() {
        System.out.println( this.getName() + this.getPrice()+"$");
    }
}
