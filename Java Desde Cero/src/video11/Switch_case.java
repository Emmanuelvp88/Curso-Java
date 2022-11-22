package video11;

import java.util.Scanner;

public class Switch_case {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2, resultado, operacion;

        System.out.println("**Bienvenido a al calculadora con Swith-case**");
        System.out.println("****************Operaciones****************\n");
        System.out.println("1.- Suma");
        System.out.println("2.- resta");
        System.out.println("3.- Multiplicacion");
        System.out.println("4.- Divicion\n");
        System.out.println("Seleccione la operacion que desea realizar");
        operacion = in.nextInt();
        System.out.println("Cual es si primera sifra");
        num1 = in.nextInt();
        System.out.println("Cual es su segunda cifra");
        num2 = in.nextInt();
        switch (operacion) {
            case 1:
                resultado = num1 + num2;
                System.out.println("El resultado de su uma es: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("El resultado de su resrta es: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("El resultado de su multiplicacion es: " + resultado);
                break;
            case 4:
                resultado = num1 / num2;
                System.out.println("El resultado de su divicion es: " + resultado);
                break;

            default:
                System.out.println("La opcion seleccionada no es valida");
        }

    }
}
