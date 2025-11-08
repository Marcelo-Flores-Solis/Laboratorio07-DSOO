public class Retiro extends Transaccion {

    public Retiro(Cuenta cuenta, Cliente cliente, Empleado empleado, double monto, String idTransaccion) {
        super(idTransaccion, monto, cuenta, empleado);
    }
    public Retiro(Cuenta cuenta, Cliente cliente, double monto, String idTransaccion) {
        super(idTransaccion, monto, cuenta);
    }
    @Override
    public String toString() {
        return "--- RETIRO ---" + super.toString();
    }
    public void procesar() {
        double saldoActual = cuenta.getSaldo();
        if (monto > saldoActual) {
            System.out.println("Error: Fondos insuficientes. Saldo actual: S/." + saldoActual);
        }
        cuenta.setSaldo(saldoActual - monto);
        toString();
    }
}
