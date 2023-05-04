package src.entities;

import src.entities.enumeration.ColorEnum;
import src.entities.enumeration.TypeAllergensEnum;

/**
 La classe SecondDishes rappresenta un piatto di secondo, che estende la classe Meal.
 * @see Meal
 */
public class SecondDishes extends Meal {
    private boolean itsFrozen;
    private boolean sauce;

    /**
     *@param name il nome del piatto.
     *@param price il prezzo del piatto.
     *@param itsFrozen un booleano che indica se il piatto è surgelato o fresco.
     *@param sauce un booleano che indica se il piatto ha una salsa specifica o meno.
     *@param allergens un oggetto della classe TypeAllergensEnum che rappresenta gli allergeni presenti nel piatto.
     */
    public SecondDishes(String name, double price, boolean itsFrozen, boolean sauce, TypeAllergensEnum allergens) {
        super(name, price,allergens);
        this.itsFrozen = itsFrozen;
        this.sauce = sauce;
    }

    /**
     Questo metodo stampa le informazioni relative al piatto di secondo, inclusi il fatto se è fresco o surgelato
     e se ha una salsa specifica o meno.
     */
    @Override
    public void printInfo() {
        super.printInfo();
        if (this.itsFrozen){
            System.out.println(ColorEnum.ANSI_YELLOW.getCode() + "Questo piatto è surgelato" + ColorEnum.ANSI_RESET.getCode());
        }else{
            System.out.println((ColorEnum.ANSI_YELLOW.getCode() + "Questo piatto è fresco" + ColorEnum.ANSI_RESET.getCode()));
        }
        if (this.sauce){
            System.out.println(ColorEnum.ANSI_YELLOW.getCode() + "Questo piatto ha una salsa specifica" + ColorEnum.ANSI_RESET.getCode());
        }else{
            System.out.println(ColorEnum.ANSI_YELLOW.getCode() + "Questo piatto non ha una salsa specifica" + ColorEnum.ANSI_RESET.getCode());
        }
    }
}
