/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6;

/**
 *
 * @author HP
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        ListaNumeros lista = new ListaNumeros();
        
        // Agregar números a la lista
        lista.agregarNumero(6);
        lista.agregarNumero(2);
        lista.agregarNumero(4);
        lista.agregarNumero(1);
        lista.agregarNumero(9);

        System.out.println("Antes de ordenar:");
        lista.mostrarNumeros(); // Muestra la lista antes de ordenar

        lista.ordenar(); // Ordena la lista

        System.out.println("Despues de ordenar:");
        lista.mostrarNumeros(); // Muestra la lista despues de ordenar
    }
}
