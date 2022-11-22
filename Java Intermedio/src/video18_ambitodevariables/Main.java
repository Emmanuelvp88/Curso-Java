package video18_ambitodevariables;

public class Main {
    public static void main(String[] args) {
        /*Asi podemos mandar a llamar e imprimir una variable Statica, sin necesidad
         *de crear un objeto, solo con la misma clase como objeto y acontinuacion la variable*/
        System.out.println("Esta es una variable Estatica: " + Variables.estatica);
        
        /*Este objeto solo lo creamos para  mandar a imprimir a la variable Local.*/
        Variables Instancia = new Variables();
        Instancia.Funcion();
    }
}
