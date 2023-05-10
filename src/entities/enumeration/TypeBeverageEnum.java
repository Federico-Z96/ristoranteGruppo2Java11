package src.entities.enumeration;

/**
 Enum che rappresenta le diverse tipologie di bevande disponibili nel menu del ristorante.
 */
public enum TypeBeverageEnum {

    RED("Red", "Blend di malto d'orzo caramellato e torrefatto ad alta temperatura e una generosa quantità di luppolo"),
    BLONDE("Blonde", "Birre leggere fatte con malti leggermente tostati"),
    IPA("Ipa", "Birra ad alta gradazione alcolica e luppolata, tradizionalmente prodotta con malti, luppoli e lieviti inglesi"),
    RED_WINE("Red Wine", "Vini composti da uve rosse e con vinacce"),
    WHITE_WINE("White Wine", "Vini composti sia da uve rosse che da uve bianche, nel caso delle uve rosse la vinaccia non viene aggiunta al mosto");

    private String name;
    private String description;

    /**
     Costruttore che inizializza una tipologia di bevanda con il nome e la descrizione passati come parametro.
     *@param name il nome della bevanda
     *@param description la descrizione della bevanda
     */
    TypeBeverageEnum(String name, String description) {
        this.name = name;
        this.description = description;
    }

    /**
     Restituisce il nome della bevanda.
     *@return il nome della bevanda
     */
    public String getName() {
        return name;
    }

    /**
     Imposta il nome della bevanda.
     *@param name il nuovo nome della bevanda
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     Restituisce la descrizione della bevanda.
     *@return la descrizione della bevanda
     */
    public String getDescription() {
        return description;
    }

    /**
     Imposta la descrizione della bevanda.
     *@param description la nuova descrizione della bevanda
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
