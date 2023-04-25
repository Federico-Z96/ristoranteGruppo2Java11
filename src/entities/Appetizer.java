package src.entities;

public class Appetizer extends Meal {
    private boolean itsFrozen;

    public Appetizer(String name, double price, TypeAllergensEnum allergens, boolean itsFrozen) {
        super(name, price, allergens);
        this.itsFrozen = itsFrozen;
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }



}


