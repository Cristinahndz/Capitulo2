package polimorfismo;

public class EmpleadoPorHoras extends Empleado {

    private double sueldo; //sueldo por hora
    private double horas; //horas trabajadas por semana 

    public EmpleadoPorHoras(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, Fecha fechadenacimiento, double sueldo, double horas) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial, fechadenacimiento);

        if (sueldo < 0.0) 
            throw new IllegalArgumentException("El sueldo por horas debe ser >=0.0");
        
        if ((horas < 0.0) || (horas > 168.0)) 
            throw new IllegalArgumentException("Las horas trabajadas deben ser >=0.0 y <=168.0");
        

        this.sueldo = sueldo;
        this.horas = horas;
    }

    public void setSueldo(double sueldo) {
        if (sueldo < 0.0) 
            throw new IllegalArgumentException("El sueldo por horas debe ser >=0.0");
        
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setHoras(double horas) {
        if ((horas < 0.0) || (horas > 168.0)) 
            throw new IllegalArgumentException("Las horas trabajadas deben ser >=0.0 y <=168.0");
        
        this.horas = horas;
    }

    public double getHoras() {
        return horas;
    }

    @Override
    public double ingresos() {
        if (getHoras() <= 40) {
            return getSueldo() * getHoras();
        } else {
            double horasExtras = getHoras() - 40;
            return ( 40 * getSueldo()) + (getSueldo()*1.5*horasExtras) ;
        }

    }

    @Override
    public String toString() {
        return "\nEmpleado Por Horas: \n " + super.toString() + "\nSueldo por horas " + getSueldo() + "\nHoras trabajadas " + getHoras();

    }

}
