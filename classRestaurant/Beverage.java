package classRestaurant;

import java.util.ArrayList;
import java.util.List;

public class Beverage {
    private String name;
    private double price;
    private String type;




    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public Beverage(String type,String name,double price) {
        this.type = type;
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
}
