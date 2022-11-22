package video25_SincronizacionDeHilos;

public class Main {

    public static void main(String[] args) {
//Creamos 4 hilos intanciando las clases, oviamente todas las clases hijas tienen el metodo "run"
        Hilo1 hilo1 = new Hilo1();//calse Hilo1
        Hilo2 hilo2 = new Hilo2();//calse Hilo2
        Hilo3 hilo3 = new Hilo3();//calse Hilo3
        Hilo4 hilo4 = new Hilo4();//calse Hilo4

        
//Inicaimos el primer Hilo, y le damos un delay de 300Mls, y asi con todos los Hilos.        
        hilo1.start();
        try {
            hilo1.sleep(300);
        } catch (InterruptedException e) {
            System.out.println("El error esta en el hilo1: " + e);
        }
        hilo2.start();
        try {
            hilo2.sleep(300);
        } catch (InterruptedException e) {
            System.out.println("El error est en hilo2" + e);
        }
        hilo3.start();
        try {
            hilo3.sleep(300);
        } catch (InterruptedException e) {
            System.out.println("El error esta en ehilo3" + e);
        }
        hilo4.start();
        try {
            hilo4.sleep(300);
        } catch (InterruptedException e) {
            System.out.println("El eeror esta en hilo4" + e);
        }
    }
}
