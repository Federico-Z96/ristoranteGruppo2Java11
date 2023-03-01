package classRestaurant;

public class Desserts {

    private String name;
    private double price;

    public Desserts(String name,double price) {
        this.name = name;
        this.price = price;
        System.out.println(name + price);
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
}
