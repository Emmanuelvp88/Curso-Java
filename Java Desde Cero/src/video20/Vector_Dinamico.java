package video20;

import java.util.Scanner;

public class Vector_Dinamico {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int longitud = 0;

        System.out.println("******Bienvenido al vector dinamico****");
        System.out.println("¿De cuantos espacios desea que sea su vector? ");
        longitud = in.nextInt();
        /*Pedimos datos desde teclado la almacenamos en una variable 
        misma que determina la longitud que tendra el vector*/
        
        int vector[] = new int[longitud];
        /*los vectores inician a almacenar desde la pocicion 0, osea que
        la pocicion 0 equivale a la primer casilla*/
        
        /*Este primer for esta encargado de recopilar los numeros que ingrese
        el usuario desde teclado*/
        for (int i = 0; i < vector.length; i++) {
            System.out.println("ingrese la sifra numero: " + (i + 1));
            vector[i] = in.nextInt();
        }
        /*Este for segundo es solo para imprimor los datos almacenados en el 
        primer for*/
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "]");
        }
    }
}
