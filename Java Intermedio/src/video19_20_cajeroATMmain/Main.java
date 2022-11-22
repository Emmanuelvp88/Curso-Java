package video19_20_cajeroATMmain;

import video19_20_cajeroATM.Consulta;
import video19_20_cajeroATM.Padre;

public class Main {
        
    public static void main(String[] args) {
        Padre instacia = new Consulta();
        instacia.setSaldo(500);
        instacia.Operaciones();
                
        
    }
}
