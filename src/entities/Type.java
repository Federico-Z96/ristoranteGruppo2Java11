package src.entities;

public enum Type { 
    
    // TODO inserire descrizione e nome leggibile--------TypeEnum
    
    CARNIVORO("Carnivoro", "with meals and vegetable"),
    VEGETARIANO("Vegetariano", "Not meals or fish used"),
    VEGANO("Vegano", "Not meals, fish and derivates"),
    ROSSA("Rossa", "Blend of caramelized and high temperature roasted barley malts and a generous amount of hops"),
    BIONDA("Bionda", "Light beers are made with lightly roasted malts"),
    IPA("Ipa", "Highly alcoholic and hoppy top-fermented beer, traditionally produced with English malts, hops and yeasts"),
    VINO_ROSSO("Red Wine", "Wines composed of red grapes and with pomace"),
    VINO_BIANCO("White Wine", "Wines composed of both red and white grapes, in the case of red grapes the pomace is not added to the must");




    private String name;
    private String description;
    Type(String name, String description) {
        this.name = name;
        this.description = description;
    }

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
