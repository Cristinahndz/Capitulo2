
package numeroparimpar;

import java.util.Scanner;

public class NUMEROPARIMPAR {

    
    public static void main(String[] args) {
       

   Scanner entrada=new Scanner (System.in);

    double numero=0;
    System.out.println("Ingresa un numero: ");
    numero=entrada.nextDouble();

    if(numero % 2 == 0){
    System.out.println("Es un numero par ");
}else{
    System.out.println("Es un numero impar ");

}

    }
    
}
