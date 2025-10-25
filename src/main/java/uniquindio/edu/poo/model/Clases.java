package uniquindio.edu.poo.model;

import java.time.LocalDate;
import java.time.LocalTime;

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

public Clases(String nombre, String apellido, int identificacion, LocalDate fechaInicio, LocalDate fechaFinal, LocalTime horaInicio, LocalTime horaFinal, Usuario usuario) {
    this.nombre=nombre;
    this.apellido=apellido;
    this.identificacion=identificacion;
    this.fechaInicio=fechaInicio;
    this.fechaFinal=fechaFinal;
    this.horaInicio=horaInicio;
    this.horaFinal=horaFinal;
    this.usuario=usuario;
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
