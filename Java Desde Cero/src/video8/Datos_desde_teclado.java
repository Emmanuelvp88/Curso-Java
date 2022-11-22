package video8;

import java.util.Scanner;

public class Datos_desde_teclado {

    public static void main(String args[]) {

        int valor1 = 0, valor2 = 0;
        int resultado = 0;
        int opcion = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("*****Programa de Calculadora*******");
        System.out.println("");
        System.out.println("**********Opciones**********");
        System.out.println("1.- Suma");
        System.out.println("2.- Resta");
        System.out.println("3.- Multiplicacion");
        System.out.println("4.- Divicion \n");

        System.out.println("****¿Que opéracion desea realizar?*****");
        opcion = in.nextInt();
        
        if (opcion == 1) {
            System.out.println("Ingrese su primer valor para su suma");
            valor1 = in.nextInt();
            System.out.println("Ingrese su segundo valor para sus suma ");
            valor2 = in.nextInt();
           resultado = valor1 + valor2;
            System.out.println("El resultado de su suma es " + resultado );
        }else if(opcion == 2){
            System.out.println("Ingrese el primer valor para su resta");
            valor1 = in.nextInt();
            System.out.println("Ingrese su segundo valor para su resta");
            valor2 = in.nextInt();
            resultado = valor1 - valor2;
            System.out.println("El reultado de su resta es " + resultado);
        }else if (opcion == 3){
            System.out.println("Ingrese su primer valor para su  multiplicacion");
            valor1 = in.nextInt();
            System.out.println("Ingrese su segundo valor para su multiplicion");
            valor2 = in.nextInt();
            resultado = valor1 * valor2;
            System.out.println("El resultado de su multiplicacion es " + resultado);
        }else if(opcion == 4){
            System.out.println("Ingrese su primer valor para su divicion");
            valor1|= in.nextInt();
            System.out.println("Ingrese su segundo valor para su divicion");
            valor2 = in.nextInt();
            resultado = valor1 / valor2;
            System.out.println("El resultado de su divicion es " + resultado);
        }else {
            System.out.println("La opcion que seleccionaste no es valida ");
            
        }
                
      }
    }
