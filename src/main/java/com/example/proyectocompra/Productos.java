package com.example.proyectocompra;

public class Productos {
    private String tipoDeProducto;
    private Integer precioUnitario;
    private Integer cantidadDeProducto;
    private Integer precioTotal;

    public Productos(String tipoDeProducto, Integer precioUnitario, Integer cantidadDeProducto) {
        this.tipoDeProducto = tipoDeProducto;
        this.precioUnitario = precioUnitario;
        this.cantidadDeProducto = cantidadDeProducto;
        this.precioTotal = cantidadDeProducto * precioUnitario;
    }
    public String getTipoDeProducto() {
        return this.tipoDeProducto;
    }
    public Integer getPrecioUnitario() {
        return this.precioUnitario;
    }
    public Integer getCantidadDeProducto() {
        return this.cantidadDeProducto;
    }
    public Integer getPrecioTotal() {
        return this.precioTotal;
    }
}
