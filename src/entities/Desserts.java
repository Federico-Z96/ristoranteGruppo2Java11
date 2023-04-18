package src.entities;

public class Desserts extends Portata {
    public Desserts(String name, double price, boolean itsFrozen, Allergens allergens) {
        super(name, price, itsFrozen, allergens);
    }

    public Desserts(String name, double price, boolean itsFrozen) {
        super(name, price, itsFrozen);
    }

    public Desserts(String name, double price, Allergens allergens) {
        super(name, price, allergens);
    }

    public Desserts(String name, double price) {
        super(name, price);
    }


    //TODO inseriamo qualcosa per indicare la grandezza del dolce, livello zuccheri, descrizione?



    @Override
    public void printInfo() {
        super.printInfo();
    }
}
