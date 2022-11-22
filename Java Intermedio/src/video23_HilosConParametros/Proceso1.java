
package video23_HilosConParametros;

public class Proceso1 extends Thread {
    int parametro;
    
    
    /*Este es un constructor que utiliza el metodo Super para poder madar traer 
     * un parametro o un metodo desde otra calse sin nesecidad de usar la Instancia.*/
    public Proceso1(String NombreHilo){
        super(NombreHilo);
    }
    
   /*El metodo "run" es donde se fabrica los hilos y contiene lo que se va ejecutar en lso Hilo s
    *el metodo run es el mas impritante en los Hilos.*/  
    @Override
    public void run(){
        for(int i = 0; i<=parametro;i++){
            System.out.println(i + this.getName());
        }
        
//este es un salto de linea es para cada termino del for "Bucle" y se  encuentra entro del metodo run.
        System.out.println("");
    }
    
    
    /*Este metodo es para mandar a traer un parametro desde otra clase "Main", y es para 
     *darle un valor a la condicion dentro del for*/
    public void ValorCondicion(int valor){
        this.parametro = valor;
    }
}