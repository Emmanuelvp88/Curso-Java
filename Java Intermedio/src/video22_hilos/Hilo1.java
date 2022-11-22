package video22_hilos;

public class Hilo1 extends Thread{

/*En este primer modo de crear un Hilo es Hredando la clase "Thread" */    
    @Override
    public void run(){//Este es un metodo que aplica el polimorfismo ya que pertenese a la clase Padre "Thread" heredada.
        for(int i = 0; i<=5;i++){
            System.out.println("Proceso 1.");
        }
    }
    
}
