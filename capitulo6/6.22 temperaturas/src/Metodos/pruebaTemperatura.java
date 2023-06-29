
package Metodos;

//import Metodos.conversionTemperatura;
//import static Metodos.conversionTemperatura.fahrenheit;
import java.util.Scanner;


public class pruebaTemperatura {
    
public static void main(String []args){
    Scanner scanner=new Scanner(System.in);

    while(true){

        System.out.println("Seleccione una opcion: ");
        System.out.println("1- Convertir de grados fahrenheit a grados centigrados");
        System.out.println("2- Convertir de grados centigrados a grados fahrenheit");
        System.out.println("3- Salir ");

            int opcion=scanner.nextInt();

    if(opcion==1){
  
        System.out.print("Ingrese la temperatura en grados fahrenheit: ");
        double f=scanner.nextDouble();

        double c=conversionTemperatura.centigrados(f);
        System.out.println("Equivalente en grados centigrados: "+c);

    }
    else if(opcion==2){
        System.out.print("Ingrese la temperatura en grados centigrados: ");
        double c=scanner.nextDouble();

        double f=conversionTemperatura.fahrenheit(c);
        System.out.println("Equivalente en grados fahrenheit "+f);

    }
    else if(opcion==3){
        break;
    }
    else{
        System.out.println("Opcion invalida, intente de nuevo");
    }

}

}

}
