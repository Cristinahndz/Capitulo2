package clases;

public class pruebaLuzSemaforo {

    public static void main(String[] args) {
        System.out.println("Duraciones de las luces del semaforo: ");
        System.out.println("Rojo: " + LuzSemaforo.ROJO.getDuracion() + " Segundos");
        System.out.println("Rojo: " + LuzSemaforo.VERDE.getDuracion() + " Segundos");
        System.out.println("Rojo: " + LuzSemaforo.AMARILLO.getDuracion() + " Segundos");
    }
}
