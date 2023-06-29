
package pkgswitch;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
       Scanner entrada=new Scanner (System.in);
       
   
    int cantidadvendida;
    float valortotal;
    int opcion;

    System.out.println("Ingrese la cantidad de productos vendidos: ");
    cantidadvendida=entrada.nextInt();
    System.out.println("Ingresa una opcion: ");
    System.out.println("1. 2.98$ ");
    System.out.println("2. 4.50$ ");
    System.out.println("3. 9.98$ ");
    System.out.println("4. 4.49$ ");
    System.out.println("5. 6.87$ ");
    opcion=entrada.nextInt();



switch(opcion){

case 1: valortotal= (float) (2.98*cantidadvendida);
        System.out.println("el valor total de la venta es: "+valortotal);
        break;
case 2: valortotal=(float) (4.50*cantidadvendida);
        System.out.println("el valor total de la venta es: "+valortotal);
        break;
case 3: valortotal=(float) (9.98*cantidadvendida);
        System.out.println("el valor total de la venta es: "+valortotal);
        break;
case 4: valortotal=(float) (4.49*cantidadvendida);
        System.out.println("el valor total de la venta es: "+valortotal);
        break;
case 5: valortotal=(float) (6.87*cantidadvendida);
        System.out.println("el valor total de la venta es: "+valortotal);
        break;
case 6: break;
default: System.out.print("No existe esa opcion ");break;

    }

    }
    
}
