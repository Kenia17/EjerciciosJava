/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio10;

/**
 *
 * @author HP
 */
public class Ejercicio10 {

    public static void main(String[] args) {
       Descontable descuentoPorcentaje = new DescuentoPorcentaje(20); // 20%
        Descontable descuentoFijo = new DescuentoFijo(50); // $50

        double precioOriginal = 100; // Precio original de $100

        double descuento1 = descuentoPorcentaje.calcularDescuento(precioOriginal);
        double descuento2 = descuentoFijo.calcularDescuento(precioOriginal);

        System.out.println("Descuento por porcentaje: $" + descuento1); // Salida: Descuento por porcentaje: $20.0
        System.out.println("Descuento fijo: $" + descuento2); // Salida: Descuento fijo: $50.0
    }
}
