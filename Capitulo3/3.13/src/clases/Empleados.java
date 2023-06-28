package clases;

public class Empleados {
//variables de instancia

    String primerNombre;
    String apellidoPaterno;
    double salarioMensual;

//constructor inicializa las variables de instancia
    Empleados(String primerNombre, String apellidoPaterno, double salarioMensual) {

        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;

        if (salarioMensual > 0) {
            this.salarioMensual = salarioMensual;
        }
    }

//Metodos establecer y obtener
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getprimerNombre(String primerNombre) {
        return primerNombre;
    }

    public void setapellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getapellidoPaterno(String apellidoPaterno) {
        return apellidoPaterno;
    }

    public void setsalarioMensual(double SalarioMensual) {

        if (salarioMensual > 0) {

            this.salarioMensual = salarioMensual;
        }

    }

    public double getsalarioMensual() {
        return salarioMensual;
    }

    public double getsalarioAnual() {
        return salarioMensual * 12;
    }

//Metodo aumentarSalario
    public void aumentarSalario(double porcentajeAumento) {
        if (porcentajeAumento > 0) {
            double aumento = salarioMensual * (porcentajeAumento / 100);
            salarioMensual += aumento;
        }
    }

}
