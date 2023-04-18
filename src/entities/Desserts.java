package src.entities;

public class Desserts extends Portata {

    private TypeDessert dessertsType;

    public Desserts(String name, double price, Allergens allergens, TypeDessert dessertsType) {
        super(name, price, allergens);
        this.dessertsType=dessertsType;
    }

    public Desserts(String name, double price,TypeDessert dessertsType) {
        super(name, price);
        this.dessertsType = dessertsType;
    }

    public TypeDessert getDessertsType() {
        return dessertsType;
    }

    public void setDessertsType(TypeDessert dessertsType) {
        this.dessertsType = dessertsType;
    }

    //TODO inseriamo qualcosa per indicare la grandezza del dolce, livello zuccheri, descrizione?

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(dessertsType.getDescription());
    }
}
