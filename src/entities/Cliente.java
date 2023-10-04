package entities;

import java.util.Date;

public class Cliente {
    private int codiceCliente;
    private String nome;
    private String cognome;
    private String email;
    private Date dataIscrizione;


    public Cliente(int CodiceCliente, String nome, String cognome, String email, Date dataIscrizione) {
        this.codiceCliente = codiceCliente;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }

    public int getCodiceCliente() {
        return codiceCliente;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getEmail() {
        return email;
    }

    public Date getDate() {
        return dataIscrizione;
    }

}
