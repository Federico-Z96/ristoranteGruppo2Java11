package src.entities;

public class Beverage extends Portata {
    private TypeBeverage type;

    public Beverage(String name, double price, TypeAllergensEnum allergens, TypeBeverage type) {
        super(name, price, allergens);
        this.type = type;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.print(type.getName() + " : " + type.getDescription()+"\n");
    }
}
