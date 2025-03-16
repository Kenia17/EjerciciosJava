/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio10;

/**
 *
 * @author HP
 */
public class DescuentoPorcentaje implements Descontable {
    private double porcentaje;

    public DescuentoPorcentaje (double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double calcularDescuento(double precio) {
        return precio * (porcentaje / 100);
    }
    
}
