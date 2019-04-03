
package ec.edu.ups.claces;

/**
 * EqupiCocina
 * Se llevara el contro de los equipos de cociona
 * @author Edison
 */
public class EquipoCocina {
    private String nombre;
    private double precio;
    private double peso;

    public String getNombre() {
        /**
         * getNombre
         * En este metodo se obtendra el nombre del equipo
         * @author Edison
         */
        return nombre;
    }

    public void setNombre(String nombre) {
        /**
         * setNombre
         * En este metodo se establecera el nombre del equipo
         * @author Edison
         */
        this.nombre = nombre;
    }

    public double getPrecio() {
        /**
         * getPrecio
         * En este metodo se obtendra el precio del equipo
         * @author Edison
         */
        return precio;
    }

    public void setPrecio(double precio) {
        /**
         * setPrecio
         * En este metodo se establecera el precio del equipo
         * @author Edison
         */
        this.precio = precio;
    }

    public double getPeso() {
        /**
         * getPeso
         * En este metodo se obtendra el peso del equipo
         * @author Edison
         */
        return peso;
    }

    public void setPeso(double peso) {
        /**
         * setPeso
         * En este metodo se establecera el peso del equipo
         * @author Edison
         */
        this.peso = peso;
    }
    
    
    
    public int comprar(){
        /**
         * comprar
         * En este metodo se comprara el equipo
         * @author Edison
         */
        return 1;
    }
    public void asignarUtilidad(int index){
        /**
         * asignarUtilidado
         * En este metodo se asiganra el uso que se va a dar al equipo
         * @author Edison
         */
        
    }
    public void comprobarEstado(int index){
        /**
         * comprobarEstado
         * En este metodo se comprobara el estado del equipo
         * @author Edison
         */
    }

    @Override
    public String toString() {
        return "\ntoString:\nEquipoCocina{" + "nombre=" + nombre + ", precio=" + precio + ", peso=" + peso + '}';
    }
    
        
}
