package src.entities;

import java.util.ArrayList;
import java.util.List;

public  class Main {
    public static void main(String[] args) {

        Menu menu = new Menu("Veggy", TypeMenu.VEGAN,"B. Barbieri");

        List<Menu> listaMenu = new ArrayList<>();
        listaMenu.add(menu);
        Ristorante ristorante = new Ristorante("Ristorante da Michele","via M. Mangiacotti", "Michele Mangiacotti", listaMenu );

        menu.addPortata(new Beverage("Chianti", 10, TypeBeverage.RED_WINE));
        menu.addPortata(new Beverage("Prosecco", 1, TypeBeverage.WHITE_WINE));
        menu.addPortata(new Beverage("Heinekken", 5, TypeBeverage.BLONDE));
        menu.addPortata(new Beverage("Red Erik",7, TypeBeverage.RED));
        menu.addPortata(new Beverage("Indian Pale Ale",7.5, TypeBeverage.IPA));
        menu.addPortata(new Appetizer("Sformatino di verdure", 4.99, false));
        menu.addPortata(new Appetizer("Pinzimonio", 4.50, false));
        menu.addPortata(new Appetizer("Verdure pastellate", 3.50,true));
        menu.addPortata(new Appetizer("Ratatouille", 7.50,false));
        menu.addPortata(new Appetizer("Cavolo Gratinato", 3.99,false));
        menu.addPortata(new FirstDishes("Cime di Rapa" , 4.00));
        menu.addPortata(new FirstDishes("Risotto di funghi" , 4.50));
        menu.addPortata(new FirstDishes("Passata di Verdure" , 3.00));
        menu.addPortata(new FirstDishes("Gnocchi alla romana" , 6.50));
        menu.addPortata(new SecondDishes("Hamburger vegetariano",  5.99));
        menu.addPortata(new SecondDishes("Parmigiana di melanzane",  9.99));
        menu.addPortata(new SecondDishes("Involtini di primavera",  12.99));
        menu.addPortata(new SecondDishes("Tofu in salsa di soia", 6.99));
        menu.addPortata(new SecondDishes("Millefoglie di verdure",9.99 ));
        menu.addPortata(new Desserts("Tiramisù", 7.99,TypeDessert.SPOON_DESSERT));
        menu.addPortata(new Desserts("Torta di mele", 6.99,TypeDessert.CAKE));
        menu.addPortata(new Desserts("Crostata di mirtilli", 5.99,TypeDessert.CAKE));
        menu.addPortata(new Desserts("Semifreddo mandorla", 2.99,TypeDessert.PARFAIT));
        menu.addPortata(new Desserts("Gelato al Babà", 3.99,TypeDessert.FROZEN ));
        menu.findMediumPrice();

        ristorante.printRestaurants();
        menu.printMenu();


    }



}



