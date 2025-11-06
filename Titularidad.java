import java.time.LocalDate;

public class Titularidad {
    private String tipo;
    private LocalDate fecha;
    private Cuenta cuenta;
    private Cliente titular;
    //asignar titular
    public void asignarTitular(Cliente cliente, Cuenta cuenta) {
        if (this.cuenta == null) setCuenta(cuenta);
        else System.out.println("Esta instancia ya tiene una cuenta relacionada");
        if (this.titular == null) setTitular(cliente);
        else System.out.println("Esta instancia ya tiene un titular relacionado");
    }
    //constructores
    public Titularidad(String tipo) {
        setTipo(tipo);
        this.fecha = LocalDate.now();
    }
    public Titularidad(String tipo, Cuenta cuenta, Cliente titular) {
        setTipo(tipo);
        this.fecha = LocalDate.now();
        asignarTitular(titular, cuenta);
    }
    //Getters y Setters
    public String getTipo() { return tipo; }
    public LocalDate getFecha() { return fecha; }
    public Cuenta getCuenta() { return cuenta; }
    public Cliente getTitular() { return titular; }
    public void setTipo(String tipo) { if (tipo != "") this.tipo = tipo; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }
    public void setCuenta(Cuenta cuenta) { this.cuenta = cuenta; }
    public void setTitular(Cliente titular) { this.titular = titular; }
    @Override
    public String toString() {
        return "Titularidad [tipo=" + tipo + ", fecha=" + fecha + ", cuenta=" + cuenta + ", titular=" + titular + "]";
    }
}