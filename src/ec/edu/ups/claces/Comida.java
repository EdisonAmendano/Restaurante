
package ec.edu.ups.claces;

/**
 * Comida
 * Se llevarara el contro de la comida
 * @author Edison
 */
public class Comida {
    private String nombre;
    private String tipo;
    private double precio;

    public String getNombre() {
        /**
         * getNombre
         * En este metodo se obtendra el nombre de la comida
         * @author Edison
         */
        return nombre;
    }

    public void setNombre(String nombre) {
        /**
         * setNombre
         * En este metodo se establecera el nombre de la comida
         * @author Edison
         */
        this.nombre = nombre;
    }

    public String getTipo() {
        /**
         * getTipo
         * En este metodo se obtendra el tipo de comida
         * @author Edison
         */
        return tipo;
    }

    public void setTipo(String tipo) {
        /**
         * setTipo
         * En este metodo se establecera el tipo de comida
         * @author Edison
         */
        this.tipo = tipo;
    }

    public double getPrecio() {
        /**
         * getPrecio
         * En este metodo se obtendra el preico de la comida
         * @author Edison
         */
        return precio;
    }

    public void setPrecio(double precio) {
        /**
         * setPrecio
         * En este metodo se establecera el preico de la comida
         * @author Edison
         */
        this.precio = precio;
    }

    
    public int comprar(){
        /**
         * comprar
         * En este metodo se ara la compra de la comida
         * @author Edison
         */
        return 1;
    }
    public void asignarPlato(int index){
        /**
         * asiganarPlato
         * En este metodo se asignara a o los platos la comida
         * @author Edison
         */
    } 
    public void ingresarInformacionNutricional(int index){
        /**
         * ingresarInformacionNutricional
         * En este metodo se ingresara los repectivos valores de la comida
         * @author Edison
         */
    }

    @Override
    public String toString() {
        return "\ntoString:\nComida{" + "nombre=" + nombre + ", tipo=" + tipo + ", precio=" + precio + '}';
    }
    
}
