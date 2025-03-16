/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio9;

/**
 *
 * @author HP
 */
public class Producto implements ComparableObjeto {
    private double precio;

    public Producto (double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public int comparar(Object o) {
        if (o instanceof Producto) {
            Producto otroProducto = (Producto) o;
            return Double.compare(this.precio, otroProducto.precio);
        }
        throw new IllegalArgumentException("El objeto no es un Producto");
    }
    
}
