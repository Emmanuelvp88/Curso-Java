package video29_NumerosAleatorios;

public class Clase_uno {
    public static void main(String args[]){
        //Creamos un avariable de tipo entero        
        int num_aleatorio;
         
        /*Con al calse Math.random() y el numero 100 hacemos que el programa 
         *seleccione un numero aleatorio que va del 0 al 100 y si cambiamos el 100
         * por el 1000 buscara un nuero aleatorio del 0 al 1000*/
        num_aleatorio = (int) (Math.random() * 100);
        System.out.println(num_aleatorio);
    }
}
