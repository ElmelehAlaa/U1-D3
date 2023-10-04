package entities;

public class Sim {
    private long numeroTelefono;
    private int creditoResiduo;
    private String[] ultimeChiamate;

    public Sim(long numeroTelefono, int creditoResiduo, String[] ultimeChiamate) {
        this.numeroTelefono = numeroTelefono;
        this.creditoResiduo = creditoResiduo;
        this.ultimeChiamate = ultimeChiamate;
    }

    public long getNumero() {
        return numeroTelefono;

    }

    public int getCredito() {

        return creditoResiduo;
    }

    public String[] getChiamate() {
        return ultimeChiamate;
    }

    public Sim(long numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.creditoResiduo = 0;
        this.ultimeChiamate = new String[]{" Nessuna Chiamata"};
    }

}
