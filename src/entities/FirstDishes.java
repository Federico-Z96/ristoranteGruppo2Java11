package src.entities;

public class FirstDishes extends Portata {

    private boolean itsFrozen;


    //TODO inseriamo parametrizzazioni ad esempio, èprecotto

    public FirstDishes(String name, double price, boolean itsFrozen,AllergensEnum allergens) {
        super(name, price, allergens);
        this.itsFrozen = itsFrozen;
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }
}
