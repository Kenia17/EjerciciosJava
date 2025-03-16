/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3;

/**
 *
 * @author HP
 */
public class PagoConEfectivo implements Pago {
    @Override
    public void procesarPago(double cantidad) {
        System.out.println("Procesando pago en efectivo de: " + cantidad + " Dolares.");
    }
    
}
