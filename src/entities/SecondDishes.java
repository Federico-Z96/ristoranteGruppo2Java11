package src.entities;

import src.entities.enumeration.TypeAllergensEnum;

public class SecondDishes extends Meal {
    private boolean itsFrozen;

    private boolean sauce;

    public SecondDishes(String name, double price, boolean itsFrozen, boolean sauce, TypeAllergensEnum allergens) {
        super(name, price,allergens);
        this.itsFrozen = itsFrozen;

    }
    @Override
    public void printInfo() {
       super.printInfo();
    }
}

