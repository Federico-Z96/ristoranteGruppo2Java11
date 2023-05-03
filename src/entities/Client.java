package src.entities;

public class Client {
       private String name;
       private String email;
       private String telephone;

    public Client(String name, String email, String telephone) {
        this.name = name;
        this.email = email;
        this.telephone = telephone;
    }
    /* Classe Client

     costruttore che contiene
        name --> nome del cliente
        email --> email del cliente
        telephone --> numero di telefono del cliente

     Getter e Setter dei precedenti attributi */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}

