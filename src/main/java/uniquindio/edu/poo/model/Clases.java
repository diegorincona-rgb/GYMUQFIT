package uniquindio.edu.poo.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Clases {
    private String nombre;
    private String apellido;
    private int identificacion;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;
    private LocalTime horaInicio;
    private LocalTime horaFinal;


    //ASOCIASION
    private Usuario usuario;
    private Entrenadores entrenadores;

    private List<Clases> listMembresiaParaLasClases;
    private List<ActividadDeportiva> listActividadDeportivasParaLasClases;


public Clases(String nombre, String apellido, int identificacion, LocalDate fechaInicio, LocalDate fechaFinal, LocalTime horaInicio, LocalTime horaFinal, Usuario usuario,Entrenadores entrenadores) {
    this.nombre=nombre;
    this.apellido=apellido;
    this.identificacion=identificacion;
    this.fechaInicio=fechaInicio;
    this.fechaFinal=fechaFinal;
    this.horaInicio=horaInicio;
    this.horaFinal=horaFinal;
    this.usuario=usuario;
    this.entrenadores=entrenadores;
    this.listMembresiaParaLasClases=new ArrayList<>();
    this.listActividadDeportivasParaLasClases=new ArrayList<>();

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

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(LocalTime horaFinal) {
        this.horaFinal = horaFinal;
    }

    public Usuario getUsuario(){return usuario;}

    public void setUsuario(Usuario usuario){this.usuario=usuario;}

    public List<Clases> getListMembresiaParaLasClases() {
        return listMembresiaParaLasClases;
    }

    public void setListMembresiaParaLasClases(List<Clases> listMembresiaParaLasClases) {
        this.listMembresiaParaLasClases = listMembresiaParaLasClases;
    }

    public Entrenadores getEntrenadores() {
        return entrenadores;
    }

    public void setEntrenadores(Entrenadores entrenadores) {
        this.entrenadores = entrenadores;
    }

    public List<ActividadDeportiva> getListActividadDeportivasParaLasClases() {
        return listActividadDeportivasParaLasClases;
    }

    public void setListActividadDeportivasParaLasClases(List<ActividadDeportiva> listActividadDeportivasParaLasClases) {
        this.listActividadDeportivasParaLasClases = listActividadDeportivasParaLasClases;
    }

    @Override
    public String toString() {
        return "Clases{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", identificacion=" + identificacion +
                ", fechaInicio=" + fechaInicio +
                ", fechaFinal=" + fechaFinal +
                ", horaInicio=" + horaInicio +
                ", horaFinal=" + horaFinal +
                '}';
    }
}
