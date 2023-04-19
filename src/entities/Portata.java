package src.entities;

public abstract class Portata {
    private String name;
    private double price;
    private TypeAllergensEnum allergens;

    public Portata(String name, double price, TypeAllergensEnum allergens) {
        this.name = name;
        this.price = price;
        this.allergens = allergens;
    }


    //TODO eliminiamo tutti i costruttori

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


    public void printInfo(){
        System.out.println( this.getName() + " : " + this.getPrice()+"€");
        if (allergens != TypeAllergensEnum.NONE) {
            System.out.println("ATTENTION: This plate contains " + allergens);
        }else {
            System.out.println("This plate it's allergens free");
        }
    };

}
