
package sueldos;

import Entidades.Vendedor;
import Servicios.VendedorServicio;


public class Sueldos {

    public static void main(String[] args) {
        VendedorServicio vs=new VendedorServicio();
        Vendedor v1=vs.altaVendedor();
        vs.sueldoMensual(v1);
        vs.vacaciones(v1);
       
    }
    
}
