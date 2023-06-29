
package clases;

import static clases.asignarAsiento.asignarAsiento;
import static clases.asignarAsiento.imprimirPaseAbordar;
import java.util.Scanner;


public class SistemaReservaciones {
    
public static void main(String[] args){

    boolean[]asientos=new boolean[10];

    Scanner scanner=new Scanner(System.in);

while(true){

    System.out.println("Por favor escriba 1 para Primera Clase");
    System.out.println("Por favor escriba 2 para Economico");

    int opcion=scanner.nextInt();

    if (opcion == 1) {
                // Asignar asiento en Primera Clase
                int asiento = asignarAsiento(asientos, 0, 5);
                if (asiento != -1) {
                    imprimirPaseAbordar(asiento, "Primera Clase");
                } else {
                    System.out.println("La sección de Primera Clase está llena. ¿Acepta ser colocado en la sección Económico? (S/N)");
                    String respuesta = scanner.next();
                    
                    if (respuesta.equalsIgnoreCase("S")) {
                        asiento = asignarAsiento(asientos, 5, 10);
                        if (asiento != -1) {
                            imprimirPaseAbordar(asiento, "Económico");
                        } else {
                            System.out.println("Lo sentimos, el vuelo está completo. El próximo vuelo sale en 3 horas.");
                        }
                    } else {
                        System.out.println("El próximo vuelo sale en 3 horas.");
                    }
                }
            } else if (opcion == 2) {
                // Asignar asiento en Económico
                int asiento = asignarAsiento(asientos, 5, 10);
                if (asiento != -1) {
                    imprimirPaseAbordar(asiento, "Económico");
                } else {
                    System.out.println("La sección de Económico está llena. ¿Acepta ser colocado en la sección de Primera Clase? (S/N)");
                    String respuesta = scanner.next();
                    
                    if (respuesta.equalsIgnoreCase("S")) {
                        asiento = asignarAsiento(asientos, 0, 5);
                        if (asiento != -1) {
                            imprimirPaseAbordar(asiento, "Primera Clase");
                        } else {
                            System.out.println("Lo sentimos, el vuelo está completo. El próximo vuelo sale en 3 horas.");
                        }
                    } else {
                        System.out.println("El próximo vuelo sale en 3 horas.");
                    }
                }
            } else {
                System.out.println("Opción inválida. Por favor seleccione nuevamente.");
            }
        }
    }
    




}







