package it.omicron.academy.mongodb.utils;

/**
 * Enum che contiene tutti i nomi dei campi dei documenti che sono/verranno inseriti nella collection {@code utenti}
 */
public enum Utente {
    ID("_id"),
    NOME("nome"),
    COGNOME("cognome"),
    ETA("eta"),
    NOTE("note");

    private final String nomeCampo;

    Utente(String nomeCampo) {
        this.nomeCampo = nomeCampo;
    }

    public String getNomeCampo() {
        return nomeCampo;
    }
}
