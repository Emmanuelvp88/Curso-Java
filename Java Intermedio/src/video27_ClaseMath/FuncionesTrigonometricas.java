package video27_ClaseMath;

public class FuncionesTrigonometricas {
    public static void main(String[] args) {
        
        double radianes = 0, grados = 45, resultado = 0;
/*En esta funcion de sacar el seno, coseno y tangente de ciertos grados de un angulo 
 * es necesario aser la converciond e grados a radianes debido a que la clase Math solo 
 *acepta y devulve los datos de un angulo en radianes */        
        radianes = Math.toRadians(grados);//Conversion de grados a radianes
        
        resultado = Math.sin(radianes);//Operacion para sacar el seno de un angulo en grados.
        System.out.println("El resultado del seno de: " + grados + "° es de: " + resultado );
        
        resultado = Math.cos(radianes);//Operacion para sacar el coseno de un angulo en grados.
        System.out.println("El resultado del coseno de: " + grados + "° es de: " + resultado);
        
        resultado = Math.tan(radianes);//Operacion para sacar la tangente de un angulo en grados.
        System.out.println("El resultado de la tangente de: " + grados + "° es de: " + resultado);
        
        double valorEnRadianes = 0.707;
        
        radianes = Math.acos(valorEnRadianes);//Operacion para sacar el arco coseno de un angulo en grados
        grados = Math.toDegrees(radianes);//Posteriormente asemos la conversion de radianes agrados para mostralo en grados.
        System.out.println("El resultado de Arco coseno de: " + valorEnRadianes +  " es de: " + grados + "°");
        
        radianes = Math.asin(valorEnRadianes);//Operacion para sacar el arco seno de un angulo en grados
        grados = Math.toDegrees(radianes);
        System.out.println("El resultado del Arco seno de: " + valorEnRadianes + " es de: " + grados + "°");
              
        radianes = Math.atan(valorEnRadianes);//Operacion para sacar el arco tangente de un angulo en grados
        grados = Math.toDegrees(radianes);
        System.out.println("El resultado del Arco tangente de: " + valorEnRadianes + " es de: " + grados + "°");
    }
}
