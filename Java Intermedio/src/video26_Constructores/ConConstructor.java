package video26_Constructores;
import java.util.Scanner;

public class ConConstructor {
    
    public ConConstructor(){
         String nombre;
         Scanner in = new Scanner(System.in);
         
         System.out.print("Ingrese su nombre: ");
         nombre = in.nextLine();
         
         System.out.println("El nombre que ingresaste es: " + nombre );
    }
}
