package Aeronautica.pilotos;

public class PilotoDeCarga extends Piloto {

    public static void main(String[] args) {
        PilotoDeCarga p = new PilotoDeCarga();

        System.out.println(p.nombre);
        System.out.println(p.edad);
    }

    String saludarTripulacion() {
        return this.comunicarse("Gracias por estar a bordo");
    }

}
