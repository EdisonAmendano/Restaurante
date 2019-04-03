
package ec.edu.ups.vista;

import ec.edu.ups.claces.Cliente;
import ec.edu.ups.claces.Comida;
import ec.edu.ups.claces.Empleado;
import ec.edu.ups.claces.EquipoCocina;
import ec.edu.ups.claces.Sucursal;
import java.util.Scanner;

/**
 * Vista
 * En esta clase se va a ingresar lo valores de cada metodo
 * @author Edison
 */
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
