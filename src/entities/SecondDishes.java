package src.entities;

public class SecondDishes extends Portata {
    private boolean itsFrozen;

    public SecondDishes(String name, double price, boolean itsFrozen,AllergensEnum allergens) {
        super(name, price,allergens);
        this.itsFrozen = itsFrozen;

    }

    //TODO sistamare tutte le classi
    @Override
    public void printInfo() {
       super.printInfo();
    }
}

