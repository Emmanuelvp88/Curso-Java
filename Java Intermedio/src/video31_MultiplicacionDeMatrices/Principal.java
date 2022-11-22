package video31_MultiplicacionDeMatrices;

public class Principal {

    public static void main(String args[]) {
        int matriz_Uno[][] = new int[2][3];
        int matriz_Dos[][] = new int[3][2];
        int resultado[][] = new int[2][2];

        //LLenado de la Matriz_Uno
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matriz_Uno[i][j] = (int) (Math.random() * 5);

            }
        }
        //LLenado de matriz_Dos
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                matriz_Dos[i][j] = (int) (Math.random() * 5);
            }
        }
        for (int i = 0; i < 4; i++) {
            
        
        /*Multiplicacion de matrices. Alojando el resultado en la Matriz resultado./
        -*El llenado de la matriz resultado se hace conforme realizamos las operaciones de 
          multiplicar las matrices 1 y 2 en sus cordenadas correspondientes y las vamos 
          almacenando en la matriz resultado para que este llenos todos 
          sus campos a la hora de imprimirla.-*/
        if (resultado[0][0] == 0) {
            int temporal = (matriz_Uno[0][0] * matriz_Dos[0][0])
                    + (matriz_Uno[0][1] * matriz_Dos[1][0])
                    + (matriz_Uno[0][2] * matriz_Dos[2][0]);
            resultado[0][0] = temporal;
        } else if (resultado[1][0] == 0) {
            int temporal = (matriz_Uno[1][0] * matriz_Dos[0][0])
                    + (matriz_Uno[1][1] * matriz_Dos[1][0])
                    + (matriz_Uno[1][2] * matriz_Dos[2][0]);
            resultado[1][0] = temporal;
        } else if (resultado[0][1] == 0) {
            int temporal = (matriz_Uno[0][0] * matriz_Dos[0][1])
                    + (matriz_Uno[0][1] * matriz_Dos[1][1])
                    + (matriz_Uno[0][2] * matriz_Dos[2][1]);
            resultado[0][1] = temporal;
        } else if (resultado[1][1] == 0) {
            int temporal = (matriz_Uno[1][0] * matriz_Dos[0][1])
                    + (matriz_Uno[1][1] * matriz_Dos[1][1])
                    + (matriz_Uno[1][2] * matriz_Dos[2][1]);
            resultado[1][1] = temporal;
        }
        }
        //Impresion de Matrices
        for (int i = 0; i < 3; i++) {

            //IMpresion de Mtriz_Uno
            if (i < 2) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("[" + matriz_Uno[i][j] + "]");
                }
                if (i == 1) {
                    System.out.print("   x   ");
                } else {
                    System.out.print("       ");
                }
            } else {
                System.out.print("                ");
            }

            //IMpresion de Matriz_Dos
            if (i < 3) {

                for (int j = 0; j < 2; j++) {
                    System.out.print("[" + matriz_Dos[i][j] + "]");
                }
                if (i == 1) {
                    System.out.print("   =    ");
                } else {
                    System.out.print("        ");
                }
            }

            //Impresion de Matriz resultado
            if (i < 2) {
                for (int j = 0; j < 2; j++) {
                    System.out.print("[" + resultado[i][j] + "]");
                }
            }
            System.out.println("");
        }

    }
}
