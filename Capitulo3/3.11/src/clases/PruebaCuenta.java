
package clases;

import java.util.Scanner;

public class PruebaCuenta {
    public static void main(String[]args){
     Cuenta cuenta1=new Cuenta("Jane Green", 50);
     Cuenta cuenta2=new Cuenta("John Blue", 70);

System.out.printf("Saldo ",cuenta1.obtenerNombre(),cuenta1.obtenersaldo());
System.out.printf("Saldo",cuenta2.obtenerNombre(),cuenta2.obtenersaldo());

Scanner entrada=new Scanner(System.in);

System.out.print("Escriba el monto a depositar para cuenta1: ");
double montoDeposito=entrada.nextDouble();

System.out.printf("sumando el saldo de cuenta1",montoDeposito);
cuenta1.depositar(montoDeposito);

System.out.printf("Saldo de cuenta1", cuenta1.obtenerNombre(),cuenta1.obtenerNombre());
System.out.printf("Saldo de cuenta2", cuenta2.obtenerNombre(),cuenta2.obtenerNombre());

System.out.print("Escriba el monto a depositar para cuenta2: ");
 montoDeposito=entrada.nextDouble();
System.out.printf("smando el saldo de cuenta2",montoDeposito);
cuenta2.depositar(montoDeposito);

System.out.printf("Saldo de cuenta1", cuenta1.obtenerNombre(),cuenta1.obtenersaldo());
System.out.printf("Saldo de cuenta2", cuenta2.obtenerNombre(),cuenta2.obtenersaldo());

}
}
