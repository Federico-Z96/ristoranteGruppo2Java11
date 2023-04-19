package src.entities;

public class FirstDishes extends Portata {

    //TODO inseriamo parametrizzazioni ad esempio, èprecotto

    public FirstDishes(String name, double price, boolean itsFrozen, Allergens allergens) {
        super(name, price, itsFrozen, allergens);
    }

    public FirstDishes(String name, double price, boolean itsFrozen) {
        super(name, price, itsFrozen);
    }

    public FirstDishes(String name, double price, Allergens allergens) {
        super(name, price, allergens);
    }

    public FirstDishes(String name, double price) {
        super(name, price);
    }


    @Override
    public void printInfo() {
        super.printInfo();
    }
}
