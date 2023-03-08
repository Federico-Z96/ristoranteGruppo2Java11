package src.entities;

public class SecondDishes {

    private String name;
    private double price;



    public  SecondDishes(String name, double price){
        this.name = name;
        this.price = price;



    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    void  printinfo(){
        System.out.println( this.name + this.price+"$");
    }
}

