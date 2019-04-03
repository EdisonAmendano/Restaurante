
package ec.edu.ups.claces;

/**
 * Cliente
 * En esta clase se ingresara los datos del cliente 
   ademas de los metodos wn un restauranate
 * @author Edison
 */

public class Cliente {
    private String nombre;
    private String aprrlido;
    private String id;

    public String getNombre() {
        /**
         * getNombre
         * En este metodo se obtendra el nombre del cliente
         * @author Edison
         */
        return nombre;
    }

    public void setNombre(String nombre) {
        /**
         * setNombre
         * En este metodo se establecera el nombre del cliente
         * @author Edison
         */
        this.nombre = nombre;
    }

    public String getAprrlido() {
        /**
         * getApellido
         * En este metodo se obtendra el Apellido del cliente
         * @author Edison
         */
        return aprrlido;
    }

    public void setAprrlido(String aprrlido) {
        /**
         * setApellido
         * En este metodo se establecera el Apellido del cliente
         * @author Edison
         */
        this.aprrlido = aprrlido;
    }

    public String getId() {
        /**
         * getId
         * En este metodo se obtendra el numero de identificacion del cliente
         * @author Edison
         */
        return id;
    }

    public void setId(String id) {
        /**
         * getApellido
         * En este metodo se establecera el numero de identificacion del cliente
         * @author Edison
         */
        this.id = id;
    }
    
    public void selecionarComida(){
        /**
         * selecionarComida
         * En este metodo el cliente selecionara la comida
         * @author Edison
         */
    }
    public void solisitarPedido(){
        /**
         * solisitarPedido
         * En este metodo el cliente solicitara su pedido
         * @author Edison
         */
    }
    public void pagar(){
        /**
         *pagar
         * En este metodo el cliente ralizara el pago de la comida
         * @author Edison
         */
    }

    @Override
    public String toString() {
        return "\ntoString:\nCliente{" + "nombre=" + nombre + ", aprrlido=" + aprrlido + ", id=" + id + '}';
    }
    
    
    
}
