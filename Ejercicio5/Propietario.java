/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author Gianina
 */
public class Propietario {
    
    private String nombre;
    private String dni;
    private Computadora computadora; // asociación bidireccional

    public Propietario() {
    }

    public Propietario(String nombre, String dni, Computadora computadora) {
        this.nombre = nombre;
        this.dni = dni;
        this.computadora = computadora;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the computadora
     */
    public Computadora getComputadora() {
        return computadora;
    }

    /**
     * @param computadora the computadora to set
     */
    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    @Override
    public String toString() {
        return "Propietario{" + "nombre=" + nombre + ", dni=" + dni + ", computadora=" + computadora + '}';
    }
    
    
    
}
