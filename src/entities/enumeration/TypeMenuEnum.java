package src.entities.enumeration;
/**
 L'enumerazione TypeMenu rappresenta la tipologia di un menù all'interno di un ristorante.
 */
public enum TypeMenuEnum {

    CARNIVOROUS("Carnivorous", "con piatti a base di carne e verdure"),
    VEGETARIAN("Vegetarian", "senza carne o pesce utilizzati"),
    VEGAN("Vegan", "senza carne, pesce e derivati");

    /**
     *@param name il nome della tipologia di menù.
     *@param description la descrizione della tipologia di menù.
     */

    private String name;
    private String description;

    TypeMenuEnum(String name, String description) {
        this.name = name;
        this.description = description;
    }

    /**
     Questo metodo restituisce il nome della tipologia di menù.
     *@return il nome della tipologia di menù.
     */
    public String getName() {
        return name;
    }

    /**
     Questo metodo imposta il nome della tipologia di menù.
     *@param name il nuovo nome da impostare per la tipologia di menù.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     Questo metodo restituisce la descrizione della tipologia di menù.
     *@return la descrizione della tipologia di menù.
     */
    public String getDescription() {
        return description;
    }

    /**
     Questo metodo imposta la descrizione della tipologia di menù.
     *@param description la nuova descrizione da impostare per la tipologia di menù.
     */
    public void setDescription(String description) {
        description = description;
    }
}