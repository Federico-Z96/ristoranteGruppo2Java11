package src.entities;

import static src.entities.Color.*;

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
        System.out.println( ANSI_WHITE_BACKGROUND + this.getName() + " : " + this.getPrice()+ "€" + ANSI_RESET);
        if (allergens != TypeAllergensEnum.NONE) {
            System.out.println(ANSI_RED_BACKGROUND +"ATTENTION: This plate contains " + allergens + ANSI_RESET);
        }else {
            System.out.println(ANSI_WHITE_BACKGROUND + "This plate it's allergens free" + ANSI_RESET);
        }
    };

}
