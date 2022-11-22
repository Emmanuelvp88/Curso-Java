package video6_POO_Suma;

public class Suma {
   private int num1,num2,resultado;
   
    public Suma(int num1,int num2){
        this.num1 = num1;
       this.num2 = num2;
        
       
    }
    public void Operaciones(){
        resultado = num1+num2;
    }
    public void Resultado(){
        Operaciones();
        System.out.println("El resultado de su suma es: "+ resultado);
    }
    
}
