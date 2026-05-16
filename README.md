# Biblioteca Smart - Sistema di Gestione Biblioteca

Progetto per l'esame di **Ingegneria del Software**.
Il sistema informatizza i processi principali di una biblioteca universitaria, specificamente la consultazione del catalogo (UC1) e la gestione del prestito (UC2).

## Funzionalità (Casi d'Uso)

Il sistema implementa i seguenti casi d'uso principali:
* **UC1 - Ricerca Libro**: Verifica della presenza di un titolo nel catalogo con supporto a ricerche parziali.
* **UC2 - Richiesta Prestito**: Gestione dell'assegnazione di un libro a un utente con controllo di disponibilità.

## Struttura del Progetto

In base all'organizzazione attuale del repository:

```text
PROGETTO_INGEGNERIA/
├── docs/                   # Documentazione ufficiale (LaTeX e PDF)
│   ├── requisiti.pdf       # Relazione finale
│   └── requisiti.tex       # Sorgenti LaTeX
├── src/                    # Codice sorgente Java e Test JUnit
│   ├── main/               # Classi di produzione del modello Java
│   └── test/               # Classi di test unitari JUnit 5
├── uml/                    # Diagrammi delle classi e dei casi d'uso
├── .gitignore              # Configurazione per escludere file temporanei
├── pom.xml                 # Configurazione Maven e Plugin
└── README.md               # Questa guida


```

## Contributi e Sviluppo

In conformità con le specifiche d'esame per lo scope di un **gruppo da 1 persona**:

* **Sviluppatore Unico:** Marco Mattioni
* **Contributo:** Analisi dei requisiti in LaTeX, modellazione dei diagrammi UML, implementazione del codice sorgente Java e stesura dei test unitari (flussi positivi e di errore per UC1 e UC2).

## Prerequisiti e Riproducibilità

Garantisce la riproducibilità e l'esecuzione dell'ambiente di build:

* **Java Development Kit (JDK):** Versione 21.
* **Strumento di Build:** Apache Maven 3.x.

### Comando unico di compilazione e test

Eseguire dalla bash o dal terminale integrato di VS Code:

```bash
mvn clean test site
