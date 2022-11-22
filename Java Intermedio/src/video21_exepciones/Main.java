package video21_exepciones;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num1, num2, resultado;
        Scanner in = new Scanner(System.in);

        /*La palabra reservada "try" significa Tratar, aqui se ingresa todo el codigo que 
        uno quiera que tenga ecepciones de error y que el programa no se quiebre al tratar 
        de ejecutar codigo o alguna funcion que no se puede ejecutar ,no se quebrara solo no lo ejecutara */
        try {
            System.out.println("Ingrese su primer sifra.");
            num1 = in.nextInt();

            System.out.println("Ingrese su segunda sifra.");
            num2 = in.nextInt();

            resultado = num1 / num2;
            System.out.println("El resultadi de su divicion es: " + resultado);
        }
        
        /*La  palabra "catch" significa Capturar, nos permite ejecutar el comportamiento que queremos 
        que tenga nuestro programa en dado caso que alla algun error que no tuvimos la precaucion de 
        de poder validar.esta palabra nos permite ejecutar algun mensaje de ecepcion
        de advertencia o de error de programa y mostrarlo correctamente y no ver en pantalla 
        que el progrma se quebro inesperadamente. esta palabra va en conjunto con la palabra "try" */ 
         catch (Exception e) {
            System.out.println("Error de progrma.." + e);
        }
        
        /*La palabra "finally"  nos permite ejecutar codigo aun despues de que alla abido un error 
        en el codigo, este se ejecutara sin importar nada simpre se ejecutara.*/ 
        finally {
            System.out.println("Programa terminado..");
        }
    }
}
