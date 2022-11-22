package video7;

import java.util.Scanner;

public class Opereciones {

    public static void main(String[] args) {

        int num1 = 7, num2 = 9, resultado = 0;
        int opcion = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Elija la operacion que desea realizar");
        System.out.println("");
        System.out.println("1.- suma");
        System.out.println("2.- Resta ");
        System.out.println("3.- Multiplicacion");
        System.out.println("4.- Divicion");
        opcion = in.nextInt();

        if (opcion == 1) {
            resultado = num1 + num2;
            System.out.println("El resultado de su suma es " + resultado);
        } else if (opcion == 2) {
            resultado = num1 - num2;
            System.out.println("El resultado de tu resta es " + resultado);
        } else if (opcion == 3) {
            resultado = num1 * num2;
            System.out.println("El resultado de tu multiplicacion es " + resultado);
        } else if (opcion == 4) {
            resultado = num1 / num2;
            System.out.println("El resultado de tu multiplicacion es " + resultado);
        }else {
            System.out.println("La opcion tecleada no existe ");
        }

    }
}
