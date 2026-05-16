package it.unipg.modello;

import java.time.LocalDate;

/**
 * La classe GestorePrestiti implementa la logica di business per la gestione 
 * dei prestiti dei volumi (Caso d'Uso 2).
 * * Rispetta il principio SOLID di Single Responsibility (SRP) gestendo 
 * esclusivamente le transazioni tra utenti e libri.
 * * @author Marco
 * @version 1.0.0
 */
public class GestorePrestiti {

    /**
     * Tenta di registrare un nuovo prestito nel sistema.
     * * Implementa il criterio di accettazione per cui il prestito deve fallire 
     * se il libro non è attualmente disponibile.
     * * @param utente L'oggetto {@link Utente} che richiede il volume.
     * @param libro L'oggetto {@link Libro} richiesto per il prestito.
     * @return {@code true} se il prestito è registrato con successo; 
     * {@code false} se il libro risulta già occupato.
     */
    public boolean registraPrestito(Utente utente, Libro libro) {
        if (libro.isDisponibile()) {
            // Logica di business: aggiornamento dello stato del libro
            libro.setDisponibile(false);
            
            System.out.println("PRESTITO CONFERMATO:");
            System.out.println("Utente: " + utente.getNome());
            System.out.println("Libro: " + libro.getTitolo());
            System.out.println("Data: " + LocalDate.now());
            
            return true;
        } else {
            System.out.println("ERRORE: Il libro '" + libro.getTitolo() + "' è già in prestito.");
            return false;
        }
    }

    /**
     * Gestisce la procedura di restituzione di un volume.
     * Ripristina la disponibilità del libro nel catalogo.
     * * @param libro Il {@link Libro} che viene riconsegnato alla biblioteca.
     */
    public void restituisciLibro(Libro libro) {
        libro.setDisponibile(true);
        System.out.println("Il libro '" + libro.getTitolo() + "' è tornato disponibile.");
    }
}