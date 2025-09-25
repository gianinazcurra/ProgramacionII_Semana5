/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_11;

/**
 *
 * @author Gianina
 */
public class Reproduccion {

    //metodo con dependencia de uso
    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo la canción: " + cancion.getTitulo()
                + " de " + cancion.getArtista().getNombre());
    }

}
