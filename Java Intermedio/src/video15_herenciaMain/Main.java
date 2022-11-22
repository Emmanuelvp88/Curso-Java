package video15_herenciaMain;
import video15_herenciaFunciones.HijaSuma;
import video15_herenciaFunciones.HijaResta;

public class Main {
    public static void main(String[] args) {
        HijaSuma intnacia = new HijaSuma();
        intnacia.PedirDatos();
        intnacia.Suma();
        intnacia.Resultado();
        
        HijaResta instancia = new HijaResta();
        instancia.PedirDatos();
        instancia.Resta();
        instancia.Resultado();
        
    }
}
