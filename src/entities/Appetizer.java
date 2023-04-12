package src.entities;

public class Appetizer extends Portata {

    //TODO personalizziamo le classi, è congelato?ha glutine?
    //non conviene implementarle in portata?
    //creare enum ingredienti implementando itsglutenfree e itsfrozen? Si okey va bene, lista di string?

    //TODO facciamo un enumerato degli allergeni
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
        //TODO bisogna stampare anche i campi aggiuntivi
    }



}


