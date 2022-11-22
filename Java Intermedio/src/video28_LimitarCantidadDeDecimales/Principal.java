package video28_LimitarCantidadDeDecimales;
import java.text.DecimalFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Principal {
    public static void main(String[] args) {
        double numero = 2;
        double raiz = Math.sqrt(numero);
        
        System.out.println("La raiz cuadrada de " + numero + " es igual a: " + raiz        );
        
        //Utilizando la clase DecimalFormat
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("La raiz cuadrada de " + numero + " es igual a: " + df.format(raiz));
        
        //Utilizando String.format
        System.out.println("La raiz cuadrada de " + numero + " es igual a: " + String.format("%.2f",raiz));
        
        //Utilizando la clase Math.round
        System.out.println("La raiz cuadrada de " + numero + " es igual a: " + (double)Math.round(raiz * 100d) / 100);

        //Utilizando la Clase BigDecimal
        BigDecimal bd = new BigDecimal(raiz);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        System.out.println("La raiz cuadrada de " + numero + " es igual a: " + bd.doubleValue());

    }
}
