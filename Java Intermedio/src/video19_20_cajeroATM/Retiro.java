package video19_20_cajeroATM;

public class Retiro extends Padre {

    @Override
    public void Transacciones() {
        System.out.println("------------------------------------------------------");
        System.out.println("Cuanto desea retirar?");
        System.out.println("------------------------------------------------------");

        Retiro();
        if (getSaldo() >= retiro) {
            setSaldo(getSaldo() - retiro);
            System.out.println("------------------------------------");
            System.out.println("Has retirado: " + retiro);
            System.out.println("Tu saldo actula es: " + getSaldo());
            System.out.println("---------------------------------------");
        } else {
            System.out.println("------------------------------------------------------");
            System.out.println("El saldo es insuficiente, digite otra cantidad.");
            System.out.println("------------------------------------------------------");

        }

    }
}
