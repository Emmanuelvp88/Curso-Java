package video17;

import java.util.Scanner;

public class Metodo_equals {

    public static void main(String args[]) {
        String nombre1 = "";
        String nombre2 = "";
        String contraseña = "";

        Scanner in = new Scanner(System.in);
        System.out.println("*********Bienvenido al sistema comparador de nombres*******");
        System.out.println(".-Ingrese el primer nombre");
        nombre1 = in.nextLine();
        System.out.println(".-Ingrese su segundo nombre");
        nombre2 = in.nextLine();
        /*el metodo equals es para comparar una cadean de caracteres de manera
        muy exacta, si quieres que ignore mayusculas de minisculas deveras 
        agregar Ignorecase devera de qudar asi "equalsIgnoreCase".*/
        if (nombre1.equalsIgnoreCase(nombre2)) {
            System.out.println("Los nombre son identicos");
        } else {
            System.out.println("Los nombre no coinciden");
        }
        System.out.println("\n");
        System.out.println("*****Bienvenido al Sistema de Inicio de Sesion*****");
        System.out.println(".-Ingrese su nombre de usuario");
        nombre1 = in.nextLine();
        System.out.println(".-Ingrese su password");
        contraseña = in.nextLine();
        if (contraseña.equals(".88dice") && nombre1.equals("Emmanuel")) {
            System.out.println("Inicio de sesion correcto");
        } else {
            System.out.println("Nombre de usuario o contrasña incorrectos");
        }

    }
}
