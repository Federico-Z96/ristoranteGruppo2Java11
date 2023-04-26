package src.entities;

import src.entities.enumeration.TypeAllergensEnum;

public class Appetizer extends Meal {
    private boolean itsFrozen;

    public Appetizer(String name, double price, TypeAllergensEnum allergens, boolean itsFrozen) {
        super(name, price, allergens);
        this.itsFrozen = itsFrozen;
    }


    //TODO i field aggiuntivi ?
    @Override
    public void printInfo() {
        super.printInfo();
    }



}


