package src.entities;

public class SecondDishes extends Portata {
    private boolean itsFrozen;
    private AllergensEnum allergens;

    public SecondDishes(String name, double price) {
        super(name, price);
        this.itsFrozen = itsFrozen;
        this.allergens = allergens;
    }

    //TODO sistamare tutte le classi
    @Override
    public void printInfo() {
       super.printInfo();
        if (allergens != null) {
            System.out.println("ATTENTION: This plate contains " + allergens);
        }
    }
}

