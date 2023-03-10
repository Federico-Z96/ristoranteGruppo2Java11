package src.entities;

import java.util.List;

public class Menu {
    private List<Appetizer> appetizerList;
    private List<Beverage> beverageList;
    private List<FirstDishes> firstDishesList;
    private List<SecondDishes> secondDishesList;
    private List<Desserts> dessertsList;
    private String name;
    private String type;
    private double mediumPrice;
    private String description;
    private String chefName;
    Menu( String name,String type,String description,String chefName,
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
        for (Appetizer appetizer : appetizerList) {
            totalPrice += appetizer.getPrice();
            itemCount++;
        }
        for (Beverage beverage : beverageList) {
            totalPrice += beverage.getPrice();
            itemCount++;
            }
        for (FirstDishes firstDish : firstDishesList) {
            totalPrice += firstDish.getPrice();
            itemCount++;
        }
        for (SecondDishes secondDish : secondDishesList) {
            totalPrice += secondDish.getPrice();
            itemCount++;
        }
        for (Desserts dessert : dessertsList) {
            totalPrice += dessert.getPrice();
            itemCount++;
        }
        this.mediumPrice = Math.round(totalPrice / itemCount * 100.0) / 100.0;
    }
    public void printMenu(){
        System.out.println("Menu: "+this.name);
        System.out.println("Type: "+this.type);
        System.out.println("Description: "+this.description);
        System.out.println("Created by: "+this.chefName);
        System.out.println("The medium price is: "+this.mediumPrice+" $");
        System.out.println("\nAppetizers:");
        for (Appetizer appetizer : appetizerList) {
            System.out.println(appetizer.getName() + " - " + appetizer.getPrice() + " $");
        }
        System.out.println("\nFirst dishes:");
        for (FirstDishes firstDish : firstDishesList) {
            System.out.println(firstDish.getName() + " - " + firstDish.getPrice() + " $");
        }
        System.out.println("\nSecond dishes:");
        for (SecondDishes secondDish : secondDishesList) {
            System.out.println(secondDish.getName() + " - " + secondDish.getPrice() + " $");
        }
        System.out.println("\nDesserts:");
        for (Desserts dessert : dessertsList) {
            System.out.println(dessert.getName() + " - " + dessert.getPrice() + " $");
        }
        System.out.println("\nBeverages:");
        for (Beverage beverage : beverageList) {
            System.out.println(beverage.getName() + " - " + beverage.getPrice() + " $");
        }
    }



    //-TODO dobbiamo creare il metodo di stampa per inserire tutte le liste e stampare il men??

    //-TODO inserire nome, tipo men??, prezzo medio, chef e altro che volete per descrivere un men??

    //-TODO inserire tutte le liste

    //-TODO creare costruttore con init delle liste
}
