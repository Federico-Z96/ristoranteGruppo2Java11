package src.entities;

import src.entities.enumeration.TypeAllergensEnum;

public class FirstDishes extends Meal {

    private boolean itsFrozen;
    private boolean itsPrecoocked;


    //TODO inseriamo parametrizzazioni ad esempio, èprecotto

    public FirstDishes(String name, double price, boolean itsFrozen, boolean itsPrecoocked, TypeAllergensEnum allergens) {
        super(name, price, allergens);
        this.itsFrozen = itsFrozen;
    }

    //TODO potete anche fare un metodo che prende un colore in input
    @Override
    public void printInfo() {
        super.printInfo();
    }
}
