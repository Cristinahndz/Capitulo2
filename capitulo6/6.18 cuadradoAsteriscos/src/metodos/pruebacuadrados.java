
package metodos;

import java.util.Scanner;
import static metodos.cuadradoDeAsteriscos.cuadradodeAsteriscos;


public class pruebacuadrados {
    public static void main(String[]args){

    Scanner scanner=new Scanner(System.in);

        System.out.print("Ingrese el valor del lado: ");
            int lado=scanner.nextInt();

                cuadradodeAsteriscos(lado);
       
    }
}
