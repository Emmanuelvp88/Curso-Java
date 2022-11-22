package video7_POO_This;


public class Area {
    private int base, altura, area;
    
    public Area( int base, int altura ){
        this.base = base;
        this.altura = altura;
        
    }
    
    public void Area(){
        area = base * altura;
    }
    public void ResutadoArea(){
        Area();
        System.out.println("El resultado de la area del rectangulo es: " + area);
    }
}
