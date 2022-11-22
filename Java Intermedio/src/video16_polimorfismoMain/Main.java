package video16_polimorfismoMain;

//devemos imortar la clase que vamos a utilizar para el polimorfismo
import video16_polimorfismoFunciones.Hijaresta;
import video16_polimorfismoFunciones.Padre;
import video16_polimorfismoFunciones.Hijasuma;

public class Main {
    public static void main(String[] args) {
        
//Creamos objetos del tipo de la clase con el que queremos que haga la operaciones 
//ya sea la clase Hijaresta o  HIjasuma, debemos de crear un objeto con difernete nombre
//y despues mandar a llamar a los metodos con el objeto creado.
        
//Al instaciar el metodo funcion, savemos que operacion debe de realizar este contiene el polimorfismo.        
        Padre Instacia = new Hijaresta();
        Instacia.Pedirdatos();
        Instacia.Funcion();
        Instacia.Resultado();
        
        
//Debemos de llamar diferente al segunndo objeto que del primero         
        Padre instacia = new Hijasuma();
        instacia.Pedirdatos();
        instacia.Funcion();
        instacia.Resultado();
    }
}
