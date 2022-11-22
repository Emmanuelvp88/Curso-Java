package video23_HilosConParametros;

public class Main {

    public static void main(String[] args) {

        /*Creamos un objeto del tipo de la clase que queremos enviar datos "Instaciar"
         *Y mandamos un paramatro donde la recibira un metodo*/
        Proceso1 hilo1 = new Proceso1(" Hilo1");
        Proceso1 hilo2 = new Proceso1(" hilo2");
        Proceso1 hilo3 = new Proceso1(" hilo3");
        
        /*Aqui asemos uso de los objetos pero mandando un parametro a la vez
        * "VolorCondicion" es el metodo con el que instanciamos el objeto para mandar dentro 
        *un parametro el cual lo recibira un metodo del mismo nombre "ValorCondicion"  */
        hilo1.ValorCondicion(6);
        hilo2.ValorCondicion(8);
        hilo3.ValorCondicion(9);

        //El metodo "start()" sirve para iniciar los hilos.
        hilo3.start();
        hilo2.start();
        hilo1.start();
    }
}
