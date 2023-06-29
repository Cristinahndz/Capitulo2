package clases;

public class CuentaDeAhorros {

    private static double tasaInteresAnual;
    private double saldoAhorros;

    public CuentaDeAhorros(double saldoInicial) {
        this.saldoAhorros = saldoInicial;
    }

    public double calcularInteresMensual() {
        double interesMensual = saldoAhorros * (tasaInteresAnual / 12);
        saldoAhorros += interesMensual;
        return interesMensual;

    }

    public static void modificarTasaInteres(double nuevaTasaInteres) {
        tasaInteresAnual = nuevaTasaInteres;
    }

    public double getSaldoAhorros() {
        return saldoAhorros;
    }
}
