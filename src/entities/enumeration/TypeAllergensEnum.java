package src.entities.enumeration;


public enum TypeAllergensEnum {
    NONE("Allergens Free"),
    GLUTEN("Contiene Glutine"),
    LACTOS("Contiene Lattosio"),
    EGGS_AND_DERIVATES("Contiene Uova e derivati"),
    FISH_AND_DERIVATES("Contiene Pesce e derivati"),
    PEANUTS_AND_DERIVATES("Contiene Noccioline e derivati"),
    NUTS_AND_DERIVATES("Contiene Noci e derivati");

    private final String name;
    /* Enum
    dove sono presenti tutti gli allegeni che possono essere presente dei vari piatti
    costruttore che permette di denominare l'allergene */
    TypeAllergensEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

