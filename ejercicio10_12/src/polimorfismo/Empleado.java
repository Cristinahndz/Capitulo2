package polimorfismo;

public abstract class Empleado {

    private final String primerNombre;
    private final String apellidoPaterno;
    private final String numeroSeguroSocial;
    private final Fecha fechadenacimiento;

//constructor
    public Empleado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, Fecha fechadenacimiento) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.fechadenacimiento = fechadenacimiento;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public Fecha getFechadenacimiento() {
        return fechadenacimiento;
    }





    @Override
    public String toString() {
        return "\nPrimer Nombre " + primerNombre + "\nApellido Paterno " + apellidoPaterno + "\nNumero de Seguro Social " + numeroSeguroSocial+"\nFecha de Nacimiento "+fechadenacimiento;

    }

//metodo abstracto sobrescrito por las 
    public abstract double ingresos();

}
