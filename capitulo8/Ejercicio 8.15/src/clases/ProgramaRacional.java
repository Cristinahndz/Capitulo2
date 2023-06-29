
package clases;


    public class ProgramaRacional {
    public static void main(String[] args) {
        Racional r1 = new Racional(2, 4);
        Racional r2 = new Racional(3, 5);

        Racional suma = Racional.sumar(r1, r2);
        System.out.println("Suma: " + suma);

        Racional resta = Racional.restar(r1, r2);
        System.out.println("Resta: " + resta);

        Racional multiplicacion = Racional.multiplicar(r1, r2);
        System.out.println("Multiplicación: " + multiplicacion);

        Racional division = Racional.dividir(r1, r2);
        System.out.println("División: " + division);

        System.out.println("Representación en fracción: " + r1);
        System.out.println("Representación en formato de punto flotante: " + r1.toFloatString(2));
    }
}
