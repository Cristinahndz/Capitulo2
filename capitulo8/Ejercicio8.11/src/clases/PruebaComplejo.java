
package clases;


public class PruebaComplejo {
    
public static void main(String[] args) {
        Complejo complejo1 = new Complejo(2.5, 3.7);
        Complejo complejo2 = new Complejo(1.8, 2.2);
        
        // Sumar dos números Complejo
        Complejo suma = complejo1.sumar(complejo2);
        System.out.print("Suma: ");
        suma.imprimir();
        
        // Restar dos números Complejo
        Complejo resta = complejo1.restar(complejo2);
        System.out.print("Resta: ");
        resta.imprimir();
    }
}
