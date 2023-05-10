package src.entities;

import src.entities.enumeration.TypeAllergensEnum;
import src.entities.enumeration.TypeBeverageEnum;

import static src.entities.enumeration.ColorEnum.ANSI_PURPLE;

/**
 * Questa classe rappresenta una bevanda, che estende la classe Meal.
 * @see Meal
 */
public class Beverage extends Meal {

    private TypeBeverageEnum type;

    /**
     * Costruttore per la classe Beverage.
     * @param name il nome della bevanda
     * @param price il prezzo della bevanda
     * @param allergens gli allergeni presenti nella bevanda
     * @param type il tipo di bevanda
     */
    public Beverage(String name, double price, TypeAllergensEnum allergens, TypeBeverageEnum type) {
        super(name, price, allergens);
        this.type = type;
    }

    /**
     * Stampa le informazioni sulla bevanda, incluso il tipo di bevanda.
     */
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.print(ANSI_PURPLE.getCode() + type.getName() + " : " + type.getDescription() + "\n");
    }

}
