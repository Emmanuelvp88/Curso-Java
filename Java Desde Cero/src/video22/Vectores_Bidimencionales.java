package video22;

import java.util.Scanner;

public class Vectores_Bidimencionales {

    public static void main(String[] args) {
        int filas = 0;
        int columnas = 0;
        int contador = 1;
        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese cuantas filas desea que tenga su matriz");
        filas = in.nextInt();
        System.out.println("Ingrese cuantas columnas desea que tenga su matriz");
        columnas = in.nextInt();

        int matriz[][] = new int[filas][columnas];

        for (int j = 0; j < filas; j++) {
            for (int i = 0; i < columnas; i++) {

                matriz[j][i] = contador;
                contador++;
                System.out.print("[" + matriz[j][i] + "]");
            }
            System.out.println("");
        }
    }
}
