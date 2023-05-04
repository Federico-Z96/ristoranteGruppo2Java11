package src.entities;

import src.entities.enumeration.TypeAllergensEnum;
import src.entities.enumeration.TypeDessert;

import static src.entities.enumeration.ColorEnum.ANSI_RESET;
import static src.entities.enumeration.ColorEnum.ANSI_YELLOW;

/**
 La classe Desserts estende la classe Meal e definisce un piatto di tipo dolce.
 * @see Meal
 */
public class Desserts extends Meal {

    private TypeDessert dessertsType;

    /**
     Costruisce un oggetto Desserts.
     *@param name il nome del piatto
     *@param price il prezzo del piatto
     *@param allergens gli allergeni presenti nel piatto
     *@param dessertsType la tipologia di dolce
     */
    public Desserts(String name, double price, TypeAllergensEnum allergens, TypeDessert dessertsType) {
        super(name, price, allergens);
        this.dessertsType=dessertsType;
    }

    /**
     Restituisce la tipologia di dolce del piatto.
     *@return la tipologia di dolce del piatto
     */
    public TypeDessert getDessertsType() {
        return dessertsType;
    }

    /**
     Imposta la tipologia di dolce del piatto.
     *@param dessertsType la tipologia di dolce del piatto
     */
    public void setDessertsType(TypeDessert dessertsType) {
        this.dessertsType = dessertsType;
    }

    /**
     Stampa le informazioni del piatto, incluso il nome, il prezzo e la tipologia di dolce.
     */
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(ANSI_YELLOW.getCode() + dessertsType.getDescription() + ANSI_RESET.getCode());
    }
}