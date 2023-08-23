package polimorfismo;

public class EmpleadoAsalariado extends Empleado {

    private double salarioSemanal;

//constructor
    public EmpleadoAsalariado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, Fecha fechadenacimiento, double salarioSemanal) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial, fechadenacimiento);

        if (salarioSemanal < 0) {
            throw new IllegalArgumentException("El salario semanal debe ser >=0.0");
        }
        this.salarioSemanal = salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        if (salarioSemanal < 0.0) {
            throw new IllegalArgumentException("El salario semanal debe ser  >=0.0");
        }
        this.salarioSemanal = salarioSemanal;
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    @Override
    public double ingresos() {
        return getSalarioSemanal();
    }

    @Override
    public String toString() {
        return "\nEmpleado Asalariado: \n " + super.toString() + "\nSalario Semanal " + salarioSemanal;

    }
}
