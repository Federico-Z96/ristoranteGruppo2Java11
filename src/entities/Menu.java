package src.entities;

import java.util.List;

public class Menu {
    private List<Appetizer> appetizerList;

    private List<Portata> portataList;


    private String name;
    private String type;
    private double mediumPrice;
    private String description;
    private String chefName;
   public Menu( String name,String type,String description,String chefName,
          List<Beverage> beverageList,List<Appetizer> appetizerList, List<FirstDishes> firstDishes,
          List<SecondDishes> secondDishes,List<Desserts> dessertsList){
        this.name = name;
        this.type = type;
        this.description = description;
        this.chefName = chefName;
        this.appetizerList = appetizerList;
        this.beverageList = beverageList;
        this.firstDishesList = firstDishes;
        this.secondDishesList = secondDishes;
        this.dessertsList = dessertsList;
    }
    public List<Appetizer> getAppetizerList() {
        return appetizerList;
    }
    public void setAppetizerList(List<Appetizer> appetizerList) {
        this.appetizerList = appetizerList;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public double getMediumPrice() {
        return mediumPrice;
    }
    public void setMediumPrice(double mediumPrice) {
        this.mediumPrice = mediumPrice;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getChefName() {
        return chefName;
    }
    public void setChefName(String chefName) {
        this.chefName = chefName;
    }
    public List<Beverage> getBeverageList() {
        return beverageList;
    }
    public void setBeverageList(List<Beverage> beverageList) {
        this.beverageList = beverageList;
    }
    public List<FirstDishes> getFirstDishesList() {
        return firstDishesList;
    }
    public void setFirstDishesList(List<FirstDishes> firstDishesList) {
        this.firstDishesList = firstDishesList;
    }
    public List<SecondDishes> getSecondDishesList() {
        return secondDishesList;
    }
    public void setSecondDishesList(List<SecondDishes> secondDishesList) {
        this.secondDishesList = secondDishesList;
    }
    public List<Desserts> getDessertsList() {
        return dessertsList;
    }
    public void setDessertsList(List<Desserts> dessertsList) {
        this.dessertsList = dessertsList;
    }
    public void findMediumPrice(){
        double totalPrice = 0;
        int itemCount = 0;
        for (Portata appetizer : portataList) {
            totalPrice += appetizer.getPrice();
            itemCount++;
        }
        this.mediumPrice = Math.round(totalPrice / itemCount * 100.0) / 100.0;
    }

//TODO accedere sempre ai field nella stessa classe

    public void printMenu(){
        System.out.println("Menu: "+this.name);
        System.out.println("Type: "+this.type);
        System.out.println("Description: "+this.description);
        System.out.println("Created by: "+this.chefName);
        System.out.println("The medium price is: "+this.mediumPrice+" $");
        System.out.println("\nAppetizers:");
        //TODO sistemare
        for (Portata appetizer : portataList) {
            appetizer.printInfo();
        }

    }



}
