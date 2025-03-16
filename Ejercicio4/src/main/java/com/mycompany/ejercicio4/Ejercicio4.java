/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;

/**
 *
 * @author HP
 */
public class Ejercicio4 {

    public static void main(String[] args) {
      
        FiguraGeométrica Circulo = new Circulo(6.0);
        FiguraGeométrica Rectangulo = new Rectangulo(4.0, 8.0);

        System.out.printf("Area del circulo: %.2f\n", Circulo.area()); // Salida: Area del circulo: 113.10
        System.out.printf("Perimetro del circulo: %.2f\n", Circulo.perimetro()); // Salida: Perimetro del circulo: 37.70

        System.out.printf("Area del rectangulo: %.2f\n", Rectangulo.area()); // Salida: Area del rectangulo: 32.00
        System.out.printf("Perimetro del rectangulo: %.2f\n", Rectangulo.perimetro()); // Salida: Perimetro del rectangulo: 24.00
    }
}
