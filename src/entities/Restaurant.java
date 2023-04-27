package src.entities;

import src.entities.enumeration.TypeAllergensEnum;
import src.entities.enumeration.TypeBeverage;
import src.entities.enumeration.TypeDessert;
import src.entities.enumeration.TypeMenu;

import java.util.ArrayList;
import java.util.List;

import static src.entities.enumeration.ColorEnum.*;

public class Restaurant {

    private String name;
    private String address;
    private String owner;
    private List<Menu> menuList;

    public Restaurant(String name, String address, String owner, List<Menu> menuList) {
        this.name = name;
        this.address = address;
        this.owner = owner;
        this.menuList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<Menu> getMenu() {
        return menuList;
    }

    public void setMenu(List<Menu> menu) {
        this.menuList = menu;
    }

    public void addMenu(Menu menu) {
        menuList.add(menu);
    }

    public void removeMenu(Menu menu) {
        menuList.remove(menu);
    }

    public void printRestaurants() {
        System.out.println(ANSI_GREEN_BACKGROUND.getCode()+ ANSI_BLACK.getCode() + "Restaurant : " + this.name);
        System.out.println("Address : " + this.address);
        System.out.println("Owner of the best pizza in Napoli is : " + this.owner + " \n" + ANSI_RESET.getCode());
        Menu menu = new Menu("Vegetarian", TypeMenu.VEGETARIAN, "B. Barbieri");
        List<Menu> listaMenu = new ArrayList<>();
        listaMenu.add(menu);
        Restaurant ristorante = new Restaurant("Ristorante da Michele", "via M. Mangiacotti", "Michele Mangiacotti", listaMenu);
        menu.addPortata(new Beverage("Chianti", 10, TypeAllergensEnum.NONE, TypeBeverage.RED_WINE));
        menu.addPortata(new Beverage("Prosecco", 1, TypeAllergensEnum.NONE, TypeBeverage.WHITE_WINE));
        menu.addPortata(new Beverage("Heinekken", 5, TypeAllergensEnum.GLUTEN, TypeBeverage.BLONDE));
        menu.addPortata(new Beverage("Red Erik", 7, TypeAllergensEnum.GLUTEN, TypeBeverage.RED));
        menu.addPortata(new Beverage("Indian Pale Ale", 7.5, TypeAllergensEnum.GLUTEN, TypeBeverage.IPA));
        menu.addPortata(new Appetizer("Sformatino di verdure", 4.99, TypeAllergensEnum.EGGS_AND_DERIVATES, false));
        menu.addPortata(new Appetizer("Pinzimonio", 4.50, TypeAllergensEnum.NONE, false));
        menu.addPortata(new Appetizer("Verdure pastellate", 3.50, TypeAllergensEnum.GLUTEN, true));
        menu.addPortata(new Appetizer("Ratatouille", 7.50, TypeAllergensEnum.NONE, false));
        menu.addPortata(new Appetizer("Cavolo Gratinato", 3.99, TypeAllergensEnum.LACTOS, false));
        menu.addPortata(new FirstDishes("Orecchiette Cime di Rapa", 4.00, false, false, TypeAllergensEnum.GLUTEN));
        menu.addPortata(new FirstDishes("Risotto di funghi", 4.50, false, false, TypeAllergensEnum.LACTOS));
        menu.addPortata(new FirstDishes("Passata di Verdure", 3.00, false, true, TypeAllergensEnum.NONE));
        menu.addPortata(new FirstDishes("Gnocchi alla romana", 6.50, false, true, TypeAllergensEnum.LACTOS));
        menu.addPortata(new SecondDishes("Hamburger vegetariano", 5.99, false, true, TypeAllergensEnum.NONE));
        menu.addPortata(new SecondDishes("Parmigiana di melanzane", 9.99, false, false, TypeAllergensEnum.LACTOS));
        menu.addPortata(new SecondDishes("Involtini di primavera", 12.99, false, true, TypeAllergensEnum.GLUTEN));
        menu.addPortata(new SecondDishes("Tofu in salsa di soia", 6.99, false, true, TypeAllergensEnum.NONE));
        menu.addPortata(new SecondDishes("Millefoglie di verdure", 9.99, false, false, TypeAllergensEnum.GLUTEN));
        menu.addPortata(new Desserts("Tiramisù", 7.99, TypeAllergensEnum.LACTOS, TypeDessert.SPOON_DESSERT));
        menu.addPortata(new Desserts("Torta di mele", 6.99, TypeAllergensEnum.GLUTEN, TypeDessert.CAKE));
        menu.addPortata(new Desserts("Crostata di mirtilli", 5.99, TypeAllergensEnum.GLUTEN, TypeDessert.CAKE));
        menu.addPortata(new Desserts("Semifreddo mandorla", 2.99, TypeAllergensEnum.LACTOS, TypeDessert.PARFAIT));
        menu.addPortata(new Desserts("Gelato al Babà", 3.99, TypeAllergensEnum.LACTOS, TypeDessert.FROZEN));
        menu.findMediumPrice();
        menu.printMenu();

    }
}
