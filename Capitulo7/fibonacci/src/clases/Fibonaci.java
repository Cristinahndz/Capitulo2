
package clases;

import java.math.BigInteger;
import java.util.Scanner;


public class Fibonaci {
    public static BigInteger fibonacci(int n) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            BigInteger temp = a.add(b);
            a = b;
            b = temp;
        }

        return b;
    }

    public static void main(String[] args) {
        
       
Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de n: ");
        
       
            int n = scanner.nextInt();
           

       
            BigInteger result = fibonacci(n);
                System.out.println("El " + n + " número de Fibonacci es: " + result);
    }
}

