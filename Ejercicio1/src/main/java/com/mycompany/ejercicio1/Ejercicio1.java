/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

/**
 *
 * @author HP
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Animal miPerro = new Perro();
        Animal miGato = new Gato();

        miPerro.hacerSonido(); // Salida: El perro ladra: ¡Guau!
        miPerro.mover();       // Salida: El perro corre.

        miGato.hacerSonido();  // Salida: El gato maúlla: ¡Miau!
        miGato.mover();        // Salida: El gato salta.
    }
}
