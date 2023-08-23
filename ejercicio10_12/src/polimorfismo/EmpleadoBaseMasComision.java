package polimorfismo;

public class EmpleadoBaseMasComision extends EmpleadoPorComision {

    private double salarioBase;//salario base porsemana

    public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, Fecha fechadenacimiento, double ventasBrutas, double tarifaComision, double SalarioBase) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial, fechadenacimiento, ventasBrutas, tarifaComision);

        if (salarioBase < 0.0) {
            throw new IllegalArgumentException("El salario base debe ser >=0.0");
        }

        this.salarioBase = salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 0.0) {
            throw new IllegalArgumentException("El salario base debe ser >=0.0");
        }

        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    @Override
    public double ingresos() {
        double salarioConRecompensa = salarioBase * 1.1;
        double pagoporcomision = getVentasBrutas() * (getTarifaComision ()/ 100);
        return salarioConRecompensa + pagoporcomision;
    }

   @Override
    public String toString() {
       return "\ncon salario base  " + super.toString() + "\nSalario Base " + getSalarioBase();

    }
}
