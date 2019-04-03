
package ec.edu.ups.claces;

/**
 * Empleado
 * Se ingresara los datos del empleado y los metodos en un restaurante
 * @author Edison
 */
public class Empleado {
    
    private String nombre;
    private String cargo;
    private String id;

    public String getNombre() {
        /**
         * getNombre
         * En este metodo se obtendra el Apellido del empleado
         * @author Edison
         */
        return nombre;
    }

    public void setNombre(String nombre) {
        /**
         * setnombre
         * En este metodo se establecera el nombre del empleado
         * @author Edison
         */
        this.nombre = nombre;
    }

    public String getCargo() {
        /**
         * getCargo
         * En este metodo se obtendra el cargo del empleado
         * @author Edison
         */
        return cargo;
    }

    public void setCargo(String cargo) {
        /**
         * setCargo
         * En este metodo se establecera el cargo del empleado
         * @author Edison
         */
        this.cargo = cargo;
    }

    public String getId() {
        /**
         * getId
         * En este metodo se obtendra el numero de identificacion del Empleado
         * @author Edison
         */
        return id;
    }

    public void setId(String id) {
        /**
         * getId
         * En este metodo se establecera el numero de identificacion del Empleado
         * @author Edison
         */
        this.id = id;
    }
    
    public int tomarPedido (){
        /**
         * tomarPedido
         * En este metodo el empleado tomara el pedido
         * @author Edison
         */
        return 1;
    }
    public void servirComida(int index){
        /**
         * servirComida
         * En este metodo el empleado servira la comida
         * @author Edison
         */
    }
    public void cobrar(int index){
        /**
         * cobra
         * En esrte metodo el empleado cobrara
         * @author Edison
         */
    }

    @Override
    public String toString() {
        return "\ntoString:\nEmpleado{" + "nombre=" + nombre + ", cargo=" + cargo + ", id=" + id + '}';
    }
    
}
