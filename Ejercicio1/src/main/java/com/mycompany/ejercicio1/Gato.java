/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author HP
 */
public class Gato implements Animal{

    @Override
    public void hacerSonido() {
        System.out.println("El gato maulla: ¡Miau!");
    }

    @Override
    public void mover() {
        System.out.println("El gato salta.");
    }
}
