# Restaurante

 	PRÁCTICA DE LABORATORIO 

CARRERA: Computacion	ASIGNATURA: Programación Aplicada
NRO. PRÁCTICA:	1	TÍTULO PRÁCTICA:
OBJETIVO ALCANZADO:
ACTIVIDADES DESARROLLADAS
1. Describir 10 objetos relacionados a tema de Restaurantes.
Empleados: Persona que desempeña algún empleo, cargo o servicio a las órdenes del gobierno o de un particular, corporación o empresa. 
Clientes: Un cliente es una persona física o jurídica que recibe un servicio o adquiere un bien a cambio de un dinero u otro tipo de retribución.
Sucursales: Se refiere a cada uno de los establecimientos u oficinas que una empresa tiene en distintos sitios, y que dependen de una central.
Comida: Se conoce como comida al conjunto de sustancias alimenticias que se comen y se beben para subsistir.
Equipos de Cocina: Está conformado por todos los equipos utilizados para preparar alimentos mediante la utilización del calor, producido por medio de la electricidad, gas, vapor entre otros. Éstos tienen la cualidad de transformar los alimentos crudos en cocidos.
Socios: Es la persona que recibe cada una de las partes en un contrato de sociedad.
Pedido: El pedido o nota de pedido es el documento que realiza quien ha tomado la decisión en firme de comprar un bien o servicio.
Decoraciones: Lo que decora, a las cosas que se utilizan para adornar y al arte que se especializa en cómo combinar adornos y otros objetos de ornamentación.
Propaganda: La propaganda es una forma de comunicación que tiene como objetivo influir en la actitud de una comunidad respecto a alguna causa o posición
Comedor: El comedor designa un espacio o lugar en el cual las personas se reúnen para ingerir alimentos, ya sea desayuno, comida, cena o refrigerio.
2. De los 10 objetos descritos en el paso 1, abstraer 5 de ellos en clases y diagramarlas con tres atributos y tres métodos mínimo para cada clases (los métodos getter y setter no cuentan).
 
3.
Clase Cliente
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
Clase Empleado

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
Clase Sucursal 

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
Clase Comida

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
Clase EquipoCocina

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

4. Implementar el método toString() en cada clase.
Clase Cliente
    @Override
    public String toString() {
        return "\ntoString:\nCliente{" + "nombre=" + nombre + ", aprrlido=" + aprrlido + ", id=" + id + '}';
    }

Clase Empleado

@Override
    public String toString() {
        return "\ntoString:\nEmpleado{" + "nombre=" + nombre + ", cargo=" + cargo + ", id=" + id + '}';
    }

Clase Sucursal

    @Override
    public String toString() {
        return "\ntoString:\nSurcusal{" + "nombre=" + nombre + ", ruc=" + ruc + ", direccion=" + direccion + '}';
    }

Clase Comida

    @Override
    public String toString() {
        return "\ntoString:\nComida{" + "nombre=" + nombre + ", tipo=" + tipo + ", precio=" + precio + '}';
    }

Clase EquipoCocina

    @Override
    public String toString() {
        return "\ntoString:\nEquipoCocina{" + "nombre=" + nombre + ", precio=" + precio + ", peso=" + peso + '}';
    }
5.
public class Vista {
    
    public static void main(String[]args){
        Scanner l = new Scanner(System.in);
        Scanner l2 = new Scanner(System.in);
        
        System.out.println("Ingrese:\n\t1:cliente\n\t2:empleado\n\t3:surcusal\n\t4:comida\n\t5:Equipo de cocina(cocina, horno, etc)");
        int op = l2.nextInt();
        switch(op){
            case 1:
                Cliente cl = new Cliente();
                System.out.println("Ingrese el nombre del cliente");
                cl.setNombre(l.nextLine());
                System.out.println("Ingrese el apellido del cliente");
                cl.setAprrlido(l.nextLine());
                System.out.println("Ingrese la identificación del clientae");
                cl.setId(l2.next());
                System.out.println("\nNombre: "+cl.getNombre());
                System.out.println("Apellido: "+cl.getAprrlido());
                System.out.println("Id: "+cl.getId());
                System.out.println(cl);
                break;
            case 2:
                Empleado em = new Empleado();
                System.out.println("Ingrese el nombre del empleado");
                em.setNombre(l.nextLine());
                System.out.println("Ingrese el cargo del empleado");
                em.setCargo(l.nextLine());
                System.out.println("Ingrese la identificaón del empleado");
                em.setId(l2.next());
                System.out.println("\nNombre: "+em.getNombre());
                System.out.println("Id: "+em.getId());
                System.out.println("Cargo: "+em.getCargo());
                System.out.println(em);
                break;
            case 3:
                Sucursal su = new Sucursal();
                System.out.println("Ingrese el nombre de la surcusal");
                su.setNombre(l.nextLine());
                System.out.println("Ingrese el ruc de la surcusal");
                su.setRuc(l2.next());
                System.out.println("Ingrese la dirección");
                su.setDireccion(l.nextLine());
                System.out.println("\nNombre: "+su.getNombre());
                System.out.println("Ruc: "+su.getRuc());
                System.out.println("Direccion: "+su.getDireccion());
                System.out.println(su);
                break;
            case 4:
                Comida co = new Comida();
                System.out.println("Ingrese el nombre de la comida");
                co.setNombre(l.nextLine());
                System.out.println("Ingrese el tipo de comida(Vejetal, fruta, carne, etc)");
                co.setTipo(l.nextLine());
                System.out.println("Ingrese el precio de la comida");
                co.setPrecio(l2.nextDouble());
                System.out.println("\nNombre: "+co.getNombre());
                System.out.println("Tipo: "+co.getTipo());
                System.out.println("Precio: "+co.getPrecio());
                System.out.println(co);
                break;
            case 5:
                EquipoCocina ec = new EquipoCocina();
                System.out.println("Ingrese el nombre del equipo de cocina");
                ec.setNombre(l.nextLine());
                System.out.println("Ingrese el peso(kg)");
                ec.setPeso(l2.nextDouble());
                System.out.println("Ingrese el precio");
                ec.setPrecio(l.nextDouble()); 
                System.out.println("\nNombre: "+ec.getNombre());
                System.out.println("Peso: "+ec.getPeso());
                System.out.println("Precio: "+ec.getPrecio());
                System.out.println(ec);
                break;
        }
    }
}
 
RESULTADO(S) OBTENIDO(S):
Se pudo abstraer del mundo real objetos para la programación.
La correcta implementación de los métodos y de los usos del los getters y setters además de poder instanciar objetos.
CONCLUSIONES:
Se pudo ver que el uso de los getter y setter es importante en la POO que va muy ligada a los objetos

Nombre de estudiante: EdisonAmendaño
Firma de estudiante: 
