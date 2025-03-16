/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio7;

/**
 *
 * @author HP
 */
public class Ejercicio7 {

    public static void main(String[] args) {
       Alimentación persona = new Persona();
        Alimentación animal = new Animal();

        persona.comer(); // Salida: La persona esta comiendo pollo.
        animal.comer();  // Salida: El animal esta comiendo su alimento.
    }
}
