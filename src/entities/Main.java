package src.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public  class Main {
    public static void main(String[] args) {

        List<Portata> portataList = new ArrayList<>() ;
        portataList.add(new Beverage("Red Wine ", Type.VINO_ROSSO, 10));
        portataList.add(new Beverage("White Wine ", Type.VINO_BIANCO, 11));
        portataList.add(new Beverage("Blonde ",Type.BIONDA, 5));
        portataList.add(new Beverage("Red ",Type.ROSSA, 7));
        portataList.add(new Beverage("Ipa ",Type.IPA, 7.5));
        portataList.add(new Appetizer("Sformatino di verdure ", 4.99));
        portataList.add(new Appetizer("Pinzimonio ", 4.50));
        portataList.add(new Appetizer("Verdure pastellate ", 3.50));
        portataList.add(new Appetizer("Ratatouille ", 7.50));
        portataList.add(new Appetizer("Cavolo Gratinato ", 3.99));
        portataList.add(new FirstDishes("Cime di Rapa " , 4.00));
        portataList.add(new FirstDishes("Risotto di funghi " , 4.50));
        portataList.add(new FirstDishes("Passata di Verdure " , 3.00));
        portataList.add(new FirstDishes("Gnocchi alla romana " , 6.50));
        portataList.add(new SecondDishes("Hamburger vegetariano ",  5.99));
        portataList.add(new SecondDishes("Parmigiana di melanzane ",  9.99));
        portataList.add(new SecondDishes("Involtini di primavera ",  12.99));
        portataList.add(new SecondDishes("Tofu in salsa di soia ", 6.99));
        portataList.add(new SecondDishes("Millefoglie di verdure ",9.99 ));
        portataList.add(new Desserts("Tiramisù ", 7.99));
        portataList.add(new Desserts("Torta di mele ", 6.99));
        portataList.add(new Desserts("Crostata di mirtilli ", 5.99));
        portataList.add(new Desserts("Cannolo siciliano ", 2.99));
        portataList.add(new Desserts("Babà ", 3.99 ));


        //@TODO qui agguingere tutti gli elementi creati alla lista portate
        Menu menu = new Menu("Veggy",Type.CARNIVORO,"B. Barbieri",
                portataList);

        menu.findMediumPrice();
        menu.printMenu();

    }

}



