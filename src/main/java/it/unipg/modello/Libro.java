package it.unipg.modello;

/**
 * La classe Libro rappresenta un volume all'interno della biblioteca.
 * Rispetta il principio SOLID di Single Responsibility (SRP) gestendo esclusivamente 
 * i dati e lo stato di disponibilità del singolo volume.
 * * @author Marco
 * @version 1.0.0
 */
public class Libro {
    /** Codice ISBN univoco del libro. */
    private String isbn;
    /** Titolo del volume. */
    private String titolo;
    /** Autore del volume. */
    private String autore;
    /** Stato di disponibilità del libro (true se disponibile, false se in prestito). */
    private boolean disponibile;

    /**
     * Costruttore della classe Libro. 
     * Di default, un nuovo libro inserito è impostato come disponibile.
     * * @param isbn Codice ISBN del libro.
     * @param titolo Titolo del libro.
     * @param autore Autore del libro.
     */
    public Libro(String isbn, String titolo, String autore) {
        this.isbn = isbn;
        this.titolo = titolo;
        this.autore = autore;
        this.disponibile = true; 
    }

    /** @return Il codice ISBN del libro. */
    public String getIsbn() { return isbn; }

    /** @return Il titolo del libro. */
    public String getTitolo() { return titolo; }

    /** @return L'autore del libro. */
    public String getAutore() { return autore; }
    
    /** * Verifica se il libro è attualmente disponibile per il prestito.
     * @return {@code true} se disponibile, {@code false} altrimenti. 
     */
    public boolean isDisponibile() { return disponibile; }
    
    /** * Aggiorna lo stato di disponibilità del libro.
     * @param disponibile Nuovo stato di disponibilità.
     */
    public void setDisponibile(boolean disponibile) {
        this.disponibile = disponibile;
    }

    /**
     * Restituisce una rappresentazione testuale dell'oggetto Libro.
     * @return Stringa contenente i dettagli del libro.
     */
    @Override
    public String toString() {
        return "Libro [ISBN=" + isbn + ", Titolo=" + titolo + ", Disponibile=" + disponibile + "]";
    }
}