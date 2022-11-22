package video26_Constructores;

public class Main {
    public static void main(String args[]){
        
/*Aqui si tenemos que instanciar metodos mediante un objeto creado apartir de la clase que 
        *contiene la funcion como tal, e intanciamos los metodos creados en la clase. */        
        SinConstructor instancia = new SinConstructor();
        instancia.PedirNombre();
        instancia.Imprimir();
        System.out.println("");

/*En esta in stancia hacemos solo la creacion de un objeto que instanciara un metodo
        *que es el constructor y no Hace falta instanciarlo con ningun metodo de la calse
        *porque no tenemos metodos en esa clase ya que un constructor es el que se 
        *inicia primero y de manera automaticamente y una sola vez*/        
        ConConstructor mensajero = new ConConstructor();
    }
    
}
/*Que es un constructor?: En Java podemos definir un metodo que se ejucata
inicialmente y de manera automatica*/

/*Un constructor tiene las siguinetes carcteristicas.
.Tiene el mismo nombre de la clase
.Es el primer metodo que se ejecuta
.No puede retornar datos
.se ejecuta una unica vez
.Tiene por objetivos inicializar metodos y atributos'*/