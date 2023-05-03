package src.entities;

import src.entities.enumeration.TypeAllergensEnum;
import src.entities.enumeration.TypeBeverage;
import src.entities.enumeration.TypeDessert;
import src.entities.enumeration.TypeMenu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static src.entities.enumeration.ColorEnum.*;

public class Restaurant {

    private String name;
    private String address;
    private String owner;
    private List<Menu> menuList;
    private int capacity;
    private Map<Table,Client> reservations = new HashMap<>();
    /**
     *
     *
     * @param name
     * @param address
     * @param owner
     * @param menuList
     */
    public Restaurant(String name, String address, String owner, List<Menu> menuList, int capacity) {
        this.name = name;
        this.address = address;
        this.owner = owner;
        this.menuList = menuList;
        this.capacity = capacity;
    }
/*Il costruttore serve dare le informazioni del ristorante
* il nome, la via, il proprietario e la lista  dove verranno inseriti i vari menu */
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

    public void addReservation (Table table, Client client) {
        if (reservations.size()<= capacity) {
            reservations.put(table,client);
        }else{
            System.out.println("Sorry we're fully over capacity");
        }
    }

    /**
     *
     */
    /*PrinteRestaurants serve a stampare tutti i piatti dei vari menu*/
    public void printRestaurants() {
        System.out.println(ANSI_GREEN_BACKGROUND.getCode()+ ANSI_BLACK.getCode() + "Restaurant : " + this.name);
        System.out.println("Address : " + this.address);
        System.out.println("Owner of the best pizza in Napoli is : " + this.owner + " \n" + ANSI_RESET.getCode());
        for (Menu menu : this.menuList) {
            menu.findMediumPrice();
            menu.printMenu();
        }
    }
}
