package video15_herenciaMain;
import video15_herenciaFunciones.HijaSuma;
import video15_herenciaFunciones.HijaResta;

public class Main {
    public static void main(String[] args) {
        HijaSuma suma = new HijaSuma();
        suma.PedirDatos();
        suma.Suma();
        System.out.print("el resultado de tu suma es: " );
        suma.Resultado();
        
        HijaResta resta = new HijaResta();
        resta.PedirDatos();
        resta.Resta();
        System.out.print("El resultado de rsta es: ");
        resta.Resultado();
        
    }
}
