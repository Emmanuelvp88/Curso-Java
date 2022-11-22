package video15_16;

public class Ejercicios_bucles_susecicionfibonaci {

    public static void main(String[] args) {
        System.out.println("Ejercicios con for");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
            if (i <= 9) {
                System.out.print(",");
            }
        }
        System.out.println("");
        int j = 99;
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + "," + j);
            j--;
            if (i <= 4) {
                System.out.print(",");
            }
        }
        System.out.println("");

        int a = 0, b = 1, c = 0;
        for (int i = 1; i <= 9; i++) {
            System.out.print(a + ",");
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(a);

        System.out.println("");
        System.out.println("Ejercicios con while");
        int i = 1;
        while (i <= 10) {
            System.out.print(i);
            if (i <= 9) {
                System.out.print(",");
            }
            i++;
        }
        System.out.println("");
        i = 1;
        j = 99;
        while (i <= 5) {
            System.out.print(i + "," + j);
            if (i <= 4) {
                System.out.print(",");
            }
            i++;
            j--;
        }
        System.out.println("");
        i = 0;
        a = 0;
        b = 1;
        c = 0;
        while (i < 9) {
            System.out.print(a + ",");
            c = a + b;
            a = b;
            b = c;
            i++;
        }
        System.out.println(a);
        System.out.println("");

        System.out.println("Serie con do-while");
        i = 1;
        do {
            System.out.print(i);
            if (i <= 9) {
                System.out.print(",");
            }
            i++;
        } while (i <= 10);
        System.out.println("");
        i = 1;
        j = 99;
        do {
            System.out.print(i + "," + j);
            if (i <= 4) {
                System.out.print(",");
            }
            i++;
            j--;
        } while (i <= 5);
        System.out.println("");
        a = 0;
        b = 1;
        c = 0;
        i = 0;
        do {
            System.out.print(a);
            c = a + b;
            a = b;
            b = c;
            if (i <= 8) {
                System.out.print(",");
            }
            i++;
        } while (i <= 9);
    }
}
