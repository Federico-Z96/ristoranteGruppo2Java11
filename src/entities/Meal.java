package src.entities;

import src.entities.enumeration.TypeAllergensEnum;

import static src.entities.enumeration.ColorEnum.*;

public abstract class Meal {
    private String name;
    private double price;
    private TypeAllergensEnum allergens;

    public Meal(String name, double price, TypeAllergensEnum allergens) {
        this.name = name;
        this.price = price;
        this.allergens = allergens;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void printInfo(){
        System.out.println( ANSI_WHITE_BACKGROUND.getCode() + this.getName() + " : " + this.getPrice()+ "€" + ANSI_RESET.getCode());
        if (allergens != TypeAllergensEnum.NONE) {
            System.out.println(ANSI_RED_BACKGROUND.getCode() +"ATTENTION: This plate contains " + allergens + ANSI_RESET.getCode());
        }else {
            System.out.println(ANSI_WHITE_BACKGROUND.getCode() + "This plate it's allergens free" + ANSI_RESET.getCode());
        }
    };

}
