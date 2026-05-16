package it.unipg.modello;

/**
 * La classe Utente rappresenta un iscritto alla biblioteca abilitato ai servizi di prestito.
 * * @author Marco
 * @version 1.0.0
 */
public class Utente {
    /** Identificativo univoco dell'utente. */
    private String idUtente;
    /** Nome e cognome dell'utente. */
    private String nome;

    /**
     * Costruttore della classe Utente.
     * * @param idUtente Codice identificativo univoco.
     * @param nome Nome dell'iscritto.
     */
    public Utente(String idUtente, String nome) {
        this.idUtente = idUtente;
        this.nome = nome;
    }

    /** @return L'ID univoco dell'utente. */
    public String getIdUtente() { return idUtente; }

    /** @return Il nome dell'utente. */
    public String getNome() { return nome; }

    /**
     * Restituisce una rappresentazione testuale dell'oggetto Utente.
     * @return Stringa contenente i dettagli dell'utente.
     */
    @Override
    public String toString() {
        return "Utente [ID=" + idUtente + ", Nome=" + nome + "]";
    }
}