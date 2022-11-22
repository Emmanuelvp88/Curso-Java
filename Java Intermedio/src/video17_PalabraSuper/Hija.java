package video17_PalabraSuper;

public class Hija extends Padre {
      
    public void SaludarHija(){
        
/*La palabra super sirve para mandar a traer un metodo desde otra clase que previamente se heredada
*aqui mandamos a traer el metodo Saludar desde la clase padre que a sido previamente heredada
*y ejecutaremos el metodo Saludar del clase Hija, pero mandara el mensaje que contiene el metodo Saludar de la clase Padre.*/
        System.out.print("Hola, soy la clese hija pero contengo esto: ");
        super.SaludarPadre();
    }
}
