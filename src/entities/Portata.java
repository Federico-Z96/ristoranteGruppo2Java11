package src.entities;

public abstract class Portata {
    private String name;
    private double price;
    private boolean itsFrozen;
    private Allergens allergens;

    public Portata(String name, double price , boolean itsFrozen, Allergens allergens) {
        this.name = name;
        this.price = price;
        this.itsFrozen = itsFrozen;
        this.allergens = allergens;
    }
    public Portata(String name, double price , boolean itsFrozen) {
        this.name = name;
        this.price = price;
        this.itsFrozen = itsFrozen;
    }
    public Portata(String name, double price, Allergens allergens) {
        this.name = name;
        this.price = price;
        this.allergens = allergens;
    }
    public Portata(String name, double price) {
        this.name = name;
        this.price = price;
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

    public boolean isItsFrozen() {
        return itsFrozen;
    }

    public void setItsFrozen(boolean itsFrozen) {
        this.itsFrozen = itsFrozen;
    }

    public Allergens getAllergens() {
        return allergens;
    }

    public void setAllergens(Allergens allergens) {
        this.allergens = allergens;
    }

    public void printInfo(){
        System.out.println( this.getName() + " : " + this.getPrice()+"$");
    };

}
