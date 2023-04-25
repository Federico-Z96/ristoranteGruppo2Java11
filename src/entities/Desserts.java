package src.entities;

public class Desserts extends Meal {

    private TypeDessert dessertsType;

    public Desserts(String name, double price, TypeAllergensEnum allergens, TypeDessert dessertsType) {
        super(name, price, allergens);
        this.dessertsType=dessertsType;
    }

    public TypeDessert getDessertsType() {
        return dessertsType;
    }

    public void setDessertsType(TypeDessert dessertsType) {
        this.dessertsType = dessertsType;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(dessertsType.getDescription());
    }
}
