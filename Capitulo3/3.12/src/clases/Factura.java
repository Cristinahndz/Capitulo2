//clase factura que calcule el monto(multiplique el precio por la cantidad)
package clases;

//Clase factura
public class Factura {

//variables de instancia    
    String numeroPieza;
    String descripcionPieza;
    int cantidad;
    double precio;

//constructor que inicializa variables
    Factura(String numeroPieza, String descripcionPieza, int cantidad, double precio) {

        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;

        if (cantidad > 0) {
            this.cantidad = cantidad;
        }

        if (precio > 0) {
            this.precio = precio;
        }

    }

//metodos establecer y obtener
    public void setnumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public String getnumeroPieza() {
        return numeroPieza;
    }

    public void setdescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }

    public String getdescripcionPieza() {
        return descripcionPieza;
    }

    public void setcantidad(int cantidad) {

        if (cantidad > 0) {
            this.cantidad = cantidad;
        }

    }

    public int getcantidad() {
        return cantidad;
    }

    public void setprecio(double precio) {

        if (precio > 0) {
            this.precio = precio;
        }

    }

    public double getprecio() {
        return precio;
    }

//metodo obtener montoFactura
    public double getmontoFactura() {
        return cantidad * precio;
    }

}
