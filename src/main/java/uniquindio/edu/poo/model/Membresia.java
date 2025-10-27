package uniquindio.edu.poo.model;

import java.time.LocalDate;
import java.util.List;

public class Membresia {

    private String tipoMembresia;
    private String estadoMembresia;
    private double costoMembresia;
    private LocalDate fechadeInicioMembresia;
    private LocalDate fechaVencimientoMembresia;

    //ASOSIACION

    private Usuario usuario;
    private Clases classes;
    private Entrenadores entrenadores;
    private ActividadDeportiva actividadDeportiva;


    public Membresia(String tipoMembresia, String estadoMembresia, double costoMembresia, LocalDate fehcaInicioMembresia, LocalDate fechaVencimientoMembresia, Usuario usuario, Clases classes, Entrenadores entrenadores, ActividadDeportiva actividadDeportiva) {
        this.tipoMembresia = tipoMembresia;
        this.estadoMembresia=estadoMembresia;
        this.costoMembresia=costoMembresia;
        this.fechadeInicioMembresia=fehcaInicioMembresia;
        this.fechaVencimientoMembresia=fechaVencimientoMembresia;
        this.usuario=usuario;
        this.classes=classes;
        this.entrenadores=entrenadores;
        this.actividadDeportiva=actividadDeportiva;




    }



    @Override
    public String toString() {
        return "Membresia{" +
                "tipoMembresia='" + tipoMembresia + '\'' +
                ", estadoMembresia='" + estadoMembresia + '\'' +
                ", costoMembresia=" + costoMembresia +
                ", fechadeInciioMembresia=" + fechadeInicioMembresia +
                ", fechaVencimientoMembresia=" + fechaVencimientoMembresia +
                '}';
    }

    public String getTipoMembresia() {
        return tipoMembresia;
    }

    public void setTipoMembresia(String tipoMembresia) {
        this.tipoMembresia = tipoMembresia;
    }

    public String getEstadoMembresia() {
        return estadoMembresia;
    }

    public void setEstadoMembresia(String estadoMembresia) {
        this.estadoMembresia = estadoMembresia;
    }

    public double getCostoMembresia() {
        return costoMembresia;
    }

    public void setCostoMembresia(double costoMembresia) {
        this.costoMembresia = costoMembresia;
    }

    public LocalDate getFechadeInicioMembresia() {
        return fechadeInicioMembresia;
    }

    public void setFechadeInicioMembresia(LocalDate fechadeInciioMembresia) {
        this.fechadeInicioMembresia = fechadeInciioMembresia;
    }

    public LocalDate getFechaVencimientoMembresia() {
        return fechaVencimientoMembresia;
    }

    public void setFechaVencimientoMembresia(LocalDate fechaVencimientoMembresia) {
        this.fechaVencimientoMembresia = fechaVencimientoMembresia;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ActividadDeportiva getActividadDeportiva() {
        return actividadDeportiva;
    }

    public void setActividadDeportiva(ActividadDeportiva actividadDeportiva) {
        this.actividadDeportiva = actividadDeportiva;
    }

    public Clases getClasses() {
        return classes;
    }

    public void setClasses(Clases classes) {
        this.classes = classes;
    }

    public Entrenadores getEntrenadores() {
        return entrenadores;
    }

    public void setEntrenadores(Entrenadores entrenadores) {
        this.entrenadores = entrenadores;
    }
}

