package src.entities;


//TODO fare una super classe Portata per tutte le altre classi
public class Beverage extends Portata {
    private Type type;

    public Beverage(String name, double price, boolean itsFrozen, Allergens allergens, Type type) {
        super(name, price, itsFrozen, allergens);
        this.type = type;
    }

    public Beverage(String name, double price, boolean itsFrozen, Type type) {
        super(name, price, itsFrozen);
        this.type = type;
    }

    public Beverage(String name, double price, Allergens allergens, Type type) {
        super(name, price, allergens);
        this.type = type;
    }

    public Beverage(String name, double price, Type type) {
        super(name, price);
        this.type = type;
    }

    //TODO beerType


    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    //TODO non stampa il tipo che è il field del figlio aggiuntivo
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(type.getName() + " : " + type.getDescription());
    }
}
