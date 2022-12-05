package video6_POO_Suma;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese si primer valor");
        int num1 = in.nextInt();
        
        System.out.println("Ingrese su segunda sifra");
        int num2 = in.nextInt();
        
        Suma objeto = new Suma(num1, num2);
        objeto.Operacion();//tenemos que mandar traer al metodo operacion para que funcione
        objeto.Resultado();
        
    }
}