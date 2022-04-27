package com.example.proyectocompra;

public class Clientes {
    private String nombre;
    private String domicilio;
    private String email;
    private Integer saldo;

    public Clientes(String nombre, String domicilio, String email, Integer saldo) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.email = email;
        this.saldo = saldo;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getDomicilio() {
        return this.domicilio;
    }
    public String getCorreoElectronico() {
        return this.email;
    }
    public Integer getSaldo() {
        return this.saldo;
    }


}
