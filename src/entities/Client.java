package src.entities;

public class Client {

    //TODO mettiamo un po di funzionalità?

private  String id;
    private String name;
    private String surname;
    private String email;
    private String telephone;

    /**
     * Costruttore per la classe Client.
     * @param name il nome del cliente
     * @param email l'indirizzo email del cliente
     * @param telephone il numero di telefono del cliente
     */
    public Client(String id, String name,String surname, String email, String telephone) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.telephone = telephone;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Restituisce il nome del cliente.
     * @return il nome del cliente
     */
    public String getName() {
        return name;
    }

    /**
     * Imposta il nome del cliente.
     * @param name il nome del cliente
     */
    public void setName(String name) {
        this.name = name;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Restituisce l'indirizzo email del cliente.
     * @return l'indirizzo email del cliente
     */
    public String getEmail() {
        return email;
    }

    /**
     * Imposta l'indirizzo email del cliente.
     * @param email l'indirizzo email del cliente
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Restituisce il numero di telefono del cliente.
     * @return il numero di telefono del cliente
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Imposta il numero di telefono del cliente.
     * @param telephone il numero di telefono del cliente
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
