package uniquindio.edu.poo.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Clases {
    private String nombre;
    private int CupoMaximo;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFinalizacion;


    //ASOCIASION
    private List<Usuario> listusuarioParaClases;
    private Entrenadores entrenadores;

    private List<Clases> listMembresiaParaLasClases;
    private List<ActividadDeportiva> listActividadDeportivasParaLasClases;

    //INVOCACION ENUM
    private Tipo_Clases tipo_Clases;


public Clases(String nombre, int CupoMaximo, LocalDateTime fechaInicio, LocalDateTime fechaFinalizacion, Entrenadores entrenadores, Tipo_Clases tipo_Clases) {
    this.nombre=nombre;
    this.entrenadores=entrenadores;
    this.listMembresiaParaLasClases=new ArrayList<>();
    this.listActividadDeportivasParaLasClases=new ArrayList<>();
    this.tipo_Clases = tipo_Clases;
    this.CupoMaximo=CupoMaximo;
    this.fechaInicio=fechaInicio;
    this.fechaFinalizacion=fechaFinalizacion;
    this.listusuarioParaClases=new ArrayList<>();

}

    public List<Usuario> getListusuarioParaClases() {
        return listusuarioParaClases;
    }

    public void setListusuarioParaClases(List<Usuario> listusuarioParaClases) {
        this.listusuarioParaClases = listusuarioParaClases;
    }

    public void setTipo_Clases(Tipo_Clases tipo_Clases) {
        this.tipo_Clases = tipo_Clases;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCupoMaximo() {
        return CupoMaximo;
    }

    public void setCupoMaximo(int cupoMaximo) {
        CupoMaximo = cupoMaximo;
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDateTime getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(LocalDateTime fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }


    public Entrenadores getEntrenadores() {
        return entrenadores;
    }

    public void setEntrenadores(Entrenadores entrenadores) {
        this.entrenadores = entrenadores;
    }

    public List<Clases> getListMembresiaParaLasClases() {
        return listMembresiaParaLasClases;
    }

    public void setListMembresiaParaLasClases(List<Clases> listMembresiaParaLasClases) {
        this.listMembresiaParaLasClases = listMembresiaParaLasClases;
    }

    public List<ActividadDeportiva> getListActividadDeportivasParaLasClases() {
        return listActividadDeportivasParaLasClases;
    }

    public void setListActividadDeportivasParaLasClases(List<ActividadDeportiva> listActividadDeportivasParaLasClases) {
        this.listActividadDeportivasParaLasClases = listActividadDeportivasParaLasClases;
    }

    public Tipo_Clases getTipo_Clases() {
        return tipo_Clases;
    }

    public void setTipoClases_(Tipo_Clases tipoClases_) {
        this.tipo_Clases = tipoClases_;
    }
}
