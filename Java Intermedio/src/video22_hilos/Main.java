package video22_hilos;

public class Main {
    public static void main(String[] args) {
/*En este primer modo de crear un hilo, Creamos un objeto como lo sabemos aser normalmente, para instanciar 
 *la clase "Hilo1" y poder ejecutar el metodo "run" que contiene. */
        Hilo1 hilo1 = new Hilo1();
        
/*En este segundo modo tenemos que crear un objeto del tipo "Thread" y dentro de el 
 *tenemos que crear otro objeto del tipo de la clase que queremos ejecutar "Hilo2"*/        
        Thread hilo2 = new Thread(new Hilo2());   

/*Con el metodo "start();" podemos iniciar los hilos, pero tenemos que iniciarlo depues de que 
 *iniciomos o declaremos los objetos para instaciar la clase deaseada, esto es para que ombos 
 *procesesos se ejecuten simultaneamente.*/        
        hilo1.start();
        hilo2.start();
        
    }
}
