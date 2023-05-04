package src.entities;

import src.entities.enumeration.ColorEnum;
import src.entities.enumeration.TypeAllergensEnum;

/**
 * Questa classe rappresenta un antipasto, che estende la classe Meal.
 */
public class Appetizer extends Meal {

    private boolean itsFrozen;

    /**
     * Costruttore per la classe Appetizer.
     * @param name il nome del piatto
     * @param price il prezzo del piatto
     * @param allergens gli allergeni presenti nel piatto
     * @param itsFrozen true se il piatto è surgelato, false altrimenti
     */
    public Appetizer(String name, double price, TypeAllergensEnum allergens, boolean itsFrozen) {
        super(name, price, allergens);
        this.itsFrozen = itsFrozen;
    }

    /**
     * Stampa le informazioni sull'antipasto, incluso se è surgelato o fresco.
     */
    @Override
    public void printInfo() {
        super.printInfo();
        if (this.itsFrozen){
            System.out.println(ColorEnum.ANSI_YELLOW.getCode() + "This dish it's frozen" + ColorEnum.ANSI_RESET.getCode());
        } else {
            System.out.println(ColorEnum.ANSI_YELLOW.getCode() + "This dish is fresh" + ColorEnum.ANSI_RESET.getCode());
        }
    }

}

