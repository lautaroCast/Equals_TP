package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Producto> productos = new HashSet<>();

        productos.add(new Producto("01","camiseta",70.00));
        productos.add(new Producto("02","jeans",80.00));
        productos.add(new Producto("03","zapatillas",90.00));
        productos.add(new Producto("01","camiseta",70.00)); //repetido
        productos.add(new Producto("04","camisa",85.00));
        productos.add(new Producto("05","Mochila",60.00));
        productos.add(new Producto("03","zapatillas",90.00)); //repetido
        productos.add(new Producto("01","camiseta",70.00)); //repetido
        productos.add(new Producto("06","bolso",55.00));

        System.out.println(productos);


    }
}