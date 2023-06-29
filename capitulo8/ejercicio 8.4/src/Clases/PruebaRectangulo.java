
package Clases;


public class PruebaRectangulo {
       public static void main(String[] args) {

        Rectangulo rectangulo = new Rectangulo(5.0,3.0);
        System.out.println("Longitud: "+rectangulo.getLongitud());
        System.out.println("Anchura: "+rectangulo.getAnchura());

        System.out.println("Longitud: " + rectangulo.getLongitud());
        System.out.println("Anchura: " + rectangulo.getAnchura());

        double perimetro = rectangulo.calcularPerimetro();
        double area = rectangulo.calcularArea();
        System.out.println("Perímetro: " + perimetro);
        System.out.println("Área: " + area);
    }
}

