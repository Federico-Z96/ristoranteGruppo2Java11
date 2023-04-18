package src.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public  class Main {
    public static void main(String[] args) {

        //@TODO qui agguingere tutti gli elementi creati alla lista portate
        Menu menu = new Menu("Veggy",Type.CARNIVOROUS,"B. Barbieri");

        //TODO dare la possibilità di creare più menù e quindi creare una classe ristorante
        //che avra una lista di menù e altre info primarie, nome, tipo ecc ecc

        menu.addPortata(new Desserts("Babà ", 3.99 ));
        menu.addPortata(new Beverage("Chianti ", Type.RED_WINE, 10));
        menu.addPortata(new Beverage("Prosecco ", Type.WHITE_WINE, 11));
        menu.addPortata(new Beverage("Heinekken ",Type.BLONDE, 5));
        menu.addPortata(new Beverage("Red Erik ",Type.RED, 7));
        menu.addPortata(new Beverage("Indian Pale Ale ",Type.IPA, 7.5));
        menu.addPortata(new Appetizer("Sformatino di verdure ", 4.99, false, true, false));
        menu.addPortata(new Appetizer("Pinzimonio ", 4.50, false, true, true));
        menu.addPortata(new Appetizer("Verdure pastellate ", 3.50,true,false,false));
        menu.addPortata(new Appetizer("Ratatouille ", 7.50,false,true,true));
        menu.addPortata(new Appetizer("Cavolo Gratinato ", 3.99,false,true,false));
        menu.addPortata(new FirstDishes("Cime di Rapa " , 4.00));
        menu.addPortata(new FirstDishes("Risotto di funghi " , 4.50));
        menu.addPortata(new FirstDishes("Passata di Verdure " , 3.00));
        menu.addPortata(new FirstDishes("Gnocchi alla romana " , 6.50));
        menu.addPortata(new SecondDishes("Hamburger vegetariano ",  5.99));
        menu.addPortata(new SecondDishes("Parmigiana di melanzane ",  9.99));
        menu.addPortata(new SecondDishes("Involtini di primavera ",  12.99));
        menu.addPortata(new SecondDishes("Tofu in salsa di soia ", 6.99));
        menu.addPortata(new SecondDishes("Millefoglie di verdure ",9.99 ));
        menu.addPortata(new Desserts("Tiramisù ", 7.99));
        menu.addPortata(new Desserts("Torta di mele ", 6.99));
        menu.addPortata(new Desserts("Crostata di mirtilli ", 5.99));
        menu.addPortata(new Desserts("Cannolo siciliano ", 2.99));
        menu.addPortata(new Desserts("Babà ", 3.99 ));
        menu.findMediumPrice();
        menu.printMenu();

    }

}



