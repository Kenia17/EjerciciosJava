/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;

/**
 *
 * @author HP
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        
        Pago pagoTarjeta = new PagoConTarjeta();
        Pago pagoEfectivo = new PagoConEfectivo();

        pagoTarjeta.procesarPago(80.0);   // Salida: Procesando pago con tarjeta de: 80.0 dolares.
        pagoEfectivo.procesarPago(40.0);   // Salida: Procesando pago en efectivo de: 40.0 dolares.
    }
}
