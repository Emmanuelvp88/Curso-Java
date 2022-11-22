
package video6_POO_Suma;

import java.util.Scanner;

public class Main {              
       
    public static void main(String[] args) {
         
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese su primer sifra");
         int  num1 = in.nextInt();
         
         System.out.println("Ingrese el segundo numero");
         int num2 = in.nextInt();
         
         Suma instancia = new Suma(num1,num2);
         instancia.Resultado();
    }
}
