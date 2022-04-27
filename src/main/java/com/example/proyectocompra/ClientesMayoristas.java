package com.example.proyectocompra;

public class ClientesMayoristas {
    private String nombreMayorista;
    private String direccionMayorista;
    private String emailMayorista;

    public ClientesMayoristas(String nombreMayorista, String direccionMayorista, String emailMayorista) {
        this.nombreMayorista = nombreMayorista;
        this.direccionMayorista = direccionMayorista;
        this.emailMayorista = emailMayorista;
    }
    public String getNombreMayorista() {
        return this.nombreMayorista;
    }
    public String getDireccionMayorista() {
        return this.direccionMayorista;
    }
    public String getEmailMayorista() {
        return this.emailMayorista;
    }
}
