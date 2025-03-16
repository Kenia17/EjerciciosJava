/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio8;

/**
 *
 * @author HP
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        Notificable correo = new CorreoElectronico();
        Notificable sms = new SMS();

        correo.enviarNotificación(); // Salida: Enviando notificación por correo electronico.
        sms.enviarNotificación();     // Salida: Enviando notificación por SMS.
    }
}
