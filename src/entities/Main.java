package src.entities;

import src.entities.enumeration.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public  class Main {
    public static void main(String[] args) {List<Menu> listaMenu = new ArrayList<>();

        Restaurant ristorante = new Restaurant("Ristorante da Michele","via M. Mangiacotti", "Michele Mangiacotti", listaMenu );
        ristorante.printRestaurants();

        Client client1 = new Client("Giulio", "giulio@gmail.com", "+393455566777");
        Map<Client, TableEnum> reservations = new HashMap<Client,TableEnum>();
        reservations.put(client1,TableEnum.SEVEN);



    }



}



