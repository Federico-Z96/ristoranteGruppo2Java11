package src.entities;

public abstract class Portata {
    private String name;
    private double price;

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

    //TODO come facciamo a stampare name e price?
    public void printInfo(){
        System.out.println( this.getName() + this.getPrice()+"$");
    };

}