package src.entities;


//TODO fare una super classe Portata per tutte le altre classi
public class Beverage extends Portata {
    private Type type;



    public Beverage(String name, Type type, double price) {
        super(name, price);
        this.type = type;
    }

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
    }
}
