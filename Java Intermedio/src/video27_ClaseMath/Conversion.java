package video27_ClaseMath;

public class Conversion {
    public static void main(String[] args) {
//La variable tiene que ser del tipo "double" ya que las sifras manejan muchos decimales       
        double grados = 45, radianes;
/*La conversion de grados a radianes es necesario porque las funciones trigonometricas 
        * de la clase "Math" en java solo acepta y devuelve los angulos en radianes. */
        radianes = Math.toRadians(grados);
        System.out.println("La conversion de: " + grados+"° es igual a: " + radianes + " Radianes");
        grados = Math.toDegrees(radianes);
        System.out.println("La conversion de: " + radianes + " Radianes" + " es igual a: " + grados + "°");
        
    }
}
