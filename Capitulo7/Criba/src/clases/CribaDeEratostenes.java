
package clases;


public class CribaDeEratostenes {
    
public static void main(String[] args){
    boolean[]esPrimo=new boolean[1000];

//Aplicar la criba de eratostenes
        for(int i=2; i<esPrimo.length;i++){
            esPrimo[i]=true;
        }
            for (int i=2; i*i<esPrimo.length; i++){
                if (esPrimo[i]){
                    for(int j=i*i; j<esPrimo.length; j+=i){
                        esPrimo[j]=false;
                    }
                }

            }

//Imprime los numeros primos encntrados
System.out.println("Numeros primos entre 2 y 999: ");
    for(int i=2; i<esPrimo.length; i++){
        if (esPrimo[i]){
            System.out.print(i+" ");
        }
    }
}


}
