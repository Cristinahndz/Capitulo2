
package javaapplication13;

import java.util.Scanner;


public class JavaApplication13 {

    
    public static void main(String[] args) {
     Scanner entrada=new Scanner (System.in);

    int n;
    System.out.println("Ingresa un numero: ");
        n=entrada.nextInt();

        for(int i=1; i<=n; i++){
        System.out.print("*");
    }
    
}
}
