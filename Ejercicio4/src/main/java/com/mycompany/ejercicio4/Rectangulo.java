/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio4;

/**
 *
 * @author HP
 */
public class Rectangulo implements FiguraGeométrica {
    private double ancho;
    private double alto;

    public Rectangulo (double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double area() {
        return ancho * alto; // Area = ancho * alto
    }

    @Override
    public double perimetro() {
        return 2 * (ancho + alto); // Perimetro = 2 * (ancho + alto)
    }
    
}
