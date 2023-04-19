package src.entities;

public class FirstDishes extends Portata {
    private boolean itsFrozen;
    private AllergensEnum allergens;

    public FirstDishes(String name, double price) {
        super(name, price);
        this.itsFrozen = itsFrozen;
        this.allergens = allergens;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        if (allergens != null) {
            System.out.println("ATTENTION: This plate contains " + allergens);
        }
    }
}
