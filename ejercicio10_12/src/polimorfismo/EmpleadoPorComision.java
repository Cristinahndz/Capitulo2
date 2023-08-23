package polimorfismo;

public class EmpleadoPorComision extends Empleado {

    private double ventasBrutas;//ventas totales por semana
    private double tarifaComision;//porcentaje de comision

    public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, Fecha fechadenacimiento, double ventasBrutas, double tarifaComision) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial, fechadenacimiento);

        if (tarifaComision <= 0.0 || tarifaComision >= 1.0) {
            throw new IllegalArgumentException("La tarifa de comision debe ser >0.00 y <1.0");
        }

        if (ventasBrutas < 0.0) {
            throw new IllegalArgumentException("Las ventas brutas deben ser >=0.0 ");
        }
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }

    public void setVentasBrutas(double ventasBrutas) {
        if (ventasBrutas < 0.0) {
            throw new IllegalArgumentException("Las ventas brutas deben ser >=0.0 ");
        }

        this.ventasBrutas = ventasBrutas;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setTarifaComision(double tarifaComision) {
        if (tarifaComision <= 0.0 || tarifaComision >= 1.0) {
            throw new IllegalArgumentException("La tarifa de comision debe ser >0.00 y <1.0");
        }

        this.tarifaComision = tarifaComision;
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    @Override
    public double ingresos() {
        return (getTarifaComision() / 100) * getVentasBrutas();
    }

    @Override
    public String toString() {

        return " Empleado por comision: \n " + super.toString() + "\nVentas Brutas " + getVentasBrutas() + "\nTarifa de Comision " + getTarifaComision();

    }

}
