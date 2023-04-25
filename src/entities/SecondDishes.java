package src.entities;

public class SecondDishes extends Meal {
    private boolean itsFrozen;

    public SecondDishes(String name, double price, boolean itsFrozen, TypeAllergensEnum allergens) {
        super(name, price,allergens);
        this.itsFrozen = itsFrozen;

    }
    @Override
    public void printInfo() {
       super.printInfo();
    }
}

