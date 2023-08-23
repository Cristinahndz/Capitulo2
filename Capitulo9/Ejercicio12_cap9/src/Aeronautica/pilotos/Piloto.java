package Aeronautica.pilotos;

public class Piloto {

    String nombre;
    int edad;
    String identificacion;

//metodo comunicarse
    String comunicarse(String mensaje) {

        System.out.println(mensaje);
        return mensaje;
    }
}
