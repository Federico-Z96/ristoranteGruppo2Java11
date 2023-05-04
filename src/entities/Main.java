package src.entities;

import src.entities.enumeration.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    /**
     * Questa è la classe principale del programma. Contiene il metodo main che permette di eseguire il programma.
     * In particolare, viene creato un ristorante con un nome, un indirizzo, un nome del proprietario, una lista di menu e un numero di tavoli.
     * Viene poi creato un menu con un nome, un tipo, e un autore, e vengono aggiunte delle portate.
     * Infine, vengono stampati a video i dati del ristorante.
     * Viene anche creato un cliente con nome, email e numero di telefono, e una prenotazione con un tavolo e il relativo cliente.
     */
    public static void main(String[] args) {
        List<Menu> listaMenu = new ArrayList<Menu>();
        Restaurant ristorante = new Restaurant("Ristorante da Michele", "via M. Mangiacotti", "Michele Mangiacotti", listaMenu, 10);
        Menu menu = new Menu("Vegetarian", TypeMenu.VEGETARIAN, "B. Barbieri");
        listaMenu.add(menu);
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
        ristorante.printRestaurants();

    /**
     Questo codice crea un nuovo oggetto Cliente "client1" con i seguenti dati: nome, indirizzo email e numero di telefono.
     Successivamente, crea una mappa "reservations" che associa il cliente alla sua prenotazione di un tavolo "t1".
     Il tavolo ha un identificativo numerico "1" e una capienza massima di 4 persone.
     *@param client1 l'oggetto Cliente creato con nome, indirizzo email e numero di telefono.
     *@param reservations la mappa che associa il cliente alla sua prenotazione del tavolo.
     *@param t1 l'oggetto Tavolo creato con identificativo numerico "1" e capienza massima di 4 persone.
         */

      Client client1 = new Client("Giulio", "giulio@gmail.com", "+393455566777");
      Map<Client, Table> reservations = new HashMap<Client, Table>();
      Table t1 = new Table(1, 4);
      reservations.put(client1, t1);

    }
}




