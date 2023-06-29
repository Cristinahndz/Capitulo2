
package clases;

import java.util.Scanner;


public class NumerosUnicos {
    public static void main(String[] args){

int[] numeros = new int[5];
        int contador = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 5 números entre 10 y 100:");

        while (contador < numeros.length) {
            int numero = scanner.nextInt();

            if (numero >= 10 && numero <= 100) {
                boolean duplicado = false;

                for (int i = 0; i < contador; i++) {
                    if (numeros[i] == numero) {
                        duplicado = true;
                        break;
                    }
                }

                if (!duplicado) {
                    numeros[contador] = numero;
                    contador++;
                    System.out.println("Número único: " + numero);
                } else {
                    System.out.println("El número es duplicado. Inténtelo de nuevo.");
                }
            } else {
                System.out.println("El número debe estar entre 10 y 100. Inténtelo de nuevo.");
            }
        }

        System.out.println("Valores únicos introducidos:");

        for (int i = 0; i < contador; i++) {
            System.out.println(numeros[i]);
        }
    }
}



