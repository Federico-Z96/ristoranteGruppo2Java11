package classRestaurant;

import java.util.Arrays;
import java.util.List;

public  class main {
    public static void main(String[] args) {



        List<Beverage> beverages = Arrays.asList(
                new Beverage("Vino ", "Rosso della casa ", 10),
                new Beverage("Vino ", "Bianco della casa ", 11),
                new Beverage("Birra ", "Bionda ", 5),
                new Beverage("Birra ", "Rossa ", 7),
                new Beverage("Birra ", "Ipa ", 7.5)
        );



        List<Appetizer> menuAppetizer = Arrays.asList(
                new Appetizer("Sformatino di verdure ", 4.99),
                new Appetizer("Pinzimonio ", 4.50),
                new Appetizer("Verdure pastellate ", 2.50),
                new Appetizer("Ratatouille ", 3.50),
                new Appetizer("Cavolo Gratinato ", 3.99)
        );


        List<FirstDishes> firstDishes = Arrays.asList(
                new FirstDishes("Cime di Rapa " , 4.00),
                new FirstDishes("Risotto di funghi " , 4.50),
                new FirstDishes("Passata di Verdure " , 3.00),
                new FirstDishes("Spaghetti  Cacio e Pepe " , 5.00),
                new FirstDishes("Gnocchi alla romana " , 6.50)
        );
        List<SecondDishes> secondiPiattis = Arrays.asList(
                new SecondDishes("Hamburger vegetariano ",  5.99),
                new SecondDishes("Parmigiana di melanzane ",  9.99),
                new SecondDishes("Involtini di primavera ",  12.99),
                new SecondDishes("Tofu in salsa di soia ", 6.99),
                new SecondDishes("Millefoglie di verdure ",9.99 )
        );

        List<Desserts> addDesserts = Arrays.asList(
                new Desserts("Tiramisù ", 7.99),
                new Desserts("Torta di mele ", 6.99),
                new Desserts("Crostata di mirtilli ", 5.99),
                new Desserts("Cannolo siciliano ", 2.99),
                new Desserts("Babà ", 2.99 )
        );
        System.out.println("MENU:\n");
        System.out.println("Beverages:\n");
        for (Beverage beverage : beverages) {
            beverage.printinfo();
        }
        System.out.println("\nAppetizer:\n");
        for (Appetizer Appetizer : menuAppetizer) {
            Appetizer.printinfo();
        }
        System.out.println("\nFirst Dishes:\n");
        for (FirstDishes first_dishes : firstDishes) {
            first_dishes.printinfo();
        }
        System.out.println("\nSecond Dishes:\n");
        for (SecondDishes SecondiPiatti : secondiPiattis) {
            SecondiPiatti.printinfo();
        }
        System.out.println("\nDesserts:\n");
        for (Desserts Desserts : addDesserts) {
            Desserts.printinfo();
        }














    }




}


