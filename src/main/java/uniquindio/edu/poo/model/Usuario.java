package uniquindio.edu.poo.model;



public class Usuario {
    private String nombres;
    private String apellidos;
    private int identificacion;
    private String direccion;
    private String correo;
    private int telefono;


public Usuario(String nombres,String apellidos,int identificacion,String direccion,String correo,int telefono) {
    this.nombres=nombres;
    this.apellidos=apellidos;
    this.identificacion=identificacion;
    this.direccion=direccion;
    this.correo=correo;
    this.telefono=telefono;



    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", identificacion=" + identificacion +
                ", direccion='" + direccion + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}
