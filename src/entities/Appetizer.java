package src.entities;

public class Appetizer extends Portata {
    private boolean itsFrozen;
    private AllergensEnum allergens;

    public Appetizer(String name, double price) {
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


