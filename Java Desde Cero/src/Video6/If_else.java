package Video6;

public class If_else {
    
    public static void main(String[] args) {
        
    int biologia = 6, matematicas = 7, quimica = 8;
    int promedio = 0;
    promedio = (biologia + matematicas + quimica) /3;
       if (promedio >= 6){
           System.out.println("El alumno aprobo con. " + promedio);
       }else{
           System.out.println("El alumno reprobo con. " + promedio);
       }

    }

}
