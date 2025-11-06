public class Cuenta {
    private Cliente propietario;
    private String numero;
    private double saldo;
    private String tipo;
    
    // Constructor con referencia al propietario
    public Cuenta(Cliente propietario, String numero, String tipo) {
        this.propietario = propietario;
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = 0.0;
    }
    public void consultarSaldo() {
        System.out.println("Saldo: " + this.saldo);
    }

    //Setters y Getters
    public void setPropietario(Cliente propietario) {    this.propietario = propietario;}
    public void setNumero(String numero) {    this.numero = numero;}
    public void setSaldo(double saldo) {    this.saldo = saldo;}
    public void setTipo(String tipo) {    this.tipo = tipo;}
    public Cliente getPropietario() {    return propietario;}
    public String getNumero() {    return numero;}
    public double getSaldo() {  return saldo;}
    public String getTipo() {    return tipo;}
}
