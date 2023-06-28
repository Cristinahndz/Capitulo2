
package Clases;

import java.util.Scanner;


public class Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int negativos = 0;
        int positivos = 0;
        int ceros = 0;

        System.out.println("Ingrese cinco números:");

        for (int i = 0; i < 5; i++) {
            int numero = sc.nextInt();

            if (numero < 0) {
                negativos++;
            } else if (numero > 0) {
                positivos++;
            } else {
                ceros++;
            }
        }

        System.out.println("Cantidad de números negativos: " + negativos);
        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de ceros: " + ceros);
    }
}

