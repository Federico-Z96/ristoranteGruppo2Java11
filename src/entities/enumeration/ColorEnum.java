package src.entities.enumeration;

/**
 Enumerazione che definisce i colori utilizzabili per la formattazione del testo stampato su console.
 I colori disponibili includono sia i colori di sfondo che quelli del testo.
 Per ogni colore viene definita una costante con il relativo codice ANSI, che rappresenta il colore in formato testuale.
 Questa enumerazione è utilizzata per definire i colori delle varie portate in una simulazione di ristorante.
 */

public enum ColorEnum {

    /**
     Codice ANSI per il colore di sfondo nero.
     */
    ANSI_BLACK_BACKGROUND("\u001B[40m"),
    /**
     Codice ANSI per il colore di sfondo rosso.
     */
    ANSI_RED_BACKGROUND("\u001B[41m"),
    /**
     Codice ANSI per il colore di sfondo verde.
     */
    ANSI_GREEN_BACKGROUND("\u001B[42m"),
    /**
     Codice ANSI per il colore di sfondo giallo.
     */
    ANSI_YELLOW_BACKGROUND("\u001B[43m"),
    /**
     Codice ANSI per il colore di sfondo blu.
     */
    ANSI_BLUE_BACKGROUND("\u001B[44m"),
    /**
     Codice ANSI per il colore di sfondo viola.
     */
    ANSI_PURPLE_BACKGROUND("\u001B[45m"),
    /**
     Codice ANSI per il colore di sfondo ciano.
     */
    ANSI_CYAN_BACKGROUND("\u001B[46m"),
    /**
     Codice ANSI per il colore di sfondo bianco.
     */
    ANSI_WHITE_BACKGROUND("\u001B[47m"),
    /**
     Codice ANSI per il colore viola.
     */
    ANSI_PURPLE("\u001B[35m"),
    /**
     Codice ANSI per il colore giallo.
     */
    ANSI_YELLOW("\u001B[33m"),
    /**
     Codice ANSI per il colore nero.
     */
    ANSI_BLACK("\u001B[30m"),
    /**
     Codice ANSI per il reset del colore.
     */
    ANSI_RESET("\u001B[0m");
    /**
     Il codice ANSI del colore.
     */
    private final String code;

    /**
     Costruttore che crea una costante dell'enumerazione con il codice ANSI specificato.
     *@param code il codice ANSI del colore.
     */
    ColorEnum(String code) {
        this.code = code;
    }

    /**
     Restituisce il codice ANSI del colore.
     *@return il codice ANSI del colore.
     */
    public String getCode() {
        return code;
    }
}