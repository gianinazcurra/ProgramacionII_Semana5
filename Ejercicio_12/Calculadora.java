/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_12;

/**
 *
 * @author Gianina
 */
public class Calculadora {
    
    // Método con dependencia de uso:
    public void calcular(Impuesto impuesto) {
        System.out.println("Calculo del impuesto para: " + impuesto.getContribuyente().getNombre() +
                           ", monto: " + impuesto.getMonto());
    }
}
