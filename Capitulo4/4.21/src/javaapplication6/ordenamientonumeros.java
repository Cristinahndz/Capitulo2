
package javaapplication6;

import java.util.Scanner;

public class ordenamientonumeros {
    public ordenamientonumeros(){
}

public void solicitarnumeros(){

int contador;
       int mayor=0;
       int numero=0;

       Scanner input = new Scanner(System.in);

       for(contador=0;contador<10;contador++){
       System.out.println("Digite el numero:" + contador);
       numero=input.nextInt();

       if(numero>mayor)
           mayor=numero;

}
     System.out.println("El numero mayor es: "+mayor);
}
    
}
