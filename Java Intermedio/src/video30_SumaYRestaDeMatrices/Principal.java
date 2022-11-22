package video30_SumaYRestaDeMatrices;

public class Principal {

    public static void main(String[] args) {
        int matriz_uUno[][] = new int[3][3];
        int matriz_Dos[][] = new int[3][3];
        int resultado[][] = new int[3][3];

        //LLenado de matriz_Dos
        for (int i = 0; i < matriz_uUno.length; i++) {
            for (int j = 0; j < matriz_uUno.length; j++) {
                matriz_uUno[i][j] = (int) (Math.random() * 5);
            }
        }
        //Llenado de matriz_Dos
        for (int i = 0; i < matriz_Dos.length; i++) {
            for (int j = 0; j < matriz_Dos.length; j++) {
                matriz_Dos[i][j] = (int) (Math.random() * 5);
            }
        }
        //Suma o Resta de Matrices almacenando En matriz "resultado"
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado.length; j++) {
                resultado[i][j] = matriz_uUno[i][j] + matriz_Dos[i][j];
            }
        }

        //*******Sistema de suma de matrices Que almacenan Numeros aleatorios.*****
        System.out.println("*******Sistema de suma de matrices Que almacenan Numeros aleatorios.*****\n");

        //Impresiones de matrices
        for (int i = 0; i < matriz_uUno.length; i++) {
            if (i == 0) {
                System.out.println("Matriz Uno      Matriz Dos      Matriz Resultado");
            }

            //Impresion de matriz_Uno
            for (int j = 0; j < matriz_uUno.length; j++) {
                System.out.print("[" + matriz_uUno[i][j] + "]");
            }

            //Impresion de espacion entre filas (Signo de "+")
            if (i == 1) {
                System.out.print("   +   ");
            } else {
                System.out.print("       ");
            }

            //Impresion de matriz_Dos
            for (int j = 0; j < matriz_Dos.length; j++) {
                System.out.print("[" + matriz_Dos[i][j] + "]");
            }

            //IMpresion de Espacios y signo de "="
            if (i == 1) {
                System.out.print("   =   ");
            } else {
                System.out.print("       ");
            }

            //Impresiond e matriz resultado
            for (int j = 0; j < resultado.length; j++) {
                System.out.print("[" + resultado[i][j] + "]");
            }

            //Salto de linea en el termino de cada fila de las 3 matrices
            System.out.println("");
        }

    }
}
