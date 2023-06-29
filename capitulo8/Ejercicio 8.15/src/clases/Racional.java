
package clases;


public class Racional {
      private int numerador;
    private int denominador;

    public Racional() {
        this(0, 1);
    }

    public Racional(int numerador, int denominador) {
        int mcd = calcularMCD(numerador, denominador);
        this.numerador = numerador / mcd;
        this.denominador = denominador / mcd;
    }

    public static Racional sumar(Racional r1, Racional r2) {
        int numerador = r1.numerador * r2.denominador + r2.numerador * r1.denominador;
        int denominador = r1.denominador * r2.denominador;
        return new Racional(numerador, denominador);
    }

    public static Racional restar(Racional r1, Racional r2) {
        int numerador = r1.numerador * r2.denominador - r2.numerador * r1.denominador;
        int denominador = r1.denominador * r2.denominador;
        return new Racional(numerador, denominador);
    }

    public static Racional multiplicar(Racional r1, Racional r2) {
        int numerador = r1.numerador * r2.numerador;
        int denominador = r1.denominador * r2.denominador;
        return new Racional(numerador, denominador);
    }

    public static Racional dividir(Racional r1, Racional r2) {
        int numerador = r1.numerador * r2.denominador;
        int denominador = r1.denominador * r2.numerador;
        return new Racional(numerador, denominador);
    }

    public String toString() {
        return numerador + "/" + denominador;
    }

    public String toFloatString(int precision) {
        double resultado = (double) numerador / denominador;
        String formato = "%." + precision + "f";
        return String.format(formato, resultado);
    }

    private int calcularMCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calcularMCD(b, a % b);
    }
}




