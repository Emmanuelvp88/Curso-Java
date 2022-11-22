package video17_PalabraSuper;

public class Main {   
    public static void main(String args[]){
        
/*Al instaciar el metodo Saludar de la clase hija, realmente veremos el resultado
*del metodo Saludar de la clase Padre ya que la clase hija contiene el metodo Saludar 
*de la clase Padre Gracias a La palabra reservada Super.*/

        Hija Instacia = new Hija();
        Instacia.SaludarHija();
        
        
    }
}
