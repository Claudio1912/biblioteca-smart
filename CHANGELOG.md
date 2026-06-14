## [0.1.0] - 2026-05-07

### Aggiunto
- Inizializzazione della struttura di cartelle secondo lo standard industriale **Maven Standard Directory Layout**.
- Configurazione iniziale del file `pom.xml` con supporto a Java 21 e inserimento della suite di test **JUnit 5** in ambito `<scope>test</scope>`.
- Scrittura delle classi di test unitari `LibroTest.java` e `CatalogoTest.java` in `src/test/java` per la verifica immediata dei comportamenti logici (approccio orientato alla qualità).
- Definizione della classe di dominio base `Libro.java` dotata di incapsulamento dei campi (`private`), gestione dello shadowing nel costruttore tramite `this` e override di `toString()`.
- Creazione della cartella `uml/` contenente i file sorgenti PlantUML (`.puml`) e le relative esportazioni in immagini (`.png`) del Diagramma delle Classi e del Diagramma dei Casi d'Uso.
- Scrittura manuale in **LaTeX** della prima sezione della relazione tecnica dentro la cartella `documenti/`, compilata successivamente in `relazione.pdf`.
- Inserimento del file `.gitignore` per escludere la cartella di build `target/` dal tracciamento del repository Git.