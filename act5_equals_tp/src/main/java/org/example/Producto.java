package org.example;

public class Producto {

    String codigo;
    String nombre;
    double precio;

    public Producto(String codigo, String nombre, double precio){
        this.codigo=codigo;
        this.nombre=nombre;
        this.precio=precio;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Producto producto = (Producto) obj;
        return codigo != null & codigo.equals(producto.codigo);
    }

    @Override
    public int hashCode(){
        return codigo!= null ? codigo.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo +
                ", nombre='" + nombre +
                ", precio=" + precio +
                "}\n";
    }
}