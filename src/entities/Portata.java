package src.entities;

public abstract class Portata {
    private String name;
    private double price;
    private AllergensEnum allergens;

    public Portata(String name, double price, AllergensEnum allergens) {
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
        System.out.println( this.getName() + " : " + this.getPrice()+"$");
        if (allergens != null) {
            System.out.println("ATTENTION: This plate contains " + allergens);
        }
    };

}
