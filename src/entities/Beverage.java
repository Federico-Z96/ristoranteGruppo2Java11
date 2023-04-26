package src.entities;

import src.entities.enumeration.TypeAllergensEnum;
import src.entities.enumeration.TypeBeverage;

import static src.entities.enumeration.ColorEnum.ANSI_PURPLE;

public class Beverage extends Meal {
    private TypeBeverage type;

    public Beverage(String name, double price, TypeAllergensEnum allergens, TypeBeverage type) {
        super(name, price, allergens);
        this.type = type;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.print(ANSI_PURPLE.getCode() + type.getName() + " : " + type.getDescription()+"\n");
    }
}
