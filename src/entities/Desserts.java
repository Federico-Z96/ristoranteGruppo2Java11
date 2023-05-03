package src.entities;

import src.entities.enumeration.TypeAllergensEnum;
import src.entities.enumeration.TypeDessert;

import static src.entities.enumeration.ColorEnum.ANSI_RESET;
import static src.entities.enumeration.ColorEnum.ANSI_YELLOW;

public class Desserts extends Meal {

    private TypeDessert dessertsType;

    public Desserts(String name, double price, TypeAllergensEnum allergens, TypeDessert dessertsType) {
        super(name, price, allergens);
        this.dessertsType=dessertsType;
    }
    /* Costruttore legato alla classe principale Meal
      name --> nome piatto
      price --> prezzo piatto
      allergens --> allergeni presenti

      dessertsType --> atttributo di classe legato all enum TypeDessert per selezionare la tipologi adi dessert

      Printinfo --> permette di stampare il piatto con l'aggiunta di sfondi colorati */
    public TypeDessert getDessertsType() {
        return dessertsType;
    }

    public void setDessertsType(TypeDessert dessertsType) {
        this.dessertsType = dessertsType;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(ANSI_YELLOW.getCode() + dessertsType.getDescription() + ANSI_RESET.getCode());
    }
}
