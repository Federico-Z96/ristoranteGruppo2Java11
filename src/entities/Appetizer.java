package src.entities;

public class Appetizer extends Portata {


    public Appetizer(String name, double price, boolean itsFrozen, Allergens allergens) {
        super(name, price, itsFrozen, allergens);
    }

    public Appetizer(String name, double price, boolean itsFrozen) {
        super(name, price, itsFrozen);
    }

    public Appetizer(String name, double price, Allergens allergens) {
        super(name, price, allergens);
    }

    public Appetizer(String name, double price) {
        super(name, price);
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }



}


