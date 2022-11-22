package video19_20_cajeroATM;

import java.util.Scanner;

public abstract class Padre {

    private static int saldo;
    protected int deposito, retiro, operacion;
    Scanner in = new Scanner(System.in);

    public void Operaciones() {
        int bandera = 0;
        do {
            System.out.println("********Binvenido al Cajero ATM********\n");
            System.out.println("¿Que Operacion desea Realizar?\n");
            System.out.println("1.- Consulta de Saldo.");
            System.out.println("2.- Retiro de Efectivo.");
            System.out.println("3.- Deposito de Efectivo.");
            System.out.println("4.- Salir.");
            operacion = in.nextInt();

            if (operacion >= 1 && operacion <= 4) {
                if (operacion == 1) {
                    Padre instacia = new Consulta();
                    instacia.Transacciones();
                }
                if (operacion == 2) {
                    Padre instacia = new Retiro();
                    instacia.Transacciones();
                }
                if (operacion == 3) {
                    Padre instacia = new Deposito();
                    instacia.Transacciones();
                }
                if (operacion == 4) {
                    System.out.println("-----------------------------------------------");
                    System.out.println("Gracias Fue un placer atenderle, vuelva pronto.");
                    System.out.println("-----------------------------------------------");

                    bandera = 2;
                }
            } else {
                System.out.println("----------------------------------------------");
                System.out.println("La seleccion no existe, vuelva a seleccionar.");
                System.out.println("-----------------------------------------------");
            }
        } while (bandera == 0);
    }

    public abstract void Transacciones();

    public void Deposito() {
        deposito = in.nextInt();
    }

    public void Retiro() {
        retiro = in.nextInt();
    }

    public void Consulta() {
        System.out.println("-------------------------------");
        System.out.println("El saldo actual es: " + saldo);
        System.out.println("-------------------------------");

    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

}
