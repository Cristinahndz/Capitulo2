
package CLASES;

//clase Fecha y tres variables de instancia
public class Fecha {
    
int mes;
int dia;
int año;

//construcor que inicializa las tres variables de instancia
 Fecha(int mes, int dia, int año){

this.mes=mes; //acceder al mes 
this.dia=dia;
this.año=año;

}

//metodos establecer y obtener para cada variable de instancia 
    public void setmes(int mes){
    this.mes=mes;
    }

    public int getmes(){
    return mes;
    }
    public void setdia(int dia){
    this.dia=dia;
    }
    public int getdia(){
    return dia;
    }
    public void setaño(int año){
    this.año=año;
    }
    public int getaño(){
    return año;
    }

//metodo mostrarFecha
    public void mostrarFecha(){

    System.out.println(mes+"/"+dia+"/"+año);

    }


}
