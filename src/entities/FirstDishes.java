package src.entities;
import src.entities.enumeration.ColorEnum;
import src.entities.enumeration.TypeAllergensEnum;

public class FirstDishes extends Meal {

    private boolean itsFrozen;
    private boolean itsPrecoocked;

    public FirstDishes(String name, double price, boolean itsFrozen, boolean itsPrecoocked, TypeAllergensEnum allergens) {
        super(name, price, allergens);
        this.itsFrozen = itsFrozen;
        this.itsPrecoocked = itsPrecoocked;
    }

    //TODO potete anche fare un metodo che prende un colore in input
    @Override
    public void printInfo() {
        super.printInfo();
        if (this.itsFrozen){
            System.out.println(ColorEnum.ANSI_YELLOW.getCode() + "This dish it's frozen" + ColorEnum.ANSI_RESET.getCode());
        }else{
            System.out.println((ColorEnum.ANSI_YELLOW.getCode() + "This dish is fresh" + ColorEnum.ANSI_RESET.getCode()));
        }
        if (this.itsPrecoocked){
            System.out.println(ColorEnum.ANSI_YELLOW.getCode() + "This dish it's precooked" + ColorEnum.ANSI_RESET.getCode());
        }else{
            System.out.println((ColorEnum.ANSI_YELLOW.getCode() + "This dish is cooked at the moment" + ColorEnum.ANSI_RESET.getCode()));
        }
    }
}
