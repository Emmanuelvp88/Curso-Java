package video9_POO_lavadora;

import video8_POO_lavadora.Funciones;
import java.util.Scanner;

public class LavadoraMain {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int tipRopa, kilos;

        System.out.println("Bienvenido a la lavadora Samsung\n");
        System.out.println("Que tipo de Ropa desea lavar");
        System.out.println("1.- Ropa de Color  / lavado Rustico ");
        System.out.println("2.- Ropa Blancla / lavado suave");
        tipRopa = in.nextInt();
        System.out.println("Cuantos kilos desea lavar? maximo 12K");
        kilos = in.nextInt();

        Funciones instancia = new Funciones(tipRopa, kilos);
        instancia.setTipRopa(2);
        System.out.println("el tipo de ropa establecido por default " + instancia.getTipRopa());
        instancia.SicloFinalizado();

    }
}
