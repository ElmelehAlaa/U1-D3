package entities;

public class Articolo {
    private int codice;
    private String descrizione;
    private int prezzo;
    private int numeroPezzi;

    public Articolo(int codice, String descrizione, int prezzo, int numeroPezzi) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.numeroPezzi = numeroPezzi;
    }

    public int getCodice() {
        return codice;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public int getNumeroPezzi() {
        return numeroPezzi;
    }
}
