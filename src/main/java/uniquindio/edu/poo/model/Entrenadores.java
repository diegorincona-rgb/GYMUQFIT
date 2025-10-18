package uniquindio.edu.poo.model;

public class Entrenadores {
    private String nombre;
    private String Apellido;
    private String direccion;
    private String cargo;
    private String estado;
    private int identificacion;
    private int telefono;



public Entrenadores(String nombre, String apellido,  String direccion, String cargo, String estado, int identificacion, int telefono) {
    this.nombre = nombre;
    this.Apellido = apellido;
    this.direccion = direccion;
    this.cargo = cargo;
    this.estado = estado;
    this.identificacion = identificacion;
    this.telefono = telefono;

}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Entrenadores{" +
                "nombre='" + nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", cargo='" + cargo + '\'' +
                ", estado='" + estado + '\'' +
                ", identificacion=" + identificacion +
                ", telefono=" + telefono +
                '}';
    }
}
