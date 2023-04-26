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
