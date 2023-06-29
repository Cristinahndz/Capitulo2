
package metodos;

import java.util.Scanner;
import static metodos.minimoTres.minimo3;


public class pruebaminimo3 {
    public static void main(String []args){

    Scanner scanner=new Scanner(System.in);

        System.out.println("Ingrese el primer valor: ");
            double a=scanner.nextDouble();

        System.out.println("Ingrese el segundo valor: ");
            double b=scanner.nextDouble();

        System.out.println("Ingrese el tercer valor: ");
            double c=scanner.nextDouble();

            double minimo=minimo3(a,b,c);
                System.out.println("El valor minimo es: "+minimo);
    }

}
