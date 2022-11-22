package video18_ambitodevariables;


public class Variables {
    
    /*Variable de mabito Global, se puede ocupar dentro de toda una clase.
     *estas no se inicializan si no quieres.*/
    int global = 22;    
    
    /*Varible de ambito Statico, se puede ucuapar donde sea siempre y cuando sea invocada.
     *Para eso creamos una clase que contiene el metodo main para mandarla a llamar y demostrar 
    como esque se manda a imprimir las variables Staticas*/
    public static int estatica = 555;
    
    public void Funcion(){
        /*Variable de ambito local, solo se puede ocupar dentro de un metodo
         *estas se deven de inicializar forsozamente.*/
        int local = 34;
        System.out.println("Variable Local: " + local);
        
    }
}
