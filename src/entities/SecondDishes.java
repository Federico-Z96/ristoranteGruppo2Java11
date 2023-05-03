package src.entities;

import src.entities.enumeration.ColorEnum;
import src.entities.enumeration.TypeAllergensEnum;

public class SecondDishes extends Meal {
    private boolean itsFrozen;

    private boolean sauce;

    public SecondDishes(String name, double price, boolean itsFrozen, boolean sauce, TypeAllergensEnum allergens) {
        super(name, price,allergens);
        this.itsFrozen = itsFrozen;
        this.sauce = sauce;
    }
    /* Costruttore legato alla classe principale Meal
name --> nome piatto
price --> prezzo piatto
allergens --> allergeni presenti

itsFrozen --> attributo di classe per sapere se il cibo è surgelato
sauce --> attributo di classe per sapere se il cibo contiene qualche salsa specifica

Printinfo --> permette di stampare il piatto */
    @Override
    public void printInfo() {
       super.printInfo();
        if (this.itsFrozen){
            System.out.println(ColorEnum.ANSI_YELLOW.getCode() + "This dish it's frozen" + ColorEnum.ANSI_RESET.getCode());
        }else{
            System.out.println((ColorEnum.ANSI_YELLOW.getCode() + "This dish is fresh" + ColorEnum.ANSI_RESET.getCode()));
        }
        if (this.sauce){
            System.out.println(ColorEnum.ANSI_YELLOW.getCode() + "This dish have sauce" + ColorEnum.ANSI_RESET.getCode());
        }else{
            System.out.println(ColorEnum.ANSI_YELLOW.getCode() + "This dish haven't sauce" + ColorEnum.ANSI_RESET.getCode());
        }
    }
}

