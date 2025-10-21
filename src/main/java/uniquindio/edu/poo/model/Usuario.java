package uniquindio.edu.poo.model;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {
    private String nombres;
    private String apellidos;
    private int identificacion;
    private String direccion;
    private String correo;
    private int telefono;
    private int edad;
    private LocalDate fechaNacimiento;

    //VINCULACION CON ENUM
    private RutinasDeFuerza rutinasDeFuerza;


    //ASOCIASION

    private List<ActividadDeportiva> listActividadDeportivaUsuario;




public Usuario(String nombres,String apellidos,int identificacion,String direccion,String correo,int telefono,int edad, LocalDate fechaNacimiento, RutinasDeFuerza rutinasDeFuerza) {
    this.nombres=nombres;
    this.apellidos=apellidos;
    this.identificacion=identificacion;
    this.direccion=direccion;
    this.correo=correo;
    this.telefono=telefono;
    this.edad=edad;
    this.fechaNacimiento=fechaNacimiento;
    this.rutinasDeFuerza=rutinasDeFuerza;
    this.listActividadDeportivaUsuario=new ArrayList<>();


    }


    public abstract double calcularMedidas();



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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public List<ActividadDeportiva> getListActividadDeportivaUsuario() {
        return listActividadDeportivaUsuario;
    }

    public void setListActividadDeportivaUsuario(List<ActividadDeportiva> listActividadDeportivaUsuario) {
        this.listActividadDeportivaUsuario = listActividadDeportivaUsuario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public RutinasDeFuerza getRutinasDeFuerza() {
        return rutinasDeFuerza;
    }

    public void setRutinasDeFuerza(RutinasDeFuerza rutinasDeFuerza) {
        this.rutinasDeFuerza = rutinasDeFuerza;
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
                ", edad=" + edad +
                ", fechaNacimiento=" + fechaNacimiento +
                ", rutinasDeFuerza=" + rutinasDeFuerza +
                ", listActividadDeportivaUsuario=" + listActividadDeportivaUsuario +
                '}';
    }

}


