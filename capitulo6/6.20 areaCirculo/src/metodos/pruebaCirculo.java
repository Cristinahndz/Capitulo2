
package metodos;

import java.util.Scanner;
import static metodos.CalculadoraAreaCirculo.circuloArea;


public class pruebaCirculo {
    
    public static void main(String []args){

        Scanner scanner=new Scanner(System.in);

            System.out.println("Ingrese el radio del circulo: ");
            double radio=scanner.nextDouble();

                double area=circuloArea(radio);
                    System.out.println("El area del circulo es: "+area);

    }
}
