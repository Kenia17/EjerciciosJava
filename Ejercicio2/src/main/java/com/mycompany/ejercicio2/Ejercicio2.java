/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

/**
 *
 * @author HP
 */
public class Ejercicio2 {

    public static void main(String[] args) {
       Vehículo Coche = new Coche();
        Vehículo Bicicleta = new Bicicleta();

        Coche.arrancar();   // Salida: El coche ha arrancado.
        Coche.detener();    // Salida: El coche se ha detenido.

        Bicicleta.arrancar(); // Salida: La bicicleta ha comenzado a moverse.
        Bicicleta.detener();  // Salida: La bicicleta se ha detenido.
    }
}
