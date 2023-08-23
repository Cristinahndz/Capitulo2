package polimorfismo;

import java.time.LocalDate;

public class PruebaSistemaNomina {

    public static void main(String[] args) {

//objetos de las subclases
        Fecha fechanacimiento1 = new Fecha(7, 8, 2007);
        Fecha fechanacimiento2 = new Fecha(10, 7, 2023);
        Fecha fechanacimiento3 = new Fecha(11, 6, 2001);
        Fecha fechanacimiento4 = new Fecha(7, 8, 1911);

        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("John", "Smith", "111-11-1111", fechanacimiento1, 800.00);
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Karen", "Price", "222-22-2222", fechanacimiento2, 16.75, 40);
        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision("Sue", "Jones", "333-33-3333", fechanacimiento3, 10000, 0.06);
        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision("Bob", "Lewis", "444-44-4444", fechanacimiento4, 5000, .04, 400);

//creacion del arreglo de objetos empleados -- Asigna la referencia a un objeto empleado PorHoras a empleados
        Empleado[] empleados = {empleadoAsalariado, empleadoPorHoras, empleadoPorComision, empleadoBaseMasComision};

//obtenemos la fecha actual del sistema
        LocalDate fechaActual = LocalDate.now();
        int mesActual = fechaActual.getMonthValue();

        // procesa en forma genérica a cada elemento en el arreglo de empleados, iterando a traves del arreglo de empleados invocando el metodo ingresos con la variable empleadoactual
        for (Empleado empleadoActual : empleados) {
            double pago = empleadoActual.ingresos();

// determina si el elemento es un EmpleadoBaseMasComision
            if (empleadoActual.getFechadenacimiento().getMes() == mesActual) {
                pago += 100.00;
                /*conversión descendente de la referencia de Empleado
                a una referencia de EmpleadoBaseMasComision
                EmpleadoBaseMasComision empleado = (EmpleadoBaseMasComision) empleadoActual;
                empleado.setSalarioBase(1.10 * empleado.getSalarioBase());
                System.out.println("El nuevo salario base con 10% de aumento es: " + empleado.getSalarioBase());
                 */
            }
            System.out.println("Pago de " + empleadoActual.getPrimerNombre() + ": " + pago);
        }
//obtiene el nombre del tipo de cada objeto en el arreglo de empleados
        for (int j = 0; j < empleados.length; j++) {
            System.out.println("El empleado es un" + j + empleados[j].getClass().getName());
        }
    }
}
