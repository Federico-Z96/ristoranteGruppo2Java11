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

    //-TODO dobbiamo creare il metodo di stampa per inserire tutte le liste e stampare il menù

    //-TODO inserire nome, tipo menù, prezzo medio, chef e altro che volete per descrivere un menù

    //-TODO inserire tutte le liste

    //-TODO creare costruttore con init delle liste
}
