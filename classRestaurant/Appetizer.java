package classRestaurant;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Appetizer {
    private String name;
    private double price;


    public Appetizer(String name, double price) {
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

    public void setPrice(int price) {
        this.price = price;
    }

    void printinfo() {
        System.out.println(this.name + this.price +"$");
    }
}


