package src.entities.enumeration;

public enum TypeBeverage {
    RED("Red", "Blend of caramelized and high temperature roasted barley malts and a generous amount of hops"),
    BLONDE("Blonde", "Light beers are made with lightly roasted malts"),
    IPA("Ipa", "Highly alcoholic and hoppy top-fermented beer, traditionally produced with English malts, hops and yeasts"),
    RED_WINE("Red Wine", "Wines composed of red grapes and with pomace"),
    WHITE_WINE("White Wine", "Wines composed of both red and white grapes, in the case of red grapes the pomace is not added to the must");
    private String name;
    private String description;
    TypeBeverage(String name, String description) {
        this.name = name;
        this.description = description;
    }
    /* Enum dove sono presenti tutte le tipologie di bevande
    con un costruttore che inserisce il nome è la descrizione */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        description = description;
    }
}

