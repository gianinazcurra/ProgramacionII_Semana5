
package Ejercicio1;

/**
 *
 * @author Gianina
 */
public class Foto {
    
    private String imagen;
    private String formato;

    public Foto() {
    }

    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }

    /**
     * @return the imagen
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    /**
     * @return the formato
     */
    public String getFormato() {
        return formato;
    }

    /**
     * @param formato the formato to set
     */
    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "Foto{" + "imagen=" + imagen + ", formato=" + formato + '}';
    }
    
    
}
