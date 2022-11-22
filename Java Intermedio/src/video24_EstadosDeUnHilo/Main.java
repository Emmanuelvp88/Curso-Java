package video24_EstadosDeUnHilo;

public class Main {

    public static void main(String[] args) {

        Hilos hilo1 = new Hilos(" Hilo1");
        Hilos hilo2 = new Hilos(" Hilo2");

        //El metodo "start()" sirve para inicializar un Hilo.
        hilo1.start();

        try {
/* El metodo "sleep()" sirve para darle un delay aun proceso del hilo pero este metodo
 * siempre deve de estsr dentro de un "dry" "catch()" ya que deve de ser a prueba de errores */
            hilo1.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Este error es el el hilo1" + e);
        }

        hilo2.start();//El metodo "start()" sirve para inicializar un Hilo.
        hilo2.stop();//El metodo "stop()" sirve para darle muerte a un Hilo.
        try {
            hilo2.sleep(1000);// Este metodo "sleep()" le da un delay al proceso de un hilo.
        } catch (InterruptedException e) {
            System.out.println("El error esta en el hilo2" + e);
        }
    }
}
