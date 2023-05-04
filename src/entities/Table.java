package src.entities;

public class Table {
    private int id;
    private int size;

    /**
     La classe Table rappresenta un tavolo all'interno di un ristorante.
     *@param id l'identificativo del tavolo.
     *@param size la dimensione del tavolo, ovvero il numero di persone che può ospitare.
     */

    public Table(int id, int size) {
        this.id = id;
        this.size = size;
    }

    /**
     Questo metodo restituisce l'identificativo del tavolo.
     *@return l'identificativo del tavolo.
     */
    public int getId() {
        return id;
    }

    /**
     Questo metodo imposta l'identificativo del tavolo.
     *@param id il nuovo identificativo da impostare.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     Questo metodo restituisce la dimensione del tavolo.
     *@return la dimensione del tavolo, ovvero il numero di persone che può ospitare.
     */
    public int getSize() {
        return size;
    }

    /**
     Questo metodo imposta la dimensione del tavolo.
     *@param size la nuova dimensione da impostare, ovvero il numero di persone che il tavolo può ospitare.
     */
    public void setSize(int size) {
        this.size = size;
    }
}