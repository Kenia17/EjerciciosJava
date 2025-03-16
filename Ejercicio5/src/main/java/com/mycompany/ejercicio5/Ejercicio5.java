/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;

/**
 *
 * @author HP
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Trabajador desarrollador = new Desarrollador();
        Trabajador diseñador = new Diseñador();

        desarrollador.trabajar(); // Salida: El desarrollador está escribiendo un código.
        diseñador.trabajar(); // Salida: El diseñador está creando un nuevo diseño.
    }
}
