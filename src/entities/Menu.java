package src.entities;

import src.entities.enumeration.TypeMenuEnum;

import java.util.ArrayList;
import java.util.List;

import static src.entities.enumeration.ColorEnum.*;

/**
 Questa classe rappresenta un menu di un ristorante, composto da un elenco di portate, un nome, un tipo,
 un prezzo medio e il nome dello chef che lo ha creato.
 */
public class Menu {

    private List<Meal> portataList;
    private String name;
    private TypeMenuEnum type;

    //TODO inserire sempre gli oggetti
    private double mediumPrice;
    private String chefName;

    /**
     Costruisce un nuovo oggetto Menu con il nome, il tipo e il nome dello chef specificati.
     L'elenco delle portate viene inizializzato vuoto.
     *@param name il nome del menu
     *@param type il tipo del menu
     *@param chefName il nome dello chef che ha creato il menu
     */
    public Menu(String name, TypeMenuEnum type, String chefName) {
        this.name = name;
        this.type = type;
        this.chefName = chefName;
        this.portataList = new ArrayList<>();
    }

    /**
     Restituisce il nome del menu.
     *@return il nome del menu
     */
    public String getName() {
        return name;
    }

    /**
     Imposta il nome del menu.
     *@param name il nome del menu da impostare
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     Restituisce il tipo del menu.
     *@return il tipo del menu
     */
    public TypeMenuEnum getType() {
        return type;
    }

    /**
     Imposta il tipo del menu.
     *@param type il tipo del menu da impostare
     */
    public void setType(TypeMenuEnum type) {
        this.type = type;
    }

    /**
     Restituisce il prezzo medio del menu.
     *@return il prezzo medio del menu
     */
    public double getMediumPrice() {
        return mediumPrice;
    }

    /**
     Imposta il prezzo medio del menu.
     *@param mediumPrice il prezzo medio del menu da impostare
     */
    public void setMediumPrice(double mediumPrice) {
        this.mediumPrice = mediumPrice;
    }

    /**
     Restituisce il nome dello chef che ha creato il menu.
     *@return il nome dello chef che ha creato il menu
     */
    public String getChefName() {
        return chefName;
    }

    /**
     Imposta il nome dello chef che ha creato il menu.
     *@param chefName il nome dello chef che ha creato il menu da impostare
     */
    public void setChefName(String chefName) {
        this.chefName = chefName;
    }

    /**
     Restituisce l'elenco delle portate del menu.
     *@return l'elenco delle portate del menu
     */
    public List<Meal> getPortataList() {
        return portataList;
    }

    /**
     Aggiunge una portata all'elenco delle portate del menu.
     *@param portata la portata da aggiungere
     */
    public void addPortata(Meal portata) {
        portataList.add(portata);}

    /**
     Rimuove una portata dal menu.
     *@param portata la portata da rimuovere
     */
    public void removePortata(Meal portata) {
        portataList.remove(portata);
    }
    /**

     Calcola il prezzo medio delle portate del menu.
     */
    public void findMediumPrice() {
        double totalPrice = 0;
        int itemCount = 0;
        for (Meal portata : portataList) {
            totalPrice += portata.getPrice();
            itemCount++;
        }
        this.mediumPrice = Math.round(totalPrice / itemCount * 100.0) / 100.0;
    }

    /**
     Stampa il menu a video.
     */
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
