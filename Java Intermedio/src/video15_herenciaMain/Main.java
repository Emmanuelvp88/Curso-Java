package video15_herenciaMain;
import video15_herenciaFunciones.HijaSuma;
import video15_herenciaFunciones.HijaResta;

public class Main {
    public static void main(String[] args) {
        HijaSuma suma = new HijaSuma();
        suma.PedirDatos();
        suma.Suma();
        suma.Resultado();
        
        HijaResta resta = new HijaResta();
        resta.PedirDatos();
        resta.Resta();
        resta.Resultado();
        
    }
}
