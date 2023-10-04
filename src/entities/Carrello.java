package entities;

public class Carrello {
    private String clienteAssociato;
    private String[] articoli;
    private long costoTotale;

    public Carrello(String clienteAssociato, String[] articoli, long costoTotale) {
        this.clienteAssociato = clienteAssociato;
        this.articoli = articoli;
        this.costoTotale = costoTotale;

    }

    public String getClienteAssociato() {
        return clienteAssociato;
    }

    public String[] getArticoli() {
        return articoli;
    }

    public long getCostoTotale() {
        return costoTotale;
    }
}
