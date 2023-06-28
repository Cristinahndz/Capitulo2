
package operaciones;

import java.util.Scanner;

public class Operaciones {

  
    public static void main(String[] args) {

     Scanner entrada=new Scanner (System.in);

        double numero1=0;
        double numero2=0;
        double suma=0;
        double resta=0;
        double multiplicacion=0;
        double division=0;

        System.out.println("Ingresa el primero numero: ");
        numero1=entrada.nextDouble();
        System.out.println("Ingresa el segundo numero: ");
        numero2=entrada.nextDouble();

        suma=numero1+numero2;
        resta=numero1-numero2;
        multiplicacion=numero1*numero2;
        division=numero1/numero2;




        System.out.println("El resultado de la suma es: " + suma + "\nEl resultado de la resta es: " + resta + "\nEl resultado de la multiplicacion es: " + multiplicacion +"\nEl resultado de la division es: " + division );



    }
    
}
