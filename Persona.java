public class Persona {
    protected String dni;
    protected String nombre;
    protected String apellido;

public Persona(String nombre, String apellido, String dni) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.dni = dni;
} 
public String mostrarDatos() {
    return "Persona{" +
            "dni='" + dni + '\'' +
            ", nombre='" + nombre + '\'' +
            ", apellido='" + apellido + '\'' +
            '}';
}
}