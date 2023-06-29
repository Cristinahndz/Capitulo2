
package productoenterosimpares;


public class Productoenterosimpares {

    
    public static void main(String[] args) {
        long producto=1;

         for(int i=1; i<=30; i+=2){
        producto*=i;
    }
    System.out.println("El producto es: "+producto);

}
}