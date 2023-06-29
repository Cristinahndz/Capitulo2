package Clases;

public class Rectangulo {

    public double anchura = 1;
    public double longitud = 1;

    public Rectangulo(double anchura, double longitud) {

        this.anchura = anchura;
        this.longitud = longitud;

        if (anchura > 0.0 && anchura < 20.0) {
            this.anchura = anchura;
        }
        if (longitud > 0.0 && longitud < 20.0) {
            this.longitud = longitud;
        }
    }
    //metodos establecer y obtener 

    public void setAnchura(double anchura) {
        if (anchura > 0.0 && anchura < 20.0) {
            this.anchura = anchura;
        }

    }

    public double getAnchura(double anchura) {
        return anchura;
    }

    public void setLongitud(double longitud) {
        if (longitud > 0.0 && longitud < 20.0) {
            this.longitud = longitud;
        }

    }

    public double getLongitud(double longitud) {
        return longitud;
    }

//metodos perimetro y Area
    public double calcularPerimetro() {

        return 2 * (longitud + anchura);

    }

    public double calcularArea() {

        return longitud * anchura;
    }

}
