package src.entities;

public class SecondDishes extends Portata {


    public SecondDishes(String name, double price, boolean itsFrozen, Allergens allergens) {
        super(name, price, itsFrozen, allergens);
    }

    public SecondDishes(String name, double price, boolean itsFrozen) {
        super(name, price, itsFrozen);
    }

    public SecondDishes(String name, double price, Allergens allergens) {
        super(name, price, allergens);
    }

    public SecondDishes(String name, double price) {
        super(name, price);
    }

    //TODO sistamare tutte le classi
    @Override
    public void printInfo() {
       super.printInfo();
    }
}

