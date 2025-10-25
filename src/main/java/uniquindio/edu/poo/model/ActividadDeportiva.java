package uniquindio.edu.poo.model;


import java.util.ArrayList;
import java.util.List;

public class ActividadDeportiva {
    private String nombre;
    private String apellido;
    private int identificacion;
    private int telefono;
    private String actividadDeFuerza;
    private String actividadCardiovascular;
    private String maquinas;
    private String descripcionEjercicios;

    //VINCULACION CON ENUM
    private RutinasDeFuerza rutinasDeFuerza;


    //ASOCIACION
    private Usuario usuario;
    private Entrenadores entrenadores;

    private List<Membresia> listMembresiaDeLaActividadDeportiva;
    private List<ActividadDeportiva> listClasesDeActividadDeportivasDeportivas;



    public ActividadDeportiva(String nombre, String apellido,int identificacion, int telefono, String actividadDeFuerza, String actividadCardiovascular, String maquinas, String descripcionEjercicios,RutinasDeFuerza rutinasDeFuerza ,Usuario usuario, Entrenadores entrenadores) {

    this.nombre=nombre;
    this.apellido=apellido;
    this.identificacion=identificacion;
    this.telefono=telefono;
    this.actividadDeFuerza=actividadDeFuerza;
    this.actividadCardiovascular=actividadCardiovascular;
    this.maquinas=maquinas;
    this.descripcionEjercicios=descripcionEjercicios;
    this.rutinasDeFuerza=rutinasDeFuerza;
    this.usuario=usuario;
    this.listMembresiaDeLaActividadDeportiva=new ArrayList<>();
    this.entrenadores=entrenadores;
    this.listClasesDeActividadDeportivasDeportivas=new ArrayList<>();
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getActividadDeFuerza() {
        return actividadDeFuerza;
    }

    public void setActividadDeFuerza(String actividadDeFuerza) {
        this.actividadDeFuerza = actividadDeFuerza;
    }

    public String getActividadCardiovascular() {
        return actividadCardiovascular;
    }

    public void setActividadCardiovascular(String actividadCardiovascular) {
        this.actividadCardiovascular = actividadCardiovascular;
    }

    public String getMaquinas() {
        return maquinas;
    }

    public void setMaquinas(String maquinas) {
        this.maquinas = maquinas;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Membresia> getListMembresiaDeLaActividadDeportiva() {
        return listMembresiaDeLaActividadDeportiva;
    }

    public void setListMembresiaDeLaActividadDeportiva(List<Membresia> listMembresiaDeLaActividadDeportiva) {
        this.listMembresiaDeLaActividadDeportiva = listMembresiaDeLaActividadDeportiva;
    }

    public String getDescripcionEjercicios() {
        return descripcionEjercicios;
    }

    public void setDescripcionEjercicios(String descripcionEjercicios) {
        this.descripcionEjercicios = descripcionEjercicios;
    }

    public Usuario getTheusuario() {
        return usuario;
    }

    public void setTheusuario(Usuario theusuario) {
        this.usuario = theusuario;
    }

    public RutinasDeFuerza getRutinasDeFuerza() {
        return rutinasDeFuerza;
    }

    public void setRutinasDeFuerza(RutinasDeFuerza rutinasDeFuerza) {
        this.rutinasDeFuerza = rutinasDeFuerza;
    }

    public Entrenadores getEntrenadores() {
        return entrenadores;
    }

    public void setEntrenadores(Entrenadores entrenadores) {
        this.entrenadores = entrenadores;
    }

    public List<ActividadDeportiva> getListClasesDeActividadDeportivasDeportivas() {
        return listClasesDeActividadDeportivasDeportivas;
    }

    public void setListClasesDeActividadDeportivasDeportivas(List<ActividadDeportiva> listClasesDeActividadDeportivasDeportivas) {
        this.listClasesDeActividadDeportivasDeportivas = listClasesDeActividadDeportivasDeportivas;
    }

    @Override
    public String toString() {
        return "ActividadDeportiva{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", actividadDeFuerza='" + actividadDeFuerza + '\'' +
                ", actividadCardiovascular='" + actividadCardiovascular + '\'' +
                ", maquinas='" + maquinas + '\'' +
                ", identificacion=" + identificacion +
                ", telefono=" + telefono +
                ", descripcionEjercicios='" + descripcionEjercicios + '\'' +
                ", rutinasDeFuerza=" + rutinasDeFuerza +
                ", theusuario=" + usuario +
                '}';
    }



}

