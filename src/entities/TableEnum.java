package src.entities;

public enum TableEnum {
    ONE(1,2),
    TWO(2,2),
    THREE(3,4),
    FOUR(4,4),
    FIVE(5,6),
    SIX(6,6),
    SEVEN(7,8),
    EIGHT(8,8),
    NINE(9,8),
    TEN(10,8);

    private final int number;
    private final int disponibility;

    TableEnum(int number, int disponibility) {
        this.number = number;
        this.disponibility = disponibility;
    }

    public int getNumber() {
        return number;
    }

    public int getDisponibility() {
        return disponibility;
    }
}
