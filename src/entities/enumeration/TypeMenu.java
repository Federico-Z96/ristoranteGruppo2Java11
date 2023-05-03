package src.entities.enumeration;
public enum TypeMenu {

    CARNIVOROUS("Carnivorous", "with meals and vegetable"),
    VEGETARIAN("Vegetarian", "Not meals or fish used"),
    VEGAN("Vegan", "Not meals, fish and derivates");

    private String name;
    private String description;

    TypeMenu(String name, String description) {
        this.name = name;
        this.description = description;
    }
    /* un Enum
    dove è inserito la tipologia del menù dove sono presenti le varie portate
    con un costruttore che da una denominazione e una descrizione */
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
