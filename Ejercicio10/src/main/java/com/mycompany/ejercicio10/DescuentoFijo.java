/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio10;

/**
 *
 * @author HP
 */
public class DescuentoFijo implements Descontable {
    private double cantidadFija;

    public DescuentoFijo (double cantidadFija) {
        this.cantidadFija = cantidadFija;
    }

    @Override
    public double calcularDescuento(double precio) {
        return cantidadFija;
    }
    
}
