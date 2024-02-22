package org.example;

public class Pieza {
    private String nombre;
    private int codigo;
    private String pais;
    private int cant;
    private double precio;

    public Pieza(String nombre, int codigo, String pais, int cant, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.pais = pais;
        this.cant = cant;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getPais() {
        return pais;
    }

    public int getCant() {
        return cant;
    }

    public double getPrecio() {
        return precio;
    }
}
