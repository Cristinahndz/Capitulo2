
package clases;


public class pruebaFactura {
    
public static void main(String[] args){

//objetos factura1 y factura2
Factura factura1=new Factura("1", "martillo",5,10);
Factura factura2=new Factura("2", "Destornillador",10,30);

System.out.println("Numero de pieza factura1: "+factura1.getnumeroPieza());
System.out.println("Descripcion de pieza factura1: "+factura1.getdescripcionPieza());
System.out.println("Cantidad de pieza factura1: "+factura1.getcantidad());
System.out.println("Precio de pieza factura1: "+factura1.getprecio());
System.out.println("Monto de la factura1: "+factura1.getmontoFactura());

System.out.println("Numero de pieza factura2: "+factura2.getnumeroPieza());
System.out.println("Descripcion de pieza factura2: "+factura2.getdescripcionPieza());
System.out.println("Cantidad de pieza factura2: "+factura2.getcantidad());
System.out.println("Precio de pieza factura2: "+factura2.getprecio());
System.out.println("Monto de la factura2: "+factura2.getmontoFactura());


}
}