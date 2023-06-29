
package clases;


public class SalariosVendedores {
    
public static void main(String[]args){

    int[]rangos= new int[9];

    int[]ventas={50,300,850,100,670,200,200,750,1100,20000};

        for(int i=0; i<ventas.length; i++){
            double salario=200+(0.09*ventas[i]);

                if(salario>=200 && salario<=299){
                rangos[0]++;
                }
                else if(salario>=300 && salario<=399 ){
                rangos[1]++;
                }
                else if(salario>=400 && salario<=499 ){
                rangos[2]++;
                }
                else if (salario>=500 && salario<=599 ){
                rangos[3]++;
                }
                else if(salario>=600 && salario<=699 ){
                rangos[4]++;
                }
                else if(salario>=700 && salario<=799 ){
                rangos[5]++;
                }
                else if(salario>=800 && salario<=899 ){
                rangos[6]++;
                }
                else if(salario>=900 && salario<=999 ){
                rangos[7]++;
                }
                else if(salario>=1000){
                rangos[8]++;
                }
System.out.println("Rango de salarios - Cantida de Vendedores");
System.out.println("-----------------------------------------");
System.out.println("$200 - $299   -    "+rangos[0]);
System.out.println("$300 - $399   -    "+rangos[1]);
System.out.println("$400 - $499   -    "+rangos[2]);
System.out.println("$500 - $599   -    "+rangos[3]);
System.out.println("$600 - $699   -    "+rangos[4]);
System.out.println("$700 - $799   -    "+rangos[5]);
System.out.println("$800 - $899   -    "+rangos[6]);
System.out.println("$900 - $999   -    "+rangos[7]);
System.out.println("$1000 en adelante   -    "+rangos[8]);
        }


    }

}
