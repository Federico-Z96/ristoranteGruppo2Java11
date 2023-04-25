package src.entities;

import java.util.ArrayList;
import java.util.List;

import static src.entities.Color.*;

public class Menu {

    private List<Appetizer> appetizerList;
    private List<Meal> portataList;
    private String name;
    private TypeMenu type;
    private double mediumPrice;
    private String chefName;

    public Menu(String name, TypeMenu type, String chefName) {
        this.name = name;
        this.type = type;
        this.chefName = chefName;
        this.portataList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeMenu getType() {
        return type;
    }

    public void setType(TypeMenu type) {
        this.type = type;
    }

    public double getMediumPrice() {
        return mediumPrice;
    }

    public void setMediumPrice(double mediumPrice) {
        this.mediumPrice = mediumPrice;
    }

    public String getChefName() {
        return chefName;
    }

    public void setChefName(String chefName) {
        this.chefName = chefName;
    }

    public List<Meal> getPortataList() {
        return portataList;
    }

    public void addPortata(Meal portata) {
        portataList.add(portata);
    }

    public void removePortata(Meal portata) {
        portataList.remove(portata);
    }

    public void findMediumPrice() {
        double totalPrice = 0;
        int itemCount = 0;
        for (Meal portata : portataList) {
            totalPrice += portata.getPrice();
            itemCount++;
        }
        this.mediumPrice = Math.round(totalPrice / itemCount * 100.0) / 100.0;
    }

    public void printMenu() {
        System.out.println(ANSI_CYAN_BACKGROUND +"Type: " + this.type);
        System.out.println("Description: " + type.getDescription());
        System.out.println("Created by: " + this.chefName);
        System.out.println("The medium price is: " + this.mediumPrice + " €" + "\n"+ ANSI_RESET );
        System.out.println(ANSI_PURPLE_BACKGROUND + ANSI_BLACK + "Portate" + "\n" + ANSI_RESET );
        for (Meal menu : portataList) {
            menu.printInfo();
            System.out.println("");
        }
        System.out.println("\n" + ANSI_CYAN_BACKGROUND + "END");
        System.out.println("For every particular request you can ask it to our waiters"+ "\n" +ANSI_RESET);
    }
}
