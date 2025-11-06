public class Empleado extends Persona {
  private String idEmpleado;
  private String cargo;
public Empleado (String nombre, String apellido, String dni, String telefono, String direccion, String idEmpleado, String cargo) {
    super(nombre, apellido, dni, telefono, direccion);
    this.idEmpleado = idEmpleado;
    this.cargo = cargo;
}
public void procesarTransaccion(Transaccion transaccion){
        transaccion.procesar();
}
public void registrarCliente(Cliente cliente){
cliente.registrarCliente();
}
}
