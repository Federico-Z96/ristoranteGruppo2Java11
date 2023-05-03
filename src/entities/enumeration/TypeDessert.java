package src.entities.enumeration;

public enum TypeDessert {
    CAKE("A slice of best cakes"),
    SPOON_DESSERT("A cup of dessert"),
    FROZEN("Ice cream self producted"),
    PARFAIT("A portion of parfait dessert");

    String description;
    /* Enum dove sono presenti del diverse tipolgie di dessert
    con un cotruttore che descrive il dessert */
    TypeDessert(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
