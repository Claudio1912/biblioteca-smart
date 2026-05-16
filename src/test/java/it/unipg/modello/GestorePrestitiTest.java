package it.unipg.modello;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

/**
 * Classe di test per {@link GestorePrestiti}.
 * Copre i flussi principali richiesti dal caso d'uso UC2 (Richiesta Prestito).
 * * @author Marco
 */
public class GestorePrestitiTest {

    private GestorePrestiti gestore;
    private Libro libro;
    private Utente utente1;
    private Utente utente2;

    /**
     * Inizializzazione dell'ambiente di test prima di ogni metodo.
     */
    @BeforeEach
    void setUp() {
        gestore = new GestorePrestiti();
        libro = new Libro("12345", "Ingegneria del Software", "Ian Sommerville");
        utente1 = new Utente("U001", "Marco");
        utente2 = new Utente("U002", "Luca");
    }

    /**
     * Test del flusso positivo per UC2.
     * Verifica che il prestito vada a buon fine se il libro è disponibile.
     */
    @Test
    void testPrestitoSuccesso() {
        boolean risultato = gestore.registraPrestito(utente1, libro);
        assertTrue(risultato, "Il prestito dovrebbe essere autorizzato");
        assertFalse(libro.isDisponibile(), "Il libro non dovrebbe più essere disponibile");
    }

    /**
     * Test del flusso di errore per UC2.
     * Verifica che il prestito fallisca se il libro è già impegnato da un altro utente.
     */
    @Test
    void testPrestitoLibroGiaOccupato() {
        gestore.registraPrestito(utente1, libro);
        boolean risultato = gestore.registraPrestito(utente2, libro);
        
        assertFalse(risultato, "Il prestito deve fallire se il libro è già impegnato");
        assertFalse(libro.isDisponibile(), "Il libro deve rimanere nello stato non disponibile");
    }
}