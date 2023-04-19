package src.entities;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Appetizer> appetizerList;

    private List<Portata> portataList;


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

    public List<Portata> getPortataList() {
        return portataList;
    }

    public void addPortata(Portata portata) {
        portataList.add(portata);
    }

    public void removePortata(Portata portata) {
        portataList.remove(portata);
    }

    public void findMediumPrice() {
        double totalPrice = 0;
        int itemCount = 0;
        for (Portata portata : portataList) {
            totalPrice += portata.getPrice();
            itemCount++;
        }
        this.mediumPrice = Math.round(totalPrice / itemCount * 100.0) / 100.0;
    }

    public void printMenu() {
        System.out.println("Menu: " + this.name);
        System.out.println("Type: " + this.type);
        System.out.println("Description: " + type.getDescription());
        System.out.println("Created by: " + this.chefName);
        System.out.println("The medium price is: " + this.mediumPrice + " $");
        System.out.println("\nPortate");

        //TODO sistemare
        for (Portata menu : portataList) {
            menu.printInfo();

            for (Portata portata : portataList) {
                portata.printInfo();
                System.out.println();
            }
        }
    }
}
