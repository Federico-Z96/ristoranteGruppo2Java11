package src.entities;

import src.entities.enumeration.ColorEnum;
import src.entities.enumeration.TypeAllergensEnum;

public class Appetizer extends Meal {
    private boolean itsFrozen;

    public Appetizer(String name, double price, TypeAllergensEnum allergens, boolean itsFrozen) {
        super(name, price, allergens);
        this.itsFrozen = itsFrozen;
    }
    /* Costruttore legato alla classe principale Meal
    name --> nome piatto
    price --> prezzo piatto
    allergens --> allergeni presenti

    itFrozen --> attributo di classe per sapere se il cibo è surgelato
    Printinfo --> permette di stampare il piatto */
    @Override
    public void printInfo() {
        super.printInfo();
        if (this.itsFrozen){
            System.out.println(ColorEnum.ANSI_YELLOW.getCode()+"This dish it's frozen"+ColorEnum.ANSI_RESET.getCode());
        }else{
            System.out.println((ColorEnum.ANSI_YELLOW.getCode()+"This dish is fresh"+ColorEnum.ANSI_RESET.getCode()));
        }
    }



}


