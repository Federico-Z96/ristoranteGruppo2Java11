package src.entities.enumeration;

/**
 Enum che rappresenta i possibili allergeni che possono essere presenti nei piatti del menu.
 */
public enum TypeAllergensEnum {
    NONE("Senza allergeni"),
    GLUTEN("Contiene glutine"),
    LACTOS("Contiene lattosio"),
    EGGS_AND_DERIVATES("Contiene uova e derivati"),
    FISH_AND_DERIVATES("Contiene pesce e derivati"),
    PEANUTS_AND_DERIVATES("Contiene noccioline e derivati"),
    NUTS_AND_DERIVATES("Contiene noci e derivati");

    private final String name;

    /**
     Costruttore che permette di inizializzare il nome dell'allergene.
     *@param name il nome dell'allergene
     */
    TypeAllergensEnum(String name) {
        this.name = name;
    }

    /**
     Metodo che restituisce il nome dell'allergene.
     *@return il nome dell'allergene
     */
    public String getName() {
        return name;
    }
}
