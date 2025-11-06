public class Persona {
    protected String dni;
    protected String nombre;
    protected String apellido;
    protected String direccion;
    protected String telefono;

public Persona(String nombre, String apellido, String dni,String telefono , String direccion) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.dni = dni;
    this.direccion = direccion;
    this.telefono = telefono;
} 
public String mostrarDatos() {
    return "Persona{" +
            "dni='" + dni + '\'' +
            ", nombre='" + nombre + '\'' +
            ", apellido='" + apellido + '\'' +
            ", direccion='" + direccion + '\'' +
            ", telefono='" + telefono + '\'' +
            '}';
}
}