package video8_POO_lavadora;

public class Funciones {
    
    private int kilos,llenado,tipRopa,lavCompleto,secCompleto;
    
    public Funciones(int tipRopa, int kilos){
        this.tipRopa = tipRopa;
        this.kilos = kilos;
    }
    private void Llenado(){
        if (kilos <= 12) {
            System.out.println("Llenando...");
            System.out.println("Llenado completo.");
            llenado = 1;
        } else{
            System.out.println("Carga exesiva favor de revisar la carga");
        }
    }
    private void Lavado(){
        Llenado();
        if(llenado == 1){
        if(tipRopa == 1){
            System.out.println("Ropa blaca / lavado suave");
            System.out.println("Lavando...");
            System.out.println("Lavado completo.");
            lavCompleto = 1;
        }else if(tipRopa == 2){
            System.out.println("Ropa de color / lavado Rustico");
            System.out.println("Lvando...");
            System.out.println("Lavado completo.");
            lavCompleto = 1;
        }else{
            System.out.println("El tipo de ropa no esta disponible, se lavara como "
                    + "ropa de color");
            System.out.println("Lavando...");
            System.out.println("Lavado terminado.");
            lavCompleto = 1;
        }
       }
    }
    private void Secado(){
        Lavado();
        if(lavCompleto == 1){
            System.out.println("Secando...");
            System.out.println("Secado Terminado.");
            secCompleto = 1;
        }
    }
    
    public void SicloFinalizado(){
        Secado();
        if(secCompleto == 1){
            System.out.println("El siclo de lavado esta completo");
        }
    }
    
    //Metodo Setter Y Getter
    
    /*Metodo "Getter" sirve para obtener el valor de sierta variable "Atributo" de alguna clase
     *apesar de que este encapsulada de manera privada "Modificador de acceso Private "
     */
    public int getTipRopa(){
        return tipRopa;
    }
    
    /*metodo "Setter" sirve para modificar y establecer un nuevo valor a una 
     *variable aunque se encuentere encapsulada de manera privada modificador 
     *de acceso "Private".*/
    public void setTipRopa(int tipRopa){
        this.tipRopa = tipRopa;
    }
}
