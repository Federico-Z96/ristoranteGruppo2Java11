package src.entities;

import src.entities.enumeration.TypeAllergensEnum;

import static src.entities.enumeration.ColorEnum.*;

/**
 La classe Meal rappresenta un pasto generico presente in un menu di un ristorante.
 Contiene informazioni sul nome del pasto, il suo prezzo e eventuali allergeni presenti.
 Questa classe viene utilizzata come classe padre da cui ereditano tutte le altre classi che rappresentano pasti specifici.
 */
public abstract class Meal {
    private String name;
    private double price;
    private TypeAllergensEnum allergens;

    /**
     *@param name il nome del pasto
     *@param price il prezzo del pasto
     *@param allergens gli allergeni presenti nel pasto
     */

    public Meal(String name, double price, TypeAllergensEnum allergens) {
        this.name = name;
        this.price = price;
        this.allergens = allergens;
    }

    /**
     Restituisce il nome del pasto.
     *@return il nome del pasto
     */
    public String getName() {
        return name;
    }
    /**
     Imposta il nome del pasto.
     *@param name il nome del pasto
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     Restituisce il prezzo del pasto.
     *@return il prezzo del pasto
     */
    public double getPrice() {
        return price;
    }

    /**
     Imposta il prezzo del pasto.
     *@param price il prezzo del pasto
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     Stampa le informazioni del pasto, tra cui nome e prezzo, e se presente gli allergeni.
     */
    public void printInfo(){
        System.out.println( ANSI_WHITE_BACKGROUND.getCode() + this.getName() + " : " + this.getPrice()+ "€" + ANSI_RESET.getCode());
        if (allergens != TypeAllergensEnum.NONE) {
            System.out.println(ANSI_RED_BACKGROUND.getCode() +"ATTENZIONE: Questo piatto contiene " + allergens + ANSI_RESET.getCode());
        }else {
            System.out.println(ANSI_WHITE_BACKGROUND.getCode() + "Questo piatto non contiene allergeni" + ANSI_RESET.getCode());
        }
    };
}