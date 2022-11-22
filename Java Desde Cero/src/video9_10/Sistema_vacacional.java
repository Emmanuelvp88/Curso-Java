package video9_10;
import java.util.Scanner;

public class Sistema_vacacional {
    public static void main(String[] args) {
        
        String  nombre;
        int antiguedad,departamento;
        Scanner in = new Scanner(System.in);
        
        System.out.println("********Bienvenido al sistema vacacional de Coca Cola Company*******\n");
        System.out.println("                  *******Departamentos********");
        System.out.println("1.- Atencion a clientes.");
        System.out.println("2.- Logistica.");
        System.out.println("3.- Gerencia.\n");
        
        System.out.println("*¨Ingrese su nombre porfavor¨*");
        nombre = in.nextLine();
        System.out.println("Bienvenido " + nombre + " Ingrese su clave de deaprtamento");
        departamento = in.nextInt();
        System.out.println("Haora ingrese sus años de servicio");
        antiguedad = in.nextInt();
        
        if(departamento == 1){
            if(antiguedad == 1){
                System.out.println("El tarbajador " + nombre + " con " + antiguedad + " años de sevicio tiene derecho a 6 dias de vacaciones ");
            }else if(antiguedad >=2 && antiguedad <=6){
                System.out.println("El trabajador " + nombre + " con " + antiguedad + " años de servicio tiende derecho a 14 dias de vacaciones "); 
            }else if(antiguedad >= 7){
                  System.out.println("El trabajador " + nombre + " con  " + antiguedad + " años de servicio tiene derecho a 20 dias de vacaciones");      
            }
            
        }else if (departamento == 2){
            if(antiguedad == 1){
                System.out.println("El trabajador " + nombre  + " con " + antiguedad + " años de sevicio tiene derecho a 7 dias de vacaciones");
            }else if(antiguedad >=2 && antiguedad <= 6){
                System.out.println("El trabajador " + nombre + " con " + antiguedad + " años de servicio tiene derecho a 15 dias de vacaciones");
        }else if(antiguedad >= 7 ){
                System.out.println("El trabajador " +  nombre +  " con " + antiguedad +  " años de servicio tiene derecho a 21 dias de vacaciones ");
                }
            
        }else if (departamento == 3){
            if (antiguedad == 1 ){
                System.out.println("El trabajador " + nombre + " con " + antiguedad + " años de servicio tiene derecho a 10 dias de vacaciones ");
            }else if (antiguedad >= 2 && antiguedad <= 6){
                System.out.println("El trabajador " +  nombre + " con " +  antiguedad +  " años de seervicio tiene derecho a 20 dias de vacaciones");    
            }else if (antiguedad >=7){
                System.out.println("El trbajador " + nombre + " con " + antiguedad + " años de sevicio tiene derecho a 30 dias de vacaciones" );
            }
        }else {
            System.out.println("La clave de departamento seleccionada es incorrecta ");
        }
        
}
}