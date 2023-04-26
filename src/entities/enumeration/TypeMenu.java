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
