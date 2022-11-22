package video24_EstadosDeUnHilo;

public class Hilos extends Thread {

    /*Este constructor es para ponerle numbre aun hilo, mandando parametros e intanciando
 * la clase padre a la clase hija y asi poder mandar parametros entre si.*/
    public Hilos(String nombre) {
        super(nombre);
    }

    @Override
    public void run() {

        for (int i = 0; i <= 5; i++) {
            System.out.println(i + " " + getName());
            try {
                Hilos.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("El error esta en el for.." + e);
            }
        }
        System.out.println("");
    }
}
