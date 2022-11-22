package video26_Constructores;
import java.util.Scanner;

public class SinConstructor {
    private String nombre;
    Scanner in = new Scanner(System.in);
    
    public void PedirNombre(){
        System.out.print("Ingresa un nombre: ");
        nombre = in.nextLine();        
    }
    public void Imprimir(){
        System.out.println("El nombre que ingresaste es: " + nombre);
    }
}
