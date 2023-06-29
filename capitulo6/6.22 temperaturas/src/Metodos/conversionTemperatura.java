
package Metodos;


public class conversionTemperatura {
    
    public static double centigrados(double fahrenheit){
        double centigrados=5.0/9.0*(fahrenheit-32);

        return centigrados;
    }


    public static double fahrenheit(double centigrados){

        double fahrenheit= 9.0/5.0*(centigrados+32);

        return fahrenheit;

    }



}
