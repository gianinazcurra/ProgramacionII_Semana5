
package Ejercicio1;

/**
 *
 * @author Gianina
 */
public class Pasaporte {
    
    private String numeroPasaporte;
    private int fechaEmision; 
    private Foto foto;

    public Pasaporte() {
    }

    public Pasaporte(String numeroPasaporte, int fechaEmision, Foto foto) {
        this.numeroPasaporte = numeroPasaporte;
        this.fechaEmision = fechaEmision;
        this.foto = foto;
    }

    public Pasaporte(String numeroPasaporte, int fechaEmision) {
        this.numeroPasaporte = numeroPasaporte;
        this.fechaEmision = fechaEmision;
    }

    /**
     * @return the numeroPasaporte
     */
    public String getNumeroPasaporte() {
        return numeroPasaporte;
    }

    /**
     * @param numeroPasaporte the numeroPasaporte to set
     */
    public void setNumeroPasaporte(String numeroPasaporte) {
        this.numeroPasaporte = numeroPasaporte;
    }

    /**
     * @return the fechaEmision
     */
    public int getFechaEmision() {
        return fechaEmision;
    }

    /**
     * @param fechaEmision the fechaEmision to set
     */
    public void setFechaEmision(int fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    /**
     * @return the foto
     */
    public Foto getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(Foto foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Pasaporte{" + "numeroPasaporte=" + numeroPasaporte + ", fechaEmision=" + fechaEmision + ", foto=" + foto + '}';
    }
    
    
}
