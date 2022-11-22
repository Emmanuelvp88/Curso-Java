package video22_hilos;


public class Hilo2 implements Runnable{
    
/*En este Segundo modo de crear un Hilo es implementada la clase "Runnable" */        
    @Override
    public void run(){//Este es un metodo que aplica el polimorfismo ya que pertenese a la clase Padre "Runnable" Implementada.
        for(int i = 0; i <= 5; i++){
            System.out.println("Proceso 2.");
        }
    }
}
