package src.entities.enumeration;

public enum ColorEnum {
    ANSI_BLACK_BACKGROUND("\u001B[40m"),
    ANSI_RED_BACKGROUND("\u001B[41m"),
    ANSI_GREEN_BACKGROUND("\u001B[42m"),
    ANSI_YELLOW_BACKGROUND("\u001B[43m"),
    ANSI_BLUE_BACKGROUND("\u001B[44m"),
    ANSI_PURPLE_BACKGROUND("\u001B[45m"),
    ANSI_CYAN_BACKGROUND("\u001B[46m"),
    ANSI_WHITE_BACKGROUND("\u001B[47m"),
    ANSI_PURPLE("\u001B[35m"),
    ANSI_YELLOW("\u001B[33m"),
    ANSI_BLACK("\u001B[30m"),
    ANSI_RESET("\u001B[0m");
    /* Enum
    dove sono presenti
    i colori di sfondo da inserire nelle stampe delle varie portate
    costruttore che serve ad aggiungere l'attributo che fa funzionare
    la colarazione */
    private final String code;

    ColorEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
