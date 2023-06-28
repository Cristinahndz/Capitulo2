
package clases;


public class main {

public static void main(String[] args){

//objetos empleado
Empleados empleado1 = new Empleados("Carlos", "Smith", 800);
Empleados empleado2 = new Empleados("Alejandro", "Meza", 900);

System.out.println("Salario anual de empleado1: "+empleado1.getsalarioAnual());
System.out.println("Salario anual de empleado2: "+empleado2.getsalarioAnual());


//aplicamos aumento del 10% usando el metodo aumentarSalario
empleado1.aumentarSalario(10);
empleado2.aumentarSalario(10);

System.out.println("Salario anual de empleado1 despues del aumento: "+empleado1.getsalarioAnual());
System.out.println("Salario anual de empleado2 despues del aumento: "+empleado2.getsalarioAnual());
}
}
