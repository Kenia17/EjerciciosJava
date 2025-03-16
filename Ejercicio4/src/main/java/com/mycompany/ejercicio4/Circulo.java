/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio4;

/**
 *
 * @author HP
 */
public class Circulo implements FiguraGeométrica {
    private double radio;

    public Circulo (double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * radio * radio; // Area = π * r²
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio; // Perimetro = 2 * π * r
    }
    
}
