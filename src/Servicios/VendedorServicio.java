
package Servicios;

import Entidades.Vendedor;
import java.util.Date;
import java.util.Scanner;


public class VendedorServicio {
    Scanner input = new Scanner(System.in);
    public Vendedor altaVendedor()
    {
        //instanciar un objeto de tipo vendedor
        Vendedor v1=new Vendedor();
        //llenar atributos
        System.out.print("Ingrese el nombre del vendedor: ");
        v1.setNombre(input.next());
        System.out.print("Ingrese el DNI del vendedor: ");
        v1.setDni(input.nextInt());
        System.out.print("Ingrese el sueldo basico del vendedor: ");
        v1.setSueldoBasico(input.nextDouble());
        System.out.print("Ingrese el dia en que inicio actividades: ");
        int dia=input.nextInt();
        System.out.print("Ingrese el mes en que inicio: ");
        int mes=input.nextInt();
        System.out.print("Ingrese el año en que inicio: ");
        int anio=input.nextInt();
        Date fecha=new Date(anio-1900, mes-1, dia);
        v1.setFechaInicio(fecha);
        return v1;
    }
    
    public void sueldoMensual(Vendedor v1)
    {
        System.out.print("Ingrese cuantas fueron las ventas totales del vendedor: ");
        double ventas=input.nextDouble();
        v1.setComisiones(ventas*0.15);
        v1.setSueldoMensual(v1.getSueldoBasico()+v1.getComisiones());
        System.out.println("El sueldo del vendedor "+v1.getNombre()+" es de $"+v1.getSueldoMensual());
    }
    public void vacaciones(Vendedor v1)
    {
        Date hoy=new Date();
        int antiguedad=hoy.getYear()-v1.getFechaInicio().getYear();
        
        if(antiguedad<5)
        {
            System.out.println("Le corresponden 14 dias de vacaciones");
        }else if(antiguedad>=5&&antiguedad<10)
        {
            System.out.println("Le corresponden 21 dias de vacaciones");
        }else if(antiguedad>=10&&antiguedad<20)
        {
            System.out.println("Le corresponden 28 dias de vacaciones");
        }else if(antiguedad>=20)
        {
            System.out.println("Le corresponde 35 dias de vacaciones");
        }else
        {
            System.out.println("El empleado tiene vacaciones proporcionales");
        }
    }
}
