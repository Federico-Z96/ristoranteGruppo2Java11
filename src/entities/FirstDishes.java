package src.entities;
import src.entities.enumeration.ColorEnum;
import src.entities.enumeration.TypeAllergensEnum;

/**
 La classe FirstDishes rappresenta un piatto di primo.
 Estende la classe Meal e aggiunge gli attributi itsFrozen e itsPrecoocked per indicare se il cibo è surgelato o precotto.
 @see Meal
 */

public class FirstDishes extends Meal {

    private boolean itsFrozen;
    private boolean itsPrecoocked;

    /**
     *@param name il nome del piatto
     *@param price il prezzo del piatto
     *@param itsFrozen indica se il piatto è surgelato
     *@param itsPrecoocked indica se il piatto è precotto
     *@param allergens gli allergeni presenti nel piatto
     */

    public FirstDishes(String name, double price, boolean itsFrozen, boolean itsPrecoocked, TypeAllergensEnum allergens) {
        super(name, price, allergens);
        this.itsFrozen = itsFrozen;
        this.itsPrecoocked = itsPrecoocked;
    }

    /**
     Stampa le informazioni relative al piatto di primo.
     In caso il piatto sia surgelato o precotto, verrà aggiunto un messaggio di avviso.
     */
    @Override
    public void printInfo() {
        super.printInfo();
        if (this.itsFrozen){
            System.out.println(ColorEnum.ANSI_YELLOW.getCode() + "Questo piatto è surgelato" + ColorEnum.ANSI_RESET.getCode());
        }else{
            System.out.println((ColorEnum.ANSI_YELLOW.getCode() + "Questo piatto è fresco" + ColorEnum.ANSI_RESET.getCode()));
        }
        if (this.itsPrecoocked){
            System.out.println(ColorEnum.ANSI_YELLOW.getCode() + "Questo piatto è precotto" + ColorEnum.ANSI_RESET.getCode());
        }else{
            System.out.println((ColorEnum.ANSI_YELLOW.getCode() + "Questo piatto è cucinato al momento" + ColorEnum.ANSI_RESET.getCode()));
        }
    }
}