package video18;

import java.util.Scanner;

public class Length_substring {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String cadena1 = "";
        int desde = 0, hasta = 0;

        /*El metodo length solo sive para contar el numero de caracteres 
        que tiene cierta variable y mostrarlo en numeros, puedes asignarla o almacenarla
        en una varible de tipo entero, Ejemplo: int num_de_caracteres = cadena1.lenght();*/
        System.out.println("***Bienvenido al Sistema contador de caracteres***");
        System.out.println("Ingrese una cadena de caracteres");
        cadena1 = in.nextLine();
        System.out.println("la cadena de caracteres que ingreso tiene " + cadena1.length() + " numero de caracteres\n");

        /*El metodo substring sirve para mostrar ciertos numeros de caracteres de una cadena de texto
        Ejemplo: La cadena "Emmanuel" se divide asi = "0E1m2m3a4n5u6e7l8" tiene 8 caracteres pudes decirle desde que caracter hasta que caracter
        deseas que te muestre empezando de 0 y terminando en 8 Ejemplo: si le pido que me muestre del caracter
        2 al 6 solo me mostrara "manu" porque me muestra del 2 en adelante hasta el 6.*/
        System.out.println("Ahora indique desde que caracter desea que empiece a mostrarse");
        desde = in.nextInt();
        System.out.println("Ahora indique hasta que caracter desea que se muestre");
        hasta = in.nextInt();
        System.out.println(cadena1.substring(desde, hasta));
    }
}
