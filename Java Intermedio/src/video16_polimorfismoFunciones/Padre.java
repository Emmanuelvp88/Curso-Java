package video16_polimorfismoFunciones;
import java.util.Scanner;

public abstract class Padre {
    
    protected int valor1,valor2,resultado;
    Scanner in = new Scanner(System.in);
    
    public void Pedirdatos(){
        System.out.print("Ingrese su primer valor: ");
        valor1 = in.nextInt();
        
        System.out.print("Ingrese su segundo valor: ");
        valor2 = in.nextInt();
    }
    public abstract void Funcion();
    
    public void Resultado(){
        System.out.println("El resultado de su operacion es: " + resultado);
    }
}
