/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author USUARIO
 */
public class Cliente {
    
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta; // asociación bidireccional

    public Cliente() {
    }
    
    

    public Cliente(String nombre, String dni, TarjetaDeCredito tarjeta) {
        this.nombre = nombre;
        this.dni = dni;
        this.tarjeta = tarjeta;
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
     * @return the tarjeta
     */
    public TarjetaDeCredito getTarjeta() {
        return tarjeta;
    }

    /**
     * @param tarjeta the tarjeta to set
     */
    public void setTarjeta(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", dni=" + dni + ", tarjeta=" + tarjeta + '}';
    }
    
    
    
}
