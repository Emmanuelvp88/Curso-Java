package video19;

import java.util.Scanner;

public class Vectores {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int vector[] = new int[5];
        /*En los segundos corchetes se ingresa la longitud del vector
        determina cuantas casillas va tener el vector para poder almacenar numeros*/

        System.out.println("ingrese la primer posicion del vector");
        vector[0] = in.nextInt();
        System.out.println("Ingrese la segunda posicion del vector");
        vector[1] = in.nextInt();
        System.out.println("Ingrese la tercera posicion del vector");
        vector[2] = in.nextInt();
        System.out.println("Ingrese la cuarta posicion del vector");
        vector[3] = in.nextInt();
        System.out.println("Ingrese la quinta pocicion del vector ");
        vector[4] = in.nextInt();

        System.out.print("*****Estos son los Numeros gurardados " + vector[0] + "," + vector[1] + ","
                + vector[2] + "," + vector[3] + "," + vector[4] + "*****");
    }
}
