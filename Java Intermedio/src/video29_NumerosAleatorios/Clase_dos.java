package video29_NumerosAleatorios;

import java.util.Random;

public class Clase_dos {
    public static void main(String args[]){
        
        int num_aleatorio = 0;        
        Random r = new Random();
        
        /*Dependiendo del metodo que instanciemos al objeto (r.nextDouble, r.nextInt)
        es el resultado que ercibamos en numeros aleatorios entre enteros y decimales
        y el * 100 significa el rando que tendremos entre el 0 y el 100 para que 
        el programa escoja un numero aleatorio.*/
        num_aleatorio = (int) (r.nextDouble() * 100);
        System.out.println(num_aleatorio);
    }
}
