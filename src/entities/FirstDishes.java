package src.entities;

public class FirstDishes extends Portata {


    public FirstDishes(String name, double price, boolean itsFrozen, Allergens allergens) {
        super(name, price, itsFrozen, allergens);
    }

    public FirstDishes(String name, double price, boolean itsFrozen) {
        super(name, price, itsFrozen);
    }

    public FirstDishes(String name, double price, Allergens allergens) {
        super(name, price, allergens);
    }

    public FirstDishes(String name, double price) {
        super(name, price);
    }

    //TODO e se devo cambiare la stampa mi devo fare il giro di tutte le classi?
    // e se abbiamo 300 classi? quindi non sarebbe meglio sfruttare l'ereditarietà?
    @Override
    public void printInfo() {
        super.printInfo();
    }
}
