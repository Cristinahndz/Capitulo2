
package rombo;


public class Rombo {

   
    public static void main(String[] args) {
        int columnas=1;
        int filas=1;
        int limizquierda=3,limderecha=3;

       while(filas<=5){

        columnas=1;
        while(columnas <=5){
         if(columnas>=limizquierda && columnas <=limderecha){
         System.out.print("*");
}
        else{
         System.out.print(" ");
}
        columnas++;
}
      System.out.println("");
      filas++;
      if(filas<=3){
         limizquierda--;
         limderecha++;
}
else{
        limizquierda++;
        limderecha--;
       
}

}
      
    
    }
}
