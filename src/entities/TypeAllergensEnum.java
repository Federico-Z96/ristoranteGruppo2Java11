package src.entities;


public enum TypeAllergensEnum {


    //TODO come convenzione si chiamano enum nel finale: nomeClasseEnum --- typeEnum
    //TODO chiedere ai tutor come gestire gli enum perchè gli enum sono un anagrafica e quindi e field
    NONE("Allergens Free"),
    GLUTEN("Contiene Glutine"),
    LACTOS("Contiene Lattosio"),
    EGGS_AND_DERIVATES("Contiene Uova e derivati"),
    FISH_AND_DERIVATES("Contiene Pesce e derivati"),
    PEANUTS_AND_DERIVATES("Contiene Noccioline e derivati"),
    NUTS_AND_DERIVATES("Contiene Noci e derivati");

   private final String name;

    TypeAllergensEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

