/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

import java.time.LocalDate;

/**
 *
 * @author Gianina
 */
public class FirmaDigital {
    
      private String codigoHash;
    private LocalDate fecha;
    private Usuario usuario; // agregación

    public FirmaDigital(String codigoHash, LocalDate fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    /**
     * @return the codigoHash
     */
    public String getCodigoHash() {
        return codigoHash;
    }

    /**
     * @param codigoHash the codigoHash to set
     */
    public void setCodigoHash(String codigoHash) {
        this.codigoHash = codigoHash;
    }

    /**
     * @return the fecha
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
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
        return "FirmaDigital{" + "codigoHash=" + codigoHash + ", fecha=" + fecha + ", usuario=" + usuario + '}';
    }
    
    
}
