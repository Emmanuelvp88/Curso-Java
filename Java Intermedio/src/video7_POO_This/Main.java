
package video7_POO_This;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ingrese la base del rectangulo: ");
        int base = in.nextInt();
        
        System.out.print("Ingrese la altura del rectangulo: ");
        int altura = in.nextInt();
        
        Area instancia = new Area(altura,base);
        instancia.ResutadoArea();
    }
}
