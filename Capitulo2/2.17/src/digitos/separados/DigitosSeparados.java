
package digitos.separados;

import java.util.Scanner;


public class DigitosSeparados {

   
    public static void main(String[] args) {
        
     Scanner entrada=new Scanner (System.in);

     int numero1;
     int numero2;
     int numero3;
     int suma;
     int promedio;
     int multiplicacion;

     System.out.println("Ingresa el primero numero: ");
        numero1=entrada.nextInt();
     System.out.println("Ingresa el segundo numero: ");
        numero2=entrada.nextInt();
     System.out.println("Ingresa el tercer numero: ");
        numero3=entrada.nextInt();

     suma=numero1+numero2+numero3;
     promedio=(suma)/3;
     multiplicacion=numero1*numero2*numero3;

     System.out.printf("La suma de los tres numeros es %d\n",suma);
     System.out.printf("El promedio de los tres numeros es %d\n",promedio);
     System.out.printf("La multiplicacion de los tres numeros es %d2\n",multiplicacion);


     if ((numero1<numero2)&&(numero1<numero3))
     System.out.printf("%d es menor que %d y %d\n",numero1,numero2,numero3);

    else if ((numero2<numero1)&&(numero2<numero3))
    System.out.printf("%d es menor que %d y %d\n",numero2,numero1,numero3);

    else if ((numero3<numero1)&&(numero3<numero2))
    System.out.printf("%d es menor que %d y %d\n",numero3,numero1,numero2);

    if ((numero1>numero2)&&(numero1>numero3))
     System.out.printf("%d es mayor que %d y %d\n",numero1,numero2,numero3);

    else if ((numero2>numero1)&&(numero2>numero3))
    System.out.printf("%d es mayor que %d y %d\n",numero2,numero1,numero3);

    else if ((numero3>numero1)&&(numero3>numero2))
    System.out.printf("%d es mayor que %d y %d\n",numero3,numero1,numero2);
    }
    
}
