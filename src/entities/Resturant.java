package src.entities;

import java.util.ArrayList;
import java.util.List;

import static src.entities.Color.ANSI_GREEN_BACKGROUND;
import static src.entities.Color.ANSI_RESET;

public class Resturant {

    //TODO sistemare nome
  private String name;
  private String address;
  private String owner;
  private List<Menu> menuList;

    public Resturant(String name, String address, String owner, List<Menu> menuList) {
        this.name = name;
        this.address = address;
        this.owner = owner;
        this.menuList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<Menu> getMenu() {
        return menuList;
    }

    public void setMenu(List<Menu> menu) {
        this.menuList = menu;
    }

    public void addMenu(Menu menu){
        menuList.add(menu);
    }
    public void removeMenu(Menu menu){
        menuList.remove(menu);
    }

    public void printRestaurants(){
        System.out.println(ANSI_GREEN_BACKGROUND +"Restaurant : " + this.name );
        System.out.println("Address : " + this.address);
        System.out.println("Owner of the best pizza in Napoli is : " + this.owner + " \n"+ ANSI_RESET);
    }
}
