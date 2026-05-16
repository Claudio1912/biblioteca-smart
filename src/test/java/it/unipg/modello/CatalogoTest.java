package it.unipg.modello;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Classe di test per {@link Catalogo}.
 * Verifica la corretta implementazione della ricerca libri (UC1).
 * * @author Marco
 */
public class CatalogoTest {

    /**
     * Test del flusso positivo per UC1.
     * Verifica che la ricerca restituisca un libro presente usando un titolo parziale.
     */
    @Test
    void testRicercaLibroEsistente() {
        Catalogo catalogo = new Catalogo();
        Libro l = new Libro("111", "Java 21", "Autore");
        catalogo.aggiungiLibro(l);
        
        assertTrue(catalogo.cercaPerTitolo("Java").isPresent(), "Il libro dovrebbe essere trovato");
    }

    /**
     * Test del flusso di errore per UC1.
     * Verifica che la ricerca non restituisca risultati se il titolo non è in catalogo.
     */
    @Test
    void testRicercaLibroInesistente() {
        Catalogo catalogo = new Catalogo();
        assertFalse(catalogo.cercaPerTitolo("Ingegneria").isPresent(), "Non dovrebbe trovare nulla");
    }
}