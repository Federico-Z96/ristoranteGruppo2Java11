package src.entities.enumeration;

/**
 L'enumerazione TypeDessert rappresenta le diverse tipologie di dessert all'interno di un ristorante.
 */
public enum TypeDessert {
    CAKE("Una fetta di deliziosi dolci"),
    SPOON_DESSERT("Una coppa di dessert"),
    FROZEN("Gelato di produzione propria"),
    PARFAIT("Una porzione di parfait dessert");

    private String description;

    /**
     Costruttore dell'enumerazione TypeDessert, che associa una descrizione ad ogni tipologia di dessert.
     *@param description la descrizione della tipologia di dessert.
     */
    TypeDessert(String description) {
        this.description = description;
    }

    /**
     Questo metodo restituisce la descrizione della tipologia di dessert.
     *@return la descrizione della tipologia di dessert.
     */
    public String getDescription() {
        return description;
    }

    /**
     Questo metodo imposta la descrizione della tipologia di dessert.
     *@param description la nuova descrizione da impostare per la tipologia di dessert.
     */
    public void setDescription(String description) {
        this.description = description;
    }
}