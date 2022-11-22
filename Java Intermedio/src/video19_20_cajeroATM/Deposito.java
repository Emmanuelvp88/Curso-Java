package video19_20_cajeroATM;

public class Deposito extends Padre {

    @Override
    public void Transacciones() {
        System.out.println("---------------------------------------");
        System.out.println("Su saldo actual es: " + getSaldo());
        System.out.println("Cuanto desea depositar? ");
        Deposito();
        setSaldo(getSaldo() + deposito);
        System.out.println("Su saldo actual es de: " + getSaldo());
        System.out.println("----------------------------------------");
    }
}
