package video15_herenciaFunciones;

import java.util.Scanner;

public class Padre {

    protected int valor1, valor2, resultado;
    Scanner in = new Scanner(System.in);

    public void PedirDatos() {

        System.out.print("Ingrese su primer valor: ");
        valor1 = in.nextInt();
        System.out.print("Ingrese su segundo valor: ");
        valor2 = in.nextInt();
    }

    public void Resultado() {
        System.out.println(resultado);
    }
}
