
package clases;

public class Cuenta {

private String nombre;
private double saldo;

public Cuenta(String nombre, double sueldo){

    this.nombre=nombre;

    if (saldo>0)
        this.saldo=saldo;
}

public void depositar(double montoDeposito){

    if (montoDeposito>0)
        saldo=saldo+montoDeposito;
}

public double obtenersaldo(){
    return saldo;
}

public void establecerNombre(String nombre){
    this.nombre=nombre;
}

public String obtenerNombre(){
    return nombre;
}


}
