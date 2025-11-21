package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>(List.of(
                new Producto("P01", "Camiseta", 100.00),
                new Producto("P02", "Zapatilla", 200.00),
                new Producto("P03", "Mate", 150.00)
        ));

        System.out.println("Lista inicial:\n"+ productos);
        System.out.println("-Creo un nuevo producto con un codigo REPETIDO e intento agregarlo a la lista)");
        Producto prodDuplicado = new Producto("P01", "Camiseta",100.00);
        if (productos.contains(prodDuplicado)) {
            System.out.println("El producto ya existe en la lista");
        }else{
            productos.add(prodDuplicado);
            System.out.println("Producto agregado correctamente");
        }

        System.out.println("-Creo un nuevo producto con un codigo NUEVO e intento agregarlo a la lista)");
        Producto prodNuevo = new Producto("P04", "Termo",90.00);
        if (productos.contains(prodNuevo)) {
            System.out.println("El producto ya existe en la lista");
        }else{
            productos.add(prodNuevo);
            System.out.println("Producto agregado correctamente");
        }

        System.out.println("Imprimo la lista: \n" +
                productos);
    }

}
