/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Gianina
 */
public class Celular {
    
    private String IMEI;
    private String marca;
    private String modelo;
     private Bateria bateria; // agregación
    private Usuario usuario; // asociación bidireccional

    public Celular(String IMEI, String marca, String modelo, Bateria bateria, Usuario usuario) {
        this.IMEI = IMEI;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        this.usuario = usuario;
    }


    public Celular() {
    }

    public Celular(String IMEI, String marca, String modelo) {
        this.IMEI = IMEI;
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * @return the IMEI
     */
    public String getIMEI() {
        return IMEI;
    }

    /**
     * @param IMEI the IMEI to set
     */
    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the bateria
     */
    public Bateria getBateria() {
        return bateria;
    }

    /**
     * @param bateria the bateria to set
     */
    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Celular{" + "IMEI=" + IMEI + ", marca=" + marca + ", modelo=" + modelo + ", bateria=" + bateria + ", usuario=" + usuario + '}';
    }
    
    
    
}
