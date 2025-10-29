package uniquindio.edu.poo.model;


import java.util.ArrayList;
import java.util.List;

public class ActividadDeportiva {
    private String nombre;
    private String apellido;
    private int identificacion;
    private int telefono;
    private String actividadCardiovascular;
    private String maquinas;


    //VINCULACION CON ENUM
    private RutinasDeFuerza rutinasDeFuerza;
    private TipoDeMaquinas tipoDeMaquinas;


    //ASOCIACION
    private Usuario usuario;
    private Entrenadores entrenadores;

    private List<Membresia> listMembresiaDeLaActividadDeportiva;
    private List<ActividadDeportiva> listClasesDeActividadDeportivasDeportivas;



    public ActividadDeportiva(String nombre, String apellido,int identificacion, int telefono,RutinasDeFuerza rutinasDeFuerza, TipoDeMaquinas tipoDeMaquinas, Entrenadores entrenadores, TipoDeMaquinas tipoDeMaquinas) {

    this.nombre=nombre;
    this.apellido=apellido;
    this.identificacion=identificacion;
    this.telefono=telefono;
    this.actividadCardiovascular=actividadCardiovascular;
    this.maquinas=maquinas;
    this.rutinasDeFuerza=rutinasDeFuerza;
    this.usuario=usuario;
    this.listMembresiaDeLaActividadDeportiva=new ArrayList<>();
    this.entrenadores=entrenadores;
    this.listClasesDeActividadDeportivasDeportivas=new ArrayList<>();
    this.tipoDeMaquinas=tipoDeMaquinas;
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


    public Usuario getTheusuario() {
        return usuario;
    }

    public void setTheusuario(Usuario theusuario) {
        this.usuario = theusuario;
    }

    public RutinasDeFuerza getRutinasDeFuerza() {
        return rutinasDeFuerza;
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

    public TipoDeMaquinas getTipoDeMaquinas() {
        return tipoDeMaquinas;
    }

    public void setRutinasDeFuerza(RutinasDeFuerza rutinasDeFuerza) {
        this.rutinasDeFuerza = rutinasDeFuerza;
    }

    public void setTipoDeMaquinas(TipoDeMaquinas tipoDeMaquinas) {
        this.tipoDeMaquinas = tipoDeMaquinas;
    }

    @Override
    public String toString() {
        return "ActividadDeportiva{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", identificacion=" + identificacion +
                ", telefono=" + telefono +
                ", actividadDeFuerza='" + actividadDeFuerza + '\'' +
                ", actividadCardiovascular='" + actividadCardiovascular + '\'' +
                ", maquinas='" + maquinas + '\'' +
                ", descripcionEjercicios='" + descripcionEjercicios + '\'' +
                ", rutinasDeFuerza=" + rutinasDeFuerza +
                ", tipoDeMaquinas=" + tipoDeMaquinas +
                ", usuario=" + usuario +
                ", entrenadores=" + entrenadores +
                ", listMembresiaDeLaActividadDeportiva=" + listMembresiaDeLaActividadDeportiva +
                ", listClasesDeActividadDeportivasDeportivas=" + listClasesDeActividadDeportivasDeportivas +
                '}';
    }
}

