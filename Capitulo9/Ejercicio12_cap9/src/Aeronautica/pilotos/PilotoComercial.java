package Aeronautica.pilotos;

public class PilotoComercial extends Piloto {

    public static void main(String[] args) {

        PilotoComercial p = new PilotoComercial();
        p.nombre = "Cristina";
        System.out.println(p.despedirPasajeros());
    }

//redefiniendo el metodo comunicarse
    @Override
    String comunicarse(String mensaje) {

        System.out.println(identificacion+ mensaje);
        return this.nombre + mensaje;
    }

    String SaludarPasajeros() {

        return this .comunicarse("Bienvenidos pasajeros");

    }

    String despedirPasajeros() {
        return this.comunicarse("Gracias  por usar nuestra aerolinea");

    }
}
