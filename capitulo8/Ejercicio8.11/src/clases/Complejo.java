
package clases;


public class Complejo {
    
private double parteReal;
    private double parteImaginaria;
    
    public Complejo() {
        this.parteReal = 0.0;
        this.parteImaginaria = 0.0;
    }
    
    public Complejo(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }
    
    public Complejo sumar(Complejo otroComplejo) {
        double sumaParteReal = this.parteReal + otroComplejo.parteReal;
        double sumaParteImaginaria = this.parteImaginaria + otroComplejo.parteImaginaria;
        return new Complejo(sumaParteReal, sumaParteImaginaria);
    }
    
    public Complejo restar(Complejo otroComplejo) {
        double restaParteReal = this.parteReal - otroComplejo.parteReal;
        double restaParteImaginaria = this.parteImaginaria - otroComplejo.parteImaginaria;
        return new Complejo(restaParteReal, restaParteImaginaria);
    }
    
    public void imprimir() {
        System.out.println("(" + parteReal + ", " + parteImaginaria + "i)");
    }
}
