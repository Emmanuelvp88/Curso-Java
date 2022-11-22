package video3_Prueba_de_Logica;

import java.util.Scanner;

public class Palabrainvertida {

    public static void main(String[] args) {

        int numCaracteres = 0;
        String cadena1 = "", cadena2 = "";
        Scanner in = new Scanner(System.in);
        
        System.out.println("Engrese una cadena de texto");
        cadena1 = in.nextLine();
        
        numCaracteres = cadena1.length();
        
        while (numCaracteres != 0) {
            cadena2 += cadena1.substring(numCaracteres - 1, numCaracteres);
            numCaracteres--;
        }
        System.out.println(cadena2);
    }

}
