package it.unipg.modello;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * La classe Catalogo gestisce l'intera collezione di libri della biblioteca.
 * Implementa la logica di business relativa alla ricerca dei volumi (Caso d'Uso 1).
 * * @author Marco
 * @version 1.0.0
 */
public class Catalogo {
    
    /**
     * Elenco interno dei libri registrati nel sistema.
     */
    private List<Libro> libri;

    /**
     * Costruttore della classe. Inizializza un nuovo catalogo vuoto.
     */
    public Catalogo() {
        this.libri = new ArrayList<>();
    }

    /**
     * Aggiunge un nuovo libro alla collezione del catalogo.
     * Utilizzato principalmente per il popolamento iniziale del sistema.
     * * @param libro L'istanza dell'oggetto {@link Libro} da inserire.
     */
    public void aggiungiLibro(Libro libro) {
        libri.add(libro);
    }

    /**
     * Esegue una ricerca all'interno del catalogo basata sul titolo del libro.
     * La ricerca è case-insensitive e supporta titoli parziali per soddisfare 
     * i criteri di accettazione richiesti.
     * * @param titolo La stringa o parte di essa da ricercare tra i titoli dei libri.
     * @return Un {@link Optional} contenente il primo libro corrispondente trovato, 
     * altrimenti un Optional vuoto se non ci sono corrispondenze.
     */
    public Optional<Libro> cercaPerTitolo(String titolo) {
        return libri.stream()
            .filter(l -> l.getTitolo().toLowerCase().contains(titolo.toLowerCase()))
            .findFirst();
    }
    // PROVA
    /**
     * Restituisce una copia dell'elenco completo di tutti i libri presenti nel catalogo.
     * * @return Una {@link List} contenente tutti i libri registrati.
     */
    public List<Libro> getTuttiILibri() {
        return new ArrayList<>(libri);
    }
}