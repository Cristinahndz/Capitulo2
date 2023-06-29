package clases;

public enum LuzSemaforo {

    ROJO(30),
    VERDE(60),
    AMARILLO(5),

    private int duracion;

    private LuzSemaforo(int duracion) {
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }

}
