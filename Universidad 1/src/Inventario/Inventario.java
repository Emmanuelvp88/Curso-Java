
package Inventario;

/**
 *
 * @author Emmanuel Villalva
 */
import java.util.*;
import java.util.Scanner;

public class Inventario {
    public static void main(String[] args) {
        // Your code here!
        String nombre = "";
        int cantidad = 0,p = 0, p1 = 0, p2 = 0, p3 = 0;
        Scanner in = new Scanner(System.in);
        
        System.out.println("*************Bienvenido al sistema de Inventario");
        System.out.println("Hola cual es tu nombre?");
        nombre = in.nextLine(); 
        System.out.println("Hola " + nombre +  " dime cuantos productos tienes?");
        cantidad = in.nextInt();
        
        int vector[] = new int[cantidad];
        for(int i = 0; i < vector.length; i++){
            System.out.println("Hola " + nombre +  " dime la cantidad de piezas del producto: " + (i+1));
               vector[i]= in.nextInt();
        }
        
        for (int j = 0; j < vector.length; j++) {
            if(vector[j] >= 30){
                System.out.println("Producto " + (j+1)+ " Tiene " + vector[j] + " Piezas: Abastecido");
            }else if(vector[j] < 30 && vector[j] >= 20){
                System.out.println("Producto " + (j+1)+ " Tiene " + vector[j] + " Piezas: con existencia");
            }else if(vector[j] < 20 && vector[j] >= 10){
                System.out.println("Producto " + (j+1)+ " Tiene " + vector[j] + " Piezas: Problemas de abasteciminto");
            }else if(vector[j] < 10 && vector[j] >= 0){
                System.out.println("Producto " + (j+1)+ " Tiene " + vector[j] + " Piezas: Requiere Abasteciminto");
            }
        }
    }
}