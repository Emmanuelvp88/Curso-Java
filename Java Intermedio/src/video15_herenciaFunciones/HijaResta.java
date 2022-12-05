package video15_herenciaFunciones;

public class HijaResta extends Padre {//heredamos la clase "Padre"
/*la  herencia se hace mediante la palabra "extends" y permite que una clase herede los
    metodos y atributos de alguna otra clase*/
    
    public void Resta() {
        //estos atrubutos fueron heredados de la clase "Padre"
        resultado = valor1 - valor2;
    }
}
