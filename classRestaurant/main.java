package classRestaurant;

import java.util.ArrayList;
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

        List<SecondiPiatti> secondiPiattis = Arrays.asList(
                new SecondiPiatti("Hamburger vegetariano ",  5.99),
                new SecondiPiatti("Parmigiana di melanzane ",  9.99),
                new SecondiPiatti("Involtini di primavera ",  12.99),
                new SecondiPiatti("Tofu in salsa di soia ", 6.99),
                new SecondiPiatti("Millefoglie di verdure ",9.99 )
        );

    }

}


