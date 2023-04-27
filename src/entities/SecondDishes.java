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

