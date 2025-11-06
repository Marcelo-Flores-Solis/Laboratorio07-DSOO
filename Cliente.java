import java.util.List;

public class Cliente extends Persona {
    private String idCliente;
    private String correo;
    private String estado;//activo, inactivo
    private List<Cuenta> cuentas;
    public Cliente(String nombre, String apellido, String dni, String telefono, String direccion, String idCliente, String correo, String estado) {
        super(nombre, apellido, dni, telefono, direccion);
        this.idCliente = idCliente;
        this.correo = correo;
        this.estado = estado; 
    }
    public void registrarCliente(){

    }
   public void actualizarDatos(String nuevoCorreo, String nuevaDireccion) {
        this.correo = nuevoCorreo;
        super.direccion = nuevaDireccion;
    }
    public List<Cuenta> consultarCuentas(){
        return this.cuentas;
    }
    ;
}
