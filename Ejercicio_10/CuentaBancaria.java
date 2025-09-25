/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_10;

/**
 *
 * @author Gianina
 */
public class CuentaBancaria {
    
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave;  // composición
    private Titular titular;        // asociación bidireccional

    public CuentaBancaria(String cbu, double saldo, ClaveSeguridad clave, Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = clave;
        this.titular = titular;
    }

    /**
     * @return the cbu
     */
    public String getCbu() {
        return cbu;
    }

    /**
     * @param cbu the cbu to set
     */
    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the clave
     */
    public ClaveSeguridad getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(ClaveSeguridad clave) {
        this.clave = clave;
    }

    /**
     * @return the titular
     */
    public Titular getTitular() {
        return titular;
    }

    /**
     * @param titular the titular to set
     */
    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "cbu=" + cbu + ", saldo=" + saldo + ", clave=" + clave + ", titular=" + titular + '}';
    }

    
}
