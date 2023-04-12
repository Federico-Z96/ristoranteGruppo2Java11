package src.entities;

public class Appetizer extends Portata {

    //TODO personalizziamo le classi, è congelato?ha glutine?
    //non conviene implementarle in portata?
    //creare enum ingredienti implementando itsglutenfree e itsfrozen?

    private boolean itsFrozen;
    private boolean itsGlutenFree;
    private boolean itsLactoseFree;

    public Appetizer(String name, double price) {
        super(name, price);
    }
    public Appetizer(String name, double price, boolean itsFrozen, boolean itsGlutenFree, boolean itsLactoseFree) {
        super(name, price);
        this.itsFrozen = itsFrozen;
        this.itsGlutenFree = itsGlutenFree;
        this.itsLactoseFree = itsLactoseFree;
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }



}


