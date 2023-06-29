
package metodos;

import java.util.Scanner;
import static metodos.VerificarParImpar.esPar;

public class pruebaEsparImpar {
    
    public static void main(String []args){

        Scanner scanner=new Scanner(System.in);

            System.out.println("Ingrese una secuencia de enteros: ");

                while(true){

                    int numero=scanner.nextInt();

                        if(numero==0){
                            break;
                        }
                        if(esPar(numero)){
                            System.out.println(numero+"es par");
                        }
                        else{
                            System.out.println(numero+"es impar");
                        }

                    }

    }


}
