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

/**

 La classe Restaurant rappresenta un ristorante che ha un nome, un indirizzo, un proprietario, una lista di menu e una capienza massima.
 */
public class Restaurant {

    private String name;
    private String address;
    private String owner;
    private List<Menu> menuList;
    private int capacity;
    private Map<Table,Client> reservations = new HashMap<>();

    /**

     Costruisce un oggetto Restaurant con il nome, l'indirizzo, il proprietario, la lista dei menu e la capienza massima.
     *@param name il nome del ristorante
     *@param address l'indirizzo del ristorante
     *@param owner il proprietario del ristorante
     *@param menuList la lista dei menu del ristorante
     *@param capacity la capienza massima del ristorante
     */
    public Restaurant(String name, String address, String owner, List<Menu> menuList, int capacity) {
        this.name = name;
        this.address = address;
        this.owner = owner;
        this.menuList = menuList;
        this.capacity = capacity;
    }
    /**
     Restituisce il nome del ristorante.
     *@return il nome del ristorante
     */
    public String getName() {
        return name;
    }

    /**
     Imposta il nome del ristorante.
     *@param name il nuovo nome del ristorante
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     Restituisce l'indirizzo del ristorante.
     *@return l'indirizzo del ristorante
     */
    public String getAddress() {
        return address;
    }

    /**
     Imposta l'indirizzo del ristorante.
     *@param address il nuovo indirizzo del ristorante
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     Restituisce il proprietario del ristorante.
     *@return il proprietario del ristorante
     */
    public String getOwner() {
        return owner;
    }

    /**
     Imposta il proprietario del ristorante.
     *@param owner il nuovo proprietario del ristorante
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     Restituisce la lista dei menu del ristorante.
     *@return la lista dei menu del ristorante
     */
    public List<Menu> getMenu() {
        return menuList;
    }

    /**
     Imposta la lista dei menu del ristorante.
     *@param menu la nuova lista dei menu del ristorante
     */
    public void setMenu(List<Menu> menu) {
        this.menuList = menu;
    }

    /**
     Aggiunge un menu alla lista dei menu del ristorante.
     *@param menu il menu da aggiungere alla lista dei menu del ristorante
     */
    public void addMenu(Menu menu) {
        menuList.add(menu);
    }

    /**
     Rimuove un menu dalla lista dei menu del ristorante.
     *@param menu il menu da rimuovere dalla lista dei menu del ristorante
     */
    public void removeMenu(Menu menu) {
        menuList.remove(menu);
    }

    /**
     * Aggiunge una prenotazione alla mappa delle prenotazioni del ristorante.
     * @param table il tavolo prenotato.
     * @param client il cliente che ha effettuato la prenotazione.
     */
    public void addReservation (Table table, Client client) {
        if (reservations.size()<= capacity) {
            reservations.put(table,client);
        }else{
            System.out.println("Sorry we're fully over capacity");
        }
    }

    /**
     * Questo metodo stampa tutte le informaizoni relative al ristorante.
     */
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
