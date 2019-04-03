
package ec.edu.ups.claces;

/**
 * Sucursal
 * Se ara la organisacion del restaurante
 * @author Edison
 */
public class Sucursal {
    private String nombre;
    private String ruc;
    private String direccion;

    public String getNombre() {
        /**
         * getNombre
         * En este metodo se obtendra el nombre de la surcusal
         * @author Edison
         */
        return nombre;
    }

    public void setNombre(String nombre) {
        /**
         * setNombre
         * En este metodo se establecera el nombre de la surcusal
         * @author Edison
         */
        this.nombre = nombre;
    }

    public String getRuc() {
        /**
         * getRuc
         * En este metodo se obtendra el ruc de la surcusal
         * @author Edison
         */
        return ruc;
    }

    public void setRuc(String ruc) {
        /**
         * setRuc
         * En este metodo se establecera el ruc de la surcusal
         * @author Edison
         */
        this.ruc = ruc;
    }

    public String getDireccion() {
        /**
         * getDireccion
         * En este metodo se obtendra la direccion de la surcusal
         * @author Edison
         */
        return direccion;
    }

    public void setDireccion(String direccion) {
        /**
         * setDireccion
         * En este metodo se establecera la direccion de la surcusal
         * @author Edison
         */
        this.direccion = direccion;
    }

    
    public int contratarEmpleado(){
        /**
         * contartarEmpleado
         * En este metodo la surcusal contratara empleado
         * @author Edison
         */
        return 1;
    }
    public void despedirEmpleado(int index){
        /**
         * despedirEmpleado
         * En este metodo la surcusal despedira empleado
         * @author Edison
         */
         
    }
    public void pagarEmpleado(int index){
        /**
         * pagarEmpleado
         * En este metodo la surcusal pagara al empleado
         * @author Edison
         */
    }

    @Override
    public String toString() {
        return "\ntoString:\nSurcusal{" + "nombre=" + nombre + ", ruc=" + ruc + ", direccion=" + direccion + '}';
    }
    
}
