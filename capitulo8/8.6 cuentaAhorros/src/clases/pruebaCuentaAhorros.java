package clases;

public class pruebaCuentaAhorros {

    public static void main(String[] args) {
        CuentaDeAhorros.modificarTasaInteres(0.04);

        CuentaDeAhorros ahorrador1 = new CuentaDeAhorros(2000.0);
        CuentaDeAhorros ahorrador2 = new CuentaDeAhorros(3000.0);

        for (int mes = 1; mes <= 12; mes++) {
            double interes1 = ahorrador1.calcularInteresMensual();
            double interes2 = ahorrador2.calcularInteresMensual();

            System.out.println("Mes " + mes);
            System.out.println("Saldo ahorrador1: " + ahorrador1.getSaldoAhorros() + " Interes: " + interes1);
            System.out.println("Saldo ahorrador2: " + ahorrador2.getSaldoAhorros() + " Interes: " + interes2);

        }
        CuentaDeAhorros.modificarTasaInteres(0.05);
        double interes1 = ahorrador1.calcularInteresMensual();
        double interes2 = ahorrador2.calcularInteresMensual();

        System.out.println("Mes 13");
        System.out.println("Saldo ahorrador1: " + ahorrador1.getSaldoAhorros() + " Interes: " + interes1);
        System.out.println("Saldo ahorrador2: " + ahorrador2.getSaldoAhorros() + " Interes:" + interes2);

    }
}
