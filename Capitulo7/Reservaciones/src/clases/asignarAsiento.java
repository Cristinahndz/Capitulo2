
package clases;


public class asignarAsiento {
    
public static int asignarAsiento(boolean[]asientos, int inicio, int fin){
    for(int i=inicio; i<fin; i++){
        if(!asientos[i]){
            asientos[i]=true;
                return i+1;
        }

    }
                return -1;
}





public static void imprimirPaseAbordar(int asiento, String seccion){
    System.out.println("----------------");
    System.out.println("PASE DE ABORDAR");
    System.out.println("Numero de asiento"+asiento);
    System.out.println("Numero de seccion"+seccion);

}


}
