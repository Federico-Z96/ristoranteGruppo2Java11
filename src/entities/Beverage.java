package src.entities;

public class Beverage extends Portata {
    private TypeBeverage type;

    public Beverage(String name, double price, boolean itsFrozen, Allergens allergens, TypeBeverage type) {
        super(name, price, itsFrozen, allergens);
        this.type = type;
    }

    public Beverage(String name, double price, boolean itsFrozen, TypeBeverage type) {
        super(name, price, itsFrozen);
        this.type = type;
    }

    public Beverage(String name, double price, TypeBeverage type,Allergens allergens) {
        super(name, price, allergens);
        this.type = type;
    }

    public Beverage(String name, double price, TypeBeverage type) {
        super(name, price);
        this.type = type;
    }
    public TypeBeverage getType() {
        return type;
    }

    public void setType(TypeBeverage type) {
        this.type = type;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.print(type.getName() + " : " + type.getDescription()+"\n");
    }
}
