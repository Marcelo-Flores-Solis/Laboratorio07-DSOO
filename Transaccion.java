import java.time.*;
public class Transaccion {
    //Atributos
    protected String idTransaccion;
    protected double monto;
    protected LocalDate fecha;
    protected Cuenta cuentaAsociada;
    protected Empleado empleadoResponsable;
    //Constructor
    public Transaccion(String idTransaccion, double monto, Cuenta cuentaAsociada, Empleado empleadoResponsable) {
        this.idTransaccion = idTransaccion;
        this.monto = monto;
        this.fecha = LocalDate.now();
        this.cuentaAsociada = cuentaAsociada;
        this.empleadoResponsable = empleadoResponsable;
    }
    public Transaccion(String idTransaccion, double monto, Cuenta cuentaAsociada) {
        this.idTransaccion = idTransaccion;
        this.monto = monto;
        this.fecha = LocalDate.now();
        this.cuentaAsociada = cuentaAsociada;
    }
    //Getters y Setters
    public String getIdTransaccion() { return idTransaccion; }
    public double getMonto() { return monto; }
    public LocalDate getFecha() { return fecha; }
    public Cuenta getCuentaAsociada() { return cuentaAsociada; }
    public Empleado getEmpleadoResponsable() { return empleadoResponsable; }

    public void setIdTransaccion(String idTransaccion) { this.idTransaccion = idTransaccion; }
    public void setMonto(double monto) { this.monto = monto; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }
    public void setCuentaAsociada(Cuenta cuentaAsociada) { this.cuentaAsociada = cuentaAsociada; }
    public void setEmpleadoResponsable(Empleado empleadoResponsable) { this.empleadoResponsable = empleadoResponsable; }
    //ToString
    @Override
    public String toString() {
        return "Transaccion{" +
                "idTransaccion='" + idTransaccion + '\'' +
                ", monto=" + monto +
                ", fecha=" + fecha +
                ", cuentaAsociada=" + cuentaAsociada +
                ", empleadoResponsable=" + empleadoResponsable +
                '}';
    }
    public void procesar() {
        // Lógica para procesar la transacción
    }
}