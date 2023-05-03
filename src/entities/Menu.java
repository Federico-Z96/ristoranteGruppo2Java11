package src.entities;

import src.entities.enumeration.ColorEnum;
import src.entities.enumeration.TypeMenu;

import java.util.ArrayList;
import java.util.List;

import static src.entities.enumeration.ColorEnum.*;

public class Menu {
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
    /*la classe menù contiene un costruttore dove è presente
    il nome,
    la tipologia di menù
    il nome dello chef
    ed infine una lista dove dove sono presenti le portate*/
    public Menu(){

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
/*finmediuprice serve per poter calcolare il prezzio medio per tutti i piatti legati allle relative portate*/
    public void findMediumPrice() {
        double totalPrice = 0;
        int itemCount = 0;
        for (Meal portata : portataList) {
            totalPrice += portata.getPrice();
            itemCount++;
        }
        this.mediumPrice = Math.round(totalPrice / itemCount * 100.0) / 100.0;
    }
   /*  Printinfo --> permette di stampare la lista di portate con i realtivi dati e colori di background */
    public void printMenu() {
        System.out.println(ANSI_CYAN_BACKGROUND.getCode()+ANSI_BLACK.getCode() +"Type: " + this.type);
        System.out.println("Description: " + type.getDescription());
        System.out.println("Created by: " + this.chefName);
        System.out.println("The medium price is: " + this.mediumPrice + " €" + "\n"+ ANSI_RESET.getCode() );
        System.out.println(ANSI_PURPLE_BACKGROUND.getCode() + ANSI_BLACK.getCode() + "Portate" + "\n" + ANSI_RESET.getCode() );
        for (Meal meal : portataList) {
            meal.printInfo();
            System.out.println("");
        }
        System.out.println("\n" + ANSI_CYAN_BACKGROUND.getCode()+ANSI_BLACK.getCode() + "END");
        System.out.println("For every particular request you can ask it to our waiters"+ "\n" +ANSI_RESET.getCode());
    }
}
